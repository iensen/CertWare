package net.certware.argument.sfp.util;

import java.util.Vector;

import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.core.ui.log.CertWareLog;

/**
 * Sparse multi-graph.  
 * @author nachi, original for TTU applications
 * @author mrb, migration to Eclipse for CertWare; refactored to eliminate static references
 * @since 1.0.3
 */
public class Graph {
	/** vertex count */
	private int vertexCount;
	/** edge count */
	private int edgeCount;
	/** whether the graph is directed */
	private boolean digraph;
	/** whether the edge addition was clean */
	private boolean edgeInsertionClean;
	/** adjacency vector */
	Vector adjacency;

	/**
	 * Sets graph vertex count to argument; sets edge count to zero. Allocates
	 * array vector to vertex count plus one.
	 * Sets clean flag to true;
	 * @param vc vertex count
	 * @param flag true if digraph
	 */
	public Graph(int vc, boolean flag) {
		vertexCount = vc;
		edgeCount = 0;
		digraph = flag;
		edgeInsertionClean = true;
		allocateElements(vc + 1);
	}

	private void allocateElements(int n) {
		adjacency = new Vector();
		for (int i = 0; i < n; i++)
			adjacency.addElement(new Vector());
	}

	public void addArc(int i, int j) {
		((Vector) adjacency.elementAt(i)).addElement(new Integer(j));
	}

	public Vector neighbors(int i) {
		return (Vector) ((Vector) adjacency.elementAt(i)).clone();
	}

	int getVertexCount() {
		return vertexCount;
	}

	int getEdgeCount() {
		return edgeCount;
	}

	boolean isDirected() {
		return digraph;
	}

	/**
	 * Insert statement.
	 * Traps arc addition exceptions and writes to CertWare log.
	 * @param s statement 
	 */
	public void insert(Statement s) {
		try {
			// statement identifier
			int statementNumber = Integer.parseInt( s.getId() );
			
			// get the statement's justification list, if numerical references
			// add an arc from the statement node to the justification reference number
			// catches number format exceptions, logs them, moves on
			for ( Justification j : s.getJustification().getJustifications() ) {
				
				try { 
					// reference numeral
					if ( j.getNumeral() != null && j.getNumeral().isEmpty() == false ) {
						int n = Integer.parseInt( j.getNumeral() );
						addArc(statementNumber, n);
					} else 
						// assertion
						if ( j.getAssertion() != null && j.getAssertion().getText().isEmpty() == false) {
							continue;
					} else {
						// entailment
						String tail = j.getEntailment().getTail();
						if ( tail != null ) {
							int n = Integer.parseInt( tail );
							addArc(statementNumber, n);
						} else {
							CertWareLog.logWarning(
									String.format("Entailment tail found null for statement %s",
									s.getStatement() ));
							edgeInsertionClean = false;
						}
					}

				} catch( NumberFormatException nfe ) {
					CertWareLog.logWarning(
							String.format("Integer parse error for statement %s",
							s.getStatement() ));
					edgeInsertionClean = false;
				}
			} // for
		} catch (Exception e) {
			CertWareLog.logError(
					String.format("Graph insertion error for statement %s",
					s.getStatement() ),
					e);
			edgeInsertionClean = false;
		}
	}

	/**
	 * Whether the edge insertions were clean, without warnings or errors.
	 * @return {@code edgeInsertionClean} flag value, true if clean
	 */
	public boolean isClean() {
		return edgeInsertionClean;
	}
	
	
	/**
	 * Private counters for DFS search
	 * @author nachi
	 */
	private class CountPair {
		int count1, count2;

		/**
		 * Increment count 1.
		 * @return count 1 incremented by 1
		 */
		int inc1() {
			return ++count1;
		} 

		/**
		 * Increment count 2.
		 * @return count 2 incremented by 1
		 */
		int inc2() {
			return ++count2;
		}

	};

	/**
	 * Depth-first search on graph execution.
	 * @param v vertex to start
	 * @param preOrder pre-order array
	 * @param postOrder post-order array
	 * @param countPair counters
	 */
	private void doDFS(int v, int[] preOrder, int[] postOrder, CountPair countPair) {
		preOrder[v] = countPair.inc1();

		Vector neighbors = neighbors(v);

		for (int i = 0; i < neighbors.size(); i++) {
			int u = ((Integer) neighbors.elementAt(i)).intValue();

			if (preOrder[u] == 0) // Have we not seen vertex u before?
			{
				doDFS(u, preOrder, postOrder, countPair);
			}
		}

		postOrder[v] = countPair.inc2();
		return;
	}

	/**
	 * Depth-first search on graph, setup and execute.
	 * @param v starting vertex
	 * @param preOrder pre-order array
	 * @param postOrder post-order array
	 * @return post-order array value at vertex
	 */
	public int DFS(int v, int[] preOrder, int[] postOrder) {

		int n = getVertexCount();

		for (int i = 0; i < n; i++) {
			preOrder[i] = postOrder[i] = 0;
		}

		// returns number of nodes reached
		CountPair cnt = new CountPair();
		doDFS(v, preOrder, postOrder, cnt);
		return postOrder[v];
	}

	/**
	 * Whether the graph is acyclic.
	 * Sets incoming message to null, but if cycle found loads it with message identifying cycle.
	 * See {@code SemiFormalProofJavaValidator} for companion marker generation for validation.
	 * @param message returned message for cycle identification, valid only if return value is false
	 * @return true if graph is acyclic
	 */
	public boolean isAcyclic(String message)
	{
		int vertexCount = getVertexCount();
		int[] preOrder = new int[vertexCount];
		int[] postOrder = new int[vertexCount];
		boolean[] span = new boolean[vertexCount];
		message = null;

		for (int i = 1; i < vertexCount; i++) { // check if any vertex is on a cycle

			if (span[i]) {
				continue; // try next component
			}

			int count = DFS(i, preOrder, postOrder);

			for (int j = 1; j < vertexCount; j++) {

				if (preOrder[j] > 0) {
					span[j] = true;
				}
				else {
					continue;
				}

				Vector neighbors = neighbors(j);

				for (int k = 0; k < neighbors.size(); k++) {
					int u = ((Integer) neighbors.elementAt(k)).intValue();

					if (postOrder[u] >= postOrder[j]) {
						message = String.format("%s %d and %d",
								"A cycle exists between proof statements", 
								postOrder[u], 
								postOrder[j]);
						return false; 
					}

					// note: PostOrder[u] > 0 since u is reachable from j
				} // for
			}

			if (count == vertexCount) {
				break; // all vertices spanned
			}
		}

		return true;
	}

	
	/**
	 * Insert object. 
	 * @param infObj
	 */
	/*
	void insert(Inference infObj) {
		try {
			int v = infObj.number;
			for (int i = 0; i < infObj.arrayofnumbers.length; i++) {
				int w = infObj.arrayofnumbers[i];
				addArc(v, w);
			}
			if (infObj.entailmentHead.length > 0) {
				addArc(v, infObj.entailmentTail);
			}
		} catch (Exception e) {
			// System.out.println("Exception" + e.getMessage());
			CertWareLog.logError("Argument graph validation", e);
		}
	}
	*/

}


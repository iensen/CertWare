package net.certware.argument.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * Rectangle figure with expanded text wrapping region for children.
 * @author mrb
 * @since 1.0.3
 */
public class ExpandedBodyRectangleFigure extends RectangleFigure {

	/**
	 * Assumes there are at least two {@code WrappingLabel} children, the first
	 * is the top label (title) and the second is to be expanded to consume the 
	 * remainder of the figure region.
	 * @param graphics graphics context
	 * @param widthMargin pixels of east-west margin
	 */
	public void setTextPositions(Graphics graphics, int widthMargin) {
		
	    // move the label to the top left of the figure
	    WrappingLabel label = (WrappingLabel) getChildren().get(0);
	    label.setAlignment( PositionConstants.TOP | PositionConstants.LEFT );
	    label.setTextWrap(true);
	    label.paint(graphics);

	    // expand the body
	    if ( getChildren().size() > 1 ) {
	    	WrappingLabel body = (WrappingLabel)getChildren().get(1);
	        body.setAlignment(PositionConstants.LEFT);
	        body.setTextWrap(true);
	        LayoutUtil.allocateRegion(body, this, graphics, label.getBounds().height, widthMargin );
	        body.paint(graphics);
	    }
		
	}

}
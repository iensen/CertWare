/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.eur.parts.CriteriaPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.providers.EurMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class CriteriaPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CriteriaPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable assumption;
	protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public CriteriaPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CriteriaPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence criteriaStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = criteriaStep.addStep(EurViewsRepository.Criteria.Properties.class);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.identifier);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.description);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.content);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.isTagged);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.context);
		propertiesStep.addStep(EurViewsRepository.Criteria.Properties.assumption);
		
		
		composer = new PartComposer(criteriaStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EurViewsRepository.Criteria.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.identifier) {
					return createIdentifierText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.context) {
					return createContextReferencesTable(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Criteria.Properties.assumption) {
					return createAssumptionReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EurMessages.CriteriaPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EurViewsRepository.Criteria.Properties.identifier, EurMessages.CriteriaPropertiesEditionPart_IdentifierLabel);
		identifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		identifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CriteriaPropertiesEditionPartForm.this,
							EurViewsRepository.Criteria.Properties.identifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									EurViewsRepository.Criteria.Properties.identifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, identifier.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		identifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, EurViewsRepository.Criteria.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.identifier, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EurViewsRepository.Criteria.Properties.description, EurMessages.CriteriaPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CriteriaPropertiesEditionPartForm.this,
							EurViewsRepository.Criteria.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									EurViewsRepository.Criteria.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, EurViewsRepository.Criteria.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.description, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EurViewsRepository.Criteria.Properties.content, EurMessages.CriteriaPropertiesEditionPart_ContentLabel);
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CriteriaPropertiesEditionPartForm.this,
							EurViewsRepository.Criteria.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									EurViewsRepository.Criteria.Properties.content,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, content.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CriteriaPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, EurViewsRepository.Criteria.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.content, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(getDescription(EurViewsRepository.Criteria.Properties.isTagged, EurMessages.CriteriaPropertiesEditionPart_IsTaggedLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.isTagged, EurViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Criteria.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createIsTaggedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createContextReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.context = new ReferencesTable(getDescription(EurViewsRepository.Criteria.Properties.context, EurMessages.CriteriaPropertiesEditionPart_ContextLabel), new ReferencesTableListener	() {
			public void handleAdd() { addContext(); }
			public void handleEdit(EObject element) { editContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.context, EurViewsRepository.FORM_KIND));
		this.context.createControls(parent, widgetFactory);
		this.context.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.disableMove();
		context.setID(EurViewsRepository.Criteria.Properties.context);
		context.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createContextReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addContext() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(context.getInput(), contextFilters, contextBusinessFilters,
		"context", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.context,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				context.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContext(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		context.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		context.refresh();
	}

	/**
	 * 
	 */
	protected void editContext(EObject element) {
		EObjectPropertiesEditionContext rcontext = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(rcontext);
			if (policy != null) {
				policy.execute();
				context.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createAssumptionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.assumption = new ReferencesTable(getDescription(EurViewsRepository.Criteria.Properties.assumption, EurMessages.CriteriaPropertiesEditionPart_AssumptionLabel), new ReferencesTableListener	() {
			public void handleAdd() { addAssumption(); }
			public void handleEdit(EObject element) { editAssumption(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAssumption(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAssumption(element); }
			public void navigateTo(EObject element) { }
		});
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.Properties.assumption, EurViewsRepository.FORM_KIND));
		this.assumption.createControls(parent, widgetFactory);
		this.assumption.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.disableMove();
		assumption.setID(EurViewsRepository.Criteria.Properties.assumption);
		assumption.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createAssumptionReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addAssumption() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(assumption.getInput(), assumptionFilters, assumptionBusinessFilters,
		"assumption", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.assumption,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				assumption.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAssumption(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		assumption.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAssumption(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartForm.this, EurViewsRepository.Criteria.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		assumption.refresh();
	}

	/**
	 * 
	 */
	protected void editAssumption(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				assumption.refresh();
			}
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.isTagged);
		if (eefElementEditorReadOnlyState && isTagged.isEnabled()) {
			isTagged.setEnabled(false);
			isTagged.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isTagged.isEnabled()) {
			isTagged.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContext(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		context.setContentProvider(contentProvider);
		context.setInput(settings);
		contextBusinessFilters.clear();
		contextFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.context);
		if (eefElementEditorReadOnlyState && context.getTable().isEnabled()) {
			context.setEnabled(false);
			context.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !context.getTable().isEnabled()) {
			context.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateContext()
	 * 
	 */
	public void updateContext() {
	context.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return ((ReferencesTableSettings)context.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initAssumption(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAssumption(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		assumption.setContentProvider(contentProvider);
		assumption.setInput(settings);
		assumptionBusinessFilters.clear();
		assumptionFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(EurViewsRepository.Criteria.Properties.assumption);
		if (eefElementEditorReadOnlyState && assumption.getTable().isEnabled()) {
			assumption.setEnabled(false);
			assumption.setToolTipText(EurMessages.Criteria_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assumption.getTable().isEnabled()) {
			assumption.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateAssumption()
	 * 
	 */
	public void updateAssumption() {
	assumption.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return ((ReferencesTableSettings)assumption.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Criteria_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 Kestrel Technology LLC (generated models) 
 */
package net.certware.argument.arm.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.certware.argument.arm.util.ArmAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArmItemProviderAdapterFactory extends ArmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 Kestrel Technology LLC (generated models) "; //$NON-NLS-1$

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.TaggedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedValueItemProvider taggedValueItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaggedValueAdapter() {
		if (taggedValueItemProvider == null) {
			taggedValueItemProvider = new TaggedValueItemProvider(this);
		}

		return taggedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter() {
		if (argumentItemProvider == null) {
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.AssertedInference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedInferenceItemProvider assertedInferenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedInferenceAdapter() {
		if (assertedInferenceItemProvider == null) {
			assertedInferenceItemProvider = new AssertedInferenceItemProvider(this);
		}

		return assertedInferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.AssertedEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedEvidenceItemProvider assertedEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.AssertedEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedEvidenceAdapter() {
		if (assertedEvidenceItemProvider == null) {
			assertedEvidenceItemProvider = new AssertedEvidenceItemProvider(this);
		}

		return assertedEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.AssertedContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedContextItemProvider assertedContextItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.AssertedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedContextAdapter() {
		if (assertedContextItemProvider == null) {
			assertedContextItemProvider = new AssertedContextItemProvider(this);
		}

		return assertedContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.AssertedCounterEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedCounterEvidenceItemProvider assertedCounterEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.AssertedCounterEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedCounterEvidenceAdapter() {
		if (assertedCounterEvidenceItemProvider == null) {
			assertedCounterEvidenceItemProvider = new AssertedCounterEvidenceItemProvider(this);
		}

		return assertedCounterEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.AssertedChallenge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedChallengeItemProvider assertedChallengeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.AssertedChallenge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedChallengeAdapter() {
		if (assertedChallengeItemProvider == null) {
			assertedChallengeItemProvider = new AssertedChallengeItemProvider(this);
		}

		return assertedChallengeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.Claim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemProvider claimItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.Claim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaimAdapter() {
		if (claimItemProvider == null) {
			claimItemProvider = new ClaimItemProvider(this);
		}

		return claimItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.EvidenceAssertion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceAssertionItemProvider evidenceAssertionItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.EvidenceAssertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvidenceAssertionAdapter() {
		if (evidenceAssertionItemProvider == null) {
			evidenceAssertionItemProvider = new EvidenceAssertionItemProvider(this);
		}

		return evidenceAssertionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.InformationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationElementItemProvider informationElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.InformationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationElementAdapter() {
		if (informationElementItemProvider == null) {
			informationElementItemProvider = new InformationElementItemProvider(this);
		}

		return informationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.ArgumentReasoning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningItemProvider argumentReasoningItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.ArgumentReasoning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentReasoningAdapter() {
		if (argumentReasoningItemProvider == null) {
			argumentReasoningItemProvider = new ArgumentReasoningItemProvider(this);
		}

		return argumentReasoningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.arm.CitationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationElementItemProvider citationElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.arm.CitationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCitationElementAdapter() {
		if (citationElementItemProvider == null) {
			citationElementItemProvider = new CitationElementItemProvider(this);
		}

		return citationElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (taggedValueItemProvider != null) taggedValueItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (assertedInferenceItemProvider != null) assertedInferenceItemProvider.dispose();
		if (assertedEvidenceItemProvider != null) assertedEvidenceItemProvider.dispose();
		if (assertedContextItemProvider != null) assertedContextItemProvider.dispose();
		if (assertedCounterEvidenceItemProvider != null) assertedCounterEvidenceItemProvider.dispose();
		if (assertedChallengeItemProvider != null) assertedChallengeItemProvider.dispose();
		if (claimItemProvider != null) claimItemProvider.dispose();
		if (evidenceAssertionItemProvider != null) evidenceAssertionItemProvider.dispose();
		if (informationElementItemProvider != null) informationElementItemProvider.dispose();
		if (argumentReasoningItemProvider != null) argumentReasoningItemProvider.dispose();
		if (citationElementItemProvider != null) citationElementItemProvider.dispose();
	}

}
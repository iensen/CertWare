/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.certware.argument.caz.util.CazAdapterFactory;

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
public class CazItemProviderAdapterFactory extends CazAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CazItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.ArgumentDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentDiagramItemProvider argumentDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.ArgumentDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentDiagramAdapter() {
		if (argumentDiagramItemProvider == null) {
			argumentDiagramItemProvider = new ArgumentDiagramItemProvider(this);
		}

		return argumentDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Claim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemProvider claimItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Claim}.
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
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Argument}.
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
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Evidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceItemProvider evidenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvidenceAdapter() {
		if (evidenceItemProvider == null) {
			evidenceItemProvider = new EvidenceItemProvider(this);
		}

		return evidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Assumption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionItemProvider assumptionItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssumptionAdapter() {
		if (assumptionItemProvider == null) {
			assumptionItemProvider = new AssumptionItemProvider(this);
		}

		return assumptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.argument.caz.Justification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JustificationItemProvider justificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.argument.caz.Justification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJustificationAdapter() {
		if (justificationItemProvider == null) {
			justificationItemProvider = new JustificationItemProvider(this);
		}

		return justificationItemProvider;
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
		if (argumentDiagramItemProvider != null) argumentDiagramItemProvider.dispose();
		if (claimItemProvider != null) claimItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (evidenceItemProvider != null) evidenceItemProvider.dispose();
		if (assumptionItemProvider != null) assumptionItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (justificationItemProvider != null) justificationItemProvider.dispose();
	}

}

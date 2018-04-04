/**
 */
package ecore.provider;


import ecore.EcoreFactory;
import ecore.EcorePackage;
import ecore.RootContainer;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactory;

import ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistenceFactory;

import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactory;

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactory;

import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionFactory;

import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingFactory;

import ecore.org.cocome.tradingsystem.util.java.JavaFactory;

import ecore.org.cocome.tradingsystem.util.scope.ScopeFactory;

import ecore.org.cocome.tradingsystem.util.scope.context.ContextFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ecore.RootContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RootContainerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RootContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RootContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RootContainer_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RootContainer.class)) {
			case EcorePackage.ROOT_CONTAINER__CONTAINED_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 EcoreFactory.eINSTANCE.createRootContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 EnterpriseFactory.eINSTANCE.createEnterpriseDatatypesFactory()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 EnterpriseFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 EnterpriseFactory.eINSTANCE.createProductSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 EnterpriseFactory.eINSTANCE.createTradingEnterprise()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 PersistenceFactory.eINSTANCE.createCloudPersistenceContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 PersistenceFactory.eINSTANCE.createServiceAdapterEntityConverter()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 PersistenceFactory.eINSTANCE.createServiceAdapterHeaders()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createEnterpriseStoreQueryProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createOrderEntry()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createProductOrder()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createStockItem()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 StoreFactory.eINSTANCE.createStoreDatatypesFactory()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 UsermanagerFactory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 UsermanagerFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 UsermanagerFactory.eINSTANCE.createUsermanagerDatatypesFactory()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ConnectionFactory.eINSTANCE.createCSVBackendConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ConnectionFactory.eINSTANCE.createGetXMLFromBackend()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ConnectionFactory.eINSTANCE.createQueryParameterEncoder()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ParsingFactory.eINSTANCE.createCSVHelper()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ParsingFactory.eINSTANCE.createMessageToCSV()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ParsingFactory.eINSTANCE.createParserPostMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createDualElement()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createDualIterator()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createIterables()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createLists()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createMaps()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createReflection()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createSets()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createSwing()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createTimeSpan()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ScopeFactory.eINSTANCE.createCashDeskRegistry()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ScopeFactory.eINSTANCE.createCashDeskRegistryFactory()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ScopeFactory.eINSTANCE.createCashDeskSessionScopeExtension()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ContextFactory.eINSTANCE.createNamedSessionContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.ROOT_CONTAINER__CONTAINED_ELEMENTS,
				 ContextFactory.eINSTANCE.createNamedSessionContextHolder()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return cloudlogiccoreimplEditPlugin.INSTANCE;
	}

}

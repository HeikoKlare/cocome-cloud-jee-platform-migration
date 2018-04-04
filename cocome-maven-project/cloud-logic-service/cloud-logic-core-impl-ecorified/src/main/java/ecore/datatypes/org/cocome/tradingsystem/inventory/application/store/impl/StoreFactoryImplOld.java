/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.impl;

import org.cocome.tradingsystem.inventory.application.store.ComplexOrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.ComplexOrderTO;
import org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO;
import org.cocome.tradingsystem.inventory.application.store.EnterpriseTO;
import org.cocome.tradingsystem.inventory.application.store.OrderEntryTO;
import org.cocome.tradingsystem.inventory.application.store.OrderTO;
import org.cocome.tradingsystem.inventory.application.store.ProductTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierAndStockItemTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO;
import org.cocome.tradingsystem.inventory.application.store.StockItemTO;
import org.cocome.tradingsystem.inventory.application.store.StoreTO;
import org.cocome.tradingsystem.inventory.application.store.StoreWithEnterpriseTO;
import org.cocome.tradingsystem.inventory.application.store.SupplierTO;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StoreFactoryOld;
import ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoreFactoryImplOld extends EFactoryImpl implements StoreFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreFactoryOld init() {
		return new StoreFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StorePackage.COMPLEX_ORDER_ENTRY_TO:
				return createComplexOrderEntryTOFromString(eDataType, initialValue);
			case StorePackage.COMPLEX_ORDER_TO:
				return createComplexOrderTOFromString(eDataType, initialValue);
			case StorePackage.CUSTOMER_WITH_STORE_TO:
				return createCustomerWithStoreTOFromString(eDataType, initialValue);
			case StorePackage.ENTERPRISE_TO:
				return createEnterpriseTOFromString(eDataType, initialValue);
			case StorePackage.ORDER_ENTRY_TO:
				return createOrderEntryTOFromString(eDataType, initialValue);
			case StorePackage.ORDER_TO:
				return createOrderTOFromString(eDataType, initialValue);
			case StorePackage.PRODUCT_TO:
				return createProductTOFromString(eDataType, initialValue);
			case StorePackage.PRODUCT_WITH_STOCK_ITEM_TO:
				return createProductWithStockItemTOFromString(eDataType, initialValue);
			case StorePackage.PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO:
				return createProductWithSupplierAndStockItemTOFromString(eDataType, initialValue);
			case StorePackage.PRODUCT_WITH_SUPPLIER_TO:
				return createProductWithSupplierTOFromString(eDataType, initialValue);
			case StorePackage.STOCK_ITEM_TO:
				return createStockItemTOFromString(eDataType, initialValue);
			case StorePackage.STORE_TO:
				return createStoreTOFromString(eDataType, initialValue);
			case StorePackage.STORE_WITH_ENTERPRISE_TO:
				return createStoreWithEnterpriseTOFromString(eDataType, initialValue);
			case StorePackage.SUPPLIER_TO:
				return createSupplierTOFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StorePackage.COMPLEX_ORDER_ENTRY_TO:
				return convertComplexOrderEntryTOToString(eDataType, instanceValue);
			case StorePackage.COMPLEX_ORDER_TO:
				return convertComplexOrderTOToString(eDataType, instanceValue);
			case StorePackage.CUSTOMER_WITH_STORE_TO:
				return convertCustomerWithStoreTOToString(eDataType, instanceValue);
			case StorePackage.ENTERPRISE_TO:
				return convertEnterpriseTOToString(eDataType, instanceValue);
			case StorePackage.ORDER_ENTRY_TO:
				return convertOrderEntryTOToString(eDataType, instanceValue);
			case StorePackage.ORDER_TO:
				return convertOrderTOToString(eDataType, instanceValue);
			case StorePackage.PRODUCT_TO:
				return convertProductTOToString(eDataType, instanceValue);
			case StorePackage.PRODUCT_WITH_STOCK_ITEM_TO:
				return convertProductWithStockItemTOToString(eDataType, instanceValue);
			case StorePackage.PRODUCT_WITH_SUPPLIER_AND_STOCK_ITEM_TO:
				return convertProductWithSupplierAndStockItemTOToString(eDataType, instanceValue);
			case StorePackage.PRODUCT_WITH_SUPPLIER_TO:
				return convertProductWithSupplierTOToString(eDataType, instanceValue);
			case StorePackage.STOCK_ITEM_TO:
				return convertStockItemTOToString(eDataType, instanceValue);
			case StorePackage.STORE_TO:
				return convertStoreTOToString(eDataType, instanceValue);
			case StorePackage.STORE_WITH_ENTERPRISE_TO:
				return convertStoreWithEnterpriseTOToString(eDataType, instanceValue);
			case StorePackage.SUPPLIER_TO:
				return convertSupplierTOToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOrderEntryTO createComplexOrderEntryTOFromString(EDataType eDataType, String initialValue) {
		return (ComplexOrderEntryTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexOrderEntryTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOrderTO createComplexOrderTOFromString(EDataType eDataType, String initialValue) {
		return (ComplexOrderTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexOrderTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerWithStoreTO createCustomerWithStoreTOFromString(EDataType eDataType, String initialValue) {
		return (CustomerWithStoreTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerWithStoreTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseTO createEnterpriseTOFromString(EDataType eDataType, String initialValue) {
		return (EnterpriseTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnterpriseTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEntryTO createOrderEntryTOFromString(EDataType eDataType, String initialValue) {
		return (OrderEntryTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderEntryTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderTO createOrderTOFromString(EDataType eDataType, String initialValue) {
		return (OrderTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTO createProductTOFromString(EDataType eDataType, String initialValue) {
		return (ProductTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductWithStockItemTO createProductWithStockItemTOFromString(EDataType eDataType, String initialValue) {
		return (ProductWithStockItemTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductWithStockItemTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductWithSupplierAndStockItemTO createProductWithSupplierAndStockItemTOFromString(EDataType eDataType, String initialValue) {
		return (ProductWithSupplierAndStockItemTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductWithSupplierAndStockItemTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductWithSupplierTO createProductWithSupplierTOFromString(EDataType eDataType, String initialValue) {
		return (ProductWithSupplierTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductWithSupplierTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockItemTO createStockItemTOFromString(EDataType eDataType, String initialValue) {
		return (StockItemTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStockItemTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreTO createStoreTOFromString(EDataType eDataType, String initialValue) {
		return (StoreTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoreTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreWithEnterpriseTO createStoreWithEnterpriseTOFromString(EDataType eDataType, String initialValue) {
		return (StoreWithEnterpriseTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoreWithEnterpriseTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierTO createSupplierTOFromString(EDataType eDataType, String initialValue) {
		return (SupplierTO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplierTOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorePackage getStorePackage() {
		return (StorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StorePackage getPackage() {
		return StorePackage.eINSTANCE;
	}

} //StoreFactoryImpl

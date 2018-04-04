/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseFactoryImplOld extends EFactoryImpl implements EnterpriseFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnterpriseFactoryOld init() {
		return new EnterpriseFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseFactoryImplOld() {
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
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY: return createEnterpriseDatatypesFactory();
			case EnterprisePackage.PRODUCT: return createProduct();
			case EnterprisePackage.PRODUCT_SUPPLIER: return createProductSupplier();
			case EnterprisePackage.TRADING_ENTERPRISE: return createTradingEnterprise();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseDatatypesFactory createEnterpriseDatatypesFactory() {
		EnterpriseDatatypesFactoryImpl enterpriseDatatypesFactory = new EnterpriseDatatypesFactoryImpl();
		return enterpriseDatatypesFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSupplier createProductSupplier() {
		ProductSupplierImpl productSupplier = new ProductSupplierImpl();
		return productSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingEnterprise createTradingEnterprise() {
		TradingEnterpriseImpl tradingEnterprise = new TradingEnterpriseImpl();
		return tradingEnterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterprisePackage getEnterprisePackage() {
		return (EnterprisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnterprisePackage getPackage() {
		return EnterprisePackage.eINSTANCE;
	}

} //EnterpriseFactoryImpl

/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import java.lang.reflect.InvocationTargetException;

import org.cocome.tradingsystem.inventory.application.store.EnterpriseTO;
import org.cocome.tradingsystem.inventory.application.store.ProductTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO;
import org.cocome.tradingsystem.inventory.application.store.SupplierTO;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatypes Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnterpriseDatatypesFactoryImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseDatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.ENTERPRISE_DATATYPES_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct getNewProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSupplier getNewProductSupplier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradingEnterprise getNewTradingEnterprise() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct convertToProduct(ProductTO productTO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTO fillProductTO(IProduct product) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradingEnterprise convertToEnterprise(EnterpriseTO enterpriseTO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseTO fillEnterpriseTO(ITradingEnterprise enterprise) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSupplier convertToSupplier(SupplierTO supplierTO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierTO fillSupplierTO(IProductSupplier supplier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductWithSupplierTO fillProductWithSupplierTO(IProduct product) throws NotInDatabaseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT:
				return getNewProduct();
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___GET_NEW_PRODUCT_SUPPLIER:
				return getNewProductSupplier();
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___GET_NEW_TRADING_ENTERPRISE:
				return getNewTradingEnterprise();
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_PRODUCT__PRODUCTTO:
				return convertToProduct((ProductTO)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_TO__IPRODUCT:
				return fillProductTO((IProduct)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_ENTERPRISE__ENTERPRISETO:
				return convertToEnterprise((EnterpriseTO)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___FILL_ENTERPRISE_TO__ITRADINGENTERPRISE:
				return fillEnterpriseTO((ITradingEnterprise)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___CONVERT_TO_SUPPLIER__SUPPLIERTO:
				return convertToSupplier((SupplierTO)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___FILL_SUPPLIER_TO__IPRODUCTSUPPLIER:
				return fillSupplierTO((IProductSupplier)arguments.get(0));
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY___FILL_PRODUCT_WITH_SUPPLIER_TO__IPRODUCT:
				try {
					return fillProductWithSupplierTO((IProduct)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnterpriseDatatypesFactoryImpl

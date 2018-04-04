/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import org.cocome.tradingsystem.inventory.application.store.EnterpriseTO;
import org.cocome.tradingsystem.inventory.application.store.ProductTO;
import org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO;
import org.cocome.tradingsystem.inventory.application.store.SupplierTO;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.util.exception.NotInDatabaseException;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatypes Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getEnterpriseDatatypesFactory()
 * @model
 * @generated
 */
public interface EnterpriseDatatypesFactory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	IProduct getNewProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	IProductSupplier getNewProductSupplier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	ITradingEnterprise getNewTradingEnterprise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model productTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ProductTO"
	 * @generated
	 */
	IProduct convertToProduct(ProductTO productTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ProductTO"
	 * @generated
	 */
	ProductTO fillProductTO(IProduct product);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise" enterpriseTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.EnterpriseTO"
	 * @generated
	 */
	ITradingEnterprise convertToEnterprise(EnterpriseTO enterpriseTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.EnterpriseTO" enterpriseDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	EnterpriseTO fillEnterpriseTO(ITradingEnterprise enterprise);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier" supplierTODataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.SupplierTO"
	 * @generated
	 */
	IProductSupplier convertToSupplier(SupplierTO supplierTO);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.SupplierTO" supplierDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	SupplierTO fillSupplierTO(IProductSupplier supplier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.application.store.ProductWithSupplierTO" exceptions="ecore.datatypes.org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	ProductWithSupplierTO fillProductWithSupplierTO(IProduct product) throws NotInDatabaseException;

} // EnterpriseDatatypesFactory

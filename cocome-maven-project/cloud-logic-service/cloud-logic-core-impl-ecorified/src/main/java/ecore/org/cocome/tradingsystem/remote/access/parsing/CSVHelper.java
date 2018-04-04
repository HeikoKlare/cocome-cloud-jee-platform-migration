/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing;

import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage#getCSVHelper()
 * @model
 * @generated
 */
public interface CSVHelper extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStore&gt;"
	 * @generated
	 */
	Collection<IStore> getStores(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.ICustomer&gt;"
	 * @generated
	 */
	Collection<ICustomer> getCustomers(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser&gt;"
	 * @generated
	 */
	Collection<IUser> getUsers(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise&gt;"
	 * @generated
	 */
	Collection<ITradingEnterprise> getEnterprises(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem&gt;"
	 * @generated
	 */
	Collection<IStockItem> getStockItems(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct&gt;"
	 * @generated
	 */
	Collection<IProduct> getProducts(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier&gt;"
	 * @generated
	 */
	Collection<IProductSupplier> getProductSuppliers(String input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder&gt;"
	 * @generated
	 */
	Collection<IProductOrder> getProductOrders(String input);

} // CSVHelper

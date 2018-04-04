/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getLocation <em>Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterpriseName <em>Enterprise Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getProductOrders <em>Product Orders</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getStockItems <em>Stock Items</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore()
 * @model
 * @generated
 */
public interface Store extends ecore.org.cocome.tradingsystem.inventory.data.store.IStore {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Enterprise Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Name</em>' attribute.
	 * @see #setEnterpriseName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_EnterpriseName()
	 * @model
	 * @generated
	 */
	String getEnterpriseName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterpriseName <em>Enterprise Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Name</em>' attribute.
	 * @see #getEnterpriseName()
	 * @generated
	 */
	void setEnterpriseName(String value);

	/**
	 * Returns the value of the '<em><b>Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise</em>' attribute.
	 * @see #setEnterprise(ITradingEnterprise)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_Enterprise()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	ITradingEnterprise getEnterprise();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getEnterprise <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise</em>' attribute.
	 * @see #getEnterprise()
	 * @generated
	 */
	void setEnterprise(ITradingEnterprise value);

	/**
	 * Returns the value of the '<em><b>Product Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Orders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Orders</em>' attribute.
	 * @see #setProductOrders(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_ProductOrders()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder&gt;"
	 * @generated
	 */
	Collection<IProductOrder> getProductOrders();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getProductOrders <em>Product Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Orders</em>' attribute.
	 * @see #getProductOrders()
	 * @generated
	 */
	void setProductOrders(Collection<IProductOrder> value);

	/**
	 * Returns the value of the '<em><b>Stock Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Items</em>' attribute.
	 * @see #setStockItems(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStore_StockItems()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem&gt;"
	 * @generated
	 */
	Collection<IStockItem> getStockItems();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.Store#getStockItems <em>Stock Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Items</em>' attribute.
	 * @see #getStockItems()
	 * @generated
	 */
	void setStockItems(Collection<IStockItem> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initStore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int compareTo(IStore o);

} // Store

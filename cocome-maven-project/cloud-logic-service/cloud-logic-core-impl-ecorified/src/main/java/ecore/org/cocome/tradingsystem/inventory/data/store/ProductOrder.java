/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import java.util.Collection;
import java.util.Date;

import org.cocome.tradingsystem.inventory.data.store.IOrderEntry;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.store.IStoreQuery;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderingDate <em>Ordering Date</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderEntries <em>Order Entries</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStore <em>Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder()
 * @model
 * @generated
 */
public interface ProductOrder extends EObject {
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_DeliveryDate()
	 * @model dataType="ecore.datatypes.java.util.Date"
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ordering Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering Date</em>' attribute.
	 * @see #setOrderingDate(Date)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_OrderingDate()
	 * @model dataType="ecore.datatypes.java.util.Date"
	 * @generated
	 */
	Date getOrderingDate();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderingDate <em>Ordering Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering Date</em>' attribute.
	 * @see #getOrderingDate()
	 * @generated
	 */
	void setOrderingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Entries</em>' attribute.
	 * @see #setOrderEntries(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_OrderEntries()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IOrderEntry&gt;"
	 * @generated
	 */
	Collection<IOrderEntry> getOrderEntries();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getOrderEntries <em>Order Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Entries</em>' attribute.
	 * @see #getOrderEntries()
	 * @generated
	 */
	void setOrderEntries(Collection<IOrderEntry> value);

	/**
	 * Returns the value of the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Name</em>' attribute.
	 * @see #setStoreName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_StoreName()
	 * @model
	 * @generated
	 */
	String getStoreName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreName <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Name</em>' attribute.
	 * @see #getStoreName()
	 * @generated
	 */
	void setStoreName(String value);

	/**
	 * Returns the value of the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Location</em>' attribute.
	 * @see #setStoreLocation(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_StoreLocation()
	 * @model
	 * @generated
	 */
	String getStoreLocation();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreLocation <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Location</em>' attribute.
	 * @see #getStoreLocation()
	 * @generated
	 */
	void setStoreLocation(String value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(IStore)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_Store()
	 * @model
	 * @generated
	 */
	IStore getStore();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(IStore value);

	/**
	 * Returns the value of the '<em><b>Store Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Query</em>' attribute.
	 * @see #setStoreQuery(IStoreQuery)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getProductOrder_StoreQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IStoreQuery"
	 * @generated
	 */
	IStoreQuery getStoreQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder#getStoreQuery <em>Store Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Query</em>' attribute.
	 * @see #getStoreQuery()
	 * @generated
	 */
	void setStoreQuery(IStoreQuery value);

} // ProductOrder

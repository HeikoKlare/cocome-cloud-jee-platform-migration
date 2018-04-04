/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IStoreQuery;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProductBarcode <em>Product Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProduct <em>Product</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry()
 * @model
 * @generated
 */
public interface OrderEntry extends EObject {
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry_Amount()
	 * @model
	 * @generated
	 */
	long getAmount();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(long value);

	/**
	 * Returns the value of the '<em><b>Product Barcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Barcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Barcode</em>' attribute.
	 * @see #setProductBarcode(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry_ProductBarcode()
	 * @model
	 * @generated
	 */
	long getProductBarcode();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProductBarcode <em>Product Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Barcode</em>' attribute.
	 * @see #getProductBarcode()
	 * @generated
	 */
	void setProductBarcode(long value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(IProduct)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry_Product()
	 * @model
	 * @generated
	 */
	IProduct getProduct();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(IProduct value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getOrderEntry_StoreQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IStoreQuery"
	 * @generated
	 */
	IStoreQuery getStoreQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry#getStoreQuery <em>Store Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Query</em>' attribute.
	 * @see #getStoreQuery()
	 * @generated
	 */
	void setStoreQuery(IStoreQuery value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initOrderEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // OrderEntry

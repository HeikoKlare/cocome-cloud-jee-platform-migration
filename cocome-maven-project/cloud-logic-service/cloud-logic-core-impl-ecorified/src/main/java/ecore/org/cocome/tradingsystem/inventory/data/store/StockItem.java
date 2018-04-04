/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.store.IStoreQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getSalesPrice <em>Sales Price</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getAmount <em>Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMinStock <em>Min Stock</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMaxStock <em>Max Stock</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getIncomingAmount <em>Incoming Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProductBarcode <em>Product Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStore <em>Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProduct <em>Product</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem()
 * @model
 * @generated
 */
public interface StockItem extends ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem {
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Price</em>' attribute.
	 * @see #setSalesPrice(double)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_SalesPrice()
	 * @model
	 * @generated
	 */
	double getSalesPrice();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getSalesPrice <em>Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Price</em>' attribute.
	 * @see #getSalesPrice()
	 * @generated
	 */
	void setSalesPrice(double value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_Amount()
	 * @model
	 * @generated
	 */
	long getAmount();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(long value);

	/**
	 * Returns the value of the '<em><b>Min Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Stock</em>' attribute.
	 * @see #setMinStock(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_MinStock()
	 * @model
	 * @generated
	 */
	long getMinStock();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMinStock <em>Min Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Stock</em>' attribute.
	 * @see #getMinStock()
	 * @generated
	 */
	void setMinStock(long value);

	/**
	 * Returns the value of the '<em><b>Max Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Stock</em>' attribute.
	 * @see #setMaxStock(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_MaxStock()
	 * @model
	 * @generated
	 */
	long getMaxStock();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getMaxStock <em>Max Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Stock</em>' attribute.
	 * @see #getMaxStock()
	 * @generated
	 */
	void setMaxStock(long value);

	/**
	 * Returns the value of the '<em><b>Incoming Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Amount</em>' attribute.
	 * @see #setIncomingAmount(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_IncomingAmount()
	 * @model
	 * @generated
	 */
	long getIncomingAmount();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getIncomingAmount <em>Incoming Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Amount</em>' attribute.
	 * @see #getIncomingAmount()
	 * @generated
	 */
	void setIncomingAmount(long value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_StoreName()
	 * @model
	 * @generated
	 */
	String getStoreName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreName <em>Store Name</em>}' attribute.
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_StoreLocation()
	 * @model
	 * @generated
	 */
	String getStoreLocation();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreLocation <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Location</em>' attribute.
	 * @see #getStoreLocation()
	 * @generated
	 */
	void setStoreLocation(String value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_ProductBarcode()
	 * @model
	 * @generated
	 */
	long getProductBarcode();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProductBarcode <em>Product Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Barcode</em>' attribute.
	 * @see #getProductBarcode()
	 * @generated
	 */
	void setProductBarcode(long value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_Store()
	 * @model
	 * @generated
	 */
	IStore getStore();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(IStore value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_Product()
	 * @model
	 * @generated
	 */
	IProduct getProduct();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getProduct <em>Product</em>}' reference.
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage#getStockItem_StoreQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IStoreQuery"
	 * @generated
	 */
	IStoreQuery getStoreQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.store.StockItem#getStoreQuery <em>Store Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Query</em>' attribute.
	 * @see #getStoreQuery()
	 * @generated
	 */
	void setStoreQuery(IStoreQuery value);

} // StockItem

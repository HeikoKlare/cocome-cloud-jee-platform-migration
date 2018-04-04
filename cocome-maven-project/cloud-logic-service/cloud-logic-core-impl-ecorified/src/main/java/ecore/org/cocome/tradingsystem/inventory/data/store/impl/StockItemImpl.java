/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.store.IStoreQuery;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getSalesPrice <em>Sales Price</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getMinStock <em>Min Stock</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getMaxStock <em>Max Stock</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getIncomingAmount <em>Incoming Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getProductBarcode <em>Product Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getStore <em>Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StockItemImpl#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockItemImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.store.StockItem {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalesPrice() <em>Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double SALES_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalesPrice() <em>Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected double salesPrice = SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final long AMOUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected long amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStock() <em>Min Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStock()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_STOCK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinStock() <em>Min Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStock()
	 * @generated
	 * @ordered
	 */
	protected long minStock = MIN_STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStock() <em>Max Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStock()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_STOCK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxStock() <em>Max Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStock()
	 * @generated
	 * @ordered
	 */
	protected long maxStock = MAX_STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncomingAmount() <em>Incoming Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingAmount()
	 * @generated
	 * @ordered
	 */
	protected static final long INCOMING_AMOUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIncomingAmount() <em>Incoming Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingAmount()
	 * @generated
	 * @ordered
	 */
	protected long incomingAmount = INCOMING_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected String storeName = STORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected String storeLocation = STORE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductBarcode() <em>Product Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductBarcode()
	 * @generated
	 * @ordered
	 */
	protected static final long PRODUCT_BARCODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProductBarcode() <em>Product Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductBarcode()
	 * @generated
	 * @ordered
	 */
	protected long productBarcode = PRODUCT_BARCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected IStore store;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected IProduct product;

	/**
	 * The default value of the '{@link #getStoreQuery() <em>Store Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreQuery()
	 * @generated
	 * @ordered
	 */
	protected static final IStoreQuery STORE_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreQuery() <em>Store Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreQuery()
	 * @generated
	 * @ordered
	 */
	protected IStoreQuery storeQuery = STORE_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.STOCK_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalesPrice() {
		return salesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesPrice(double newSalesPrice) {
		double oldSalesPrice = salesPrice;
		salesPrice = newSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__SALES_PRICE, oldSalesPrice, salesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(long newAmount) {
		long oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinStock() {
		return minStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStock(long newMinStock) {
		long oldMinStock = minStock;
		minStock = newMinStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__MIN_STOCK, oldMinStock, minStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxStock() {
		return maxStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStock(long newMaxStock) {
		long oldMaxStock = maxStock;
		maxStock = newMaxStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__MAX_STOCK, oldMaxStock, maxStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIncomingAmount() {
		return incomingAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingAmount(long newIncomingAmount) {
		long oldIncomingAmount = incomingAmount;
		incomingAmount = newIncomingAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__INCOMING_AMOUNT, oldIncomingAmount, incomingAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreName(String newStoreName) {
		String oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__STORE_NAME, oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreLocation() {
		return storeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreLocation(String newStoreLocation) {
		String oldStoreLocation = storeLocation;
		storeLocation = newStoreLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__STORE_LOCATION, oldStoreLocation, storeLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getProductBarcode() {
		return productBarcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductBarcode(long newProductBarcode) {
		long oldProductBarcode = productBarcode;
		productBarcode = newProductBarcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__PRODUCT_BARCODE, oldProductBarcode, productBarcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore getStore() {
		if (store != null && store.eIsProxy()) {
			InternalEObject oldStore = (InternalEObject)store;
			store = (IStore)eResolveProxy(oldStore);
			if (store != oldStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.STOCK_ITEM__STORE, oldStore, store));
			}
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStore basicGetStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(IStore newStore) {
		IStore oldStore = store;
		store = newStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__STORE, oldStore, store));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (IProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.STOCK_ITEM__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(IProduct newProduct) {
		IProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStoreQuery getStoreQuery() {
		return storeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreQuery(IStoreQuery newStoreQuery) {
		IStoreQuery oldStoreQuery = storeQuery;
		storeQuery = newStoreQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STOCK_ITEM__STORE_QUERY, oldStoreQuery, storeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.STOCK_ITEM__ID:
				return getId();
			case StorePackage.STOCK_ITEM__SALES_PRICE:
				return getSalesPrice();
			case StorePackage.STOCK_ITEM__AMOUNT:
				return getAmount();
			case StorePackage.STOCK_ITEM__MIN_STOCK:
				return getMinStock();
			case StorePackage.STOCK_ITEM__MAX_STOCK:
				return getMaxStock();
			case StorePackage.STOCK_ITEM__INCOMING_AMOUNT:
				return getIncomingAmount();
			case StorePackage.STOCK_ITEM__STORE_NAME:
				return getStoreName();
			case StorePackage.STOCK_ITEM__STORE_LOCATION:
				return getStoreLocation();
			case StorePackage.STOCK_ITEM__PRODUCT_BARCODE:
				return getProductBarcode();
			case StorePackage.STOCK_ITEM__STORE:
				if (resolve) return getStore();
				return basicGetStore();
			case StorePackage.STOCK_ITEM__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case StorePackage.STOCK_ITEM__STORE_QUERY:
				return getStoreQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.STOCK_ITEM__ID:
				setId((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__SALES_PRICE:
				setSalesPrice((Double)newValue);
				return;
			case StorePackage.STOCK_ITEM__AMOUNT:
				setAmount((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__MIN_STOCK:
				setMinStock((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__MAX_STOCK:
				setMaxStock((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__INCOMING_AMOUNT:
				setIncomingAmount((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__STORE_NAME:
				setStoreName((String)newValue);
				return;
			case StorePackage.STOCK_ITEM__STORE_LOCATION:
				setStoreLocation((String)newValue);
				return;
			case StorePackage.STOCK_ITEM__PRODUCT_BARCODE:
				setProductBarcode((Long)newValue);
				return;
			case StorePackage.STOCK_ITEM__STORE:
				setStore((IStore)newValue);
				return;
			case StorePackage.STOCK_ITEM__PRODUCT:
				setProduct((IProduct)newValue);
				return;
			case StorePackage.STOCK_ITEM__STORE_QUERY:
				setStoreQuery((IStoreQuery)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StorePackage.STOCK_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__SALES_PRICE:
				setSalesPrice(SALES_PRICE_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__MIN_STOCK:
				setMinStock(MIN_STOCK_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__MAX_STOCK:
				setMaxStock(MAX_STOCK_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__INCOMING_AMOUNT:
				setIncomingAmount(INCOMING_AMOUNT_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__STORE_NAME:
				setStoreName(STORE_NAME_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__STORE_LOCATION:
				setStoreLocation(STORE_LOCATION_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__PRODUCT_BARCODE:
				setProductBarcode(PRODUCT_BARCODE_EDEFAULT);
				return;
			case StorePackage.STOCK_ITEM__STORE:
				setStore((IStore)null);
				return;
			case StorePackage.STOCK_ITEM__PRODUCT:
				setProduct((IProduct)null);
				return;
			case StorePackage.STOCK_ITEM__STORE_QUERY:
				setStoreQuery(STORE_QUERY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StorePackage.STOCK_ITEM__ID:
				return id != ID_EDEFAULT;
			case StorePackage.STOCK_ITEM__SALES_PRICE:
				return salesPrice != SALES_PRICE_EDEFAULT;
			case StorePackage.STOCK_ITEM__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case StorePackage.STOCK_ITEM__MIN_STOCK:
				return minStock != MIN_STOCK_EDEFAULT;
			case StorePackage.STOCK_ITEM__MAX_STOCK:
				return maxStock != MAX_STOCK_EDEFAULT;
			case StorePackage.STOCK_ITEM__INCOMING_AMOUNT:
				return incomingAmount != INCOMING_AMOUNT_EDEFAULT;
			case StorePackage.STOCK_ITEM__STORE_NAME:
				return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
			case StorePackage.STOCK_ITEM__STORE_LOCATION:
				return STORE_LOCATION_EDEFAULT == null ? storeLocation != null : !STORE_LOCATION_EDEFAULT.equals(storeLocation);
			case StorePackage.STOCK_ITEM__PRODUCT_BARCODE:
				return productBarcode != PRODUCT_BARCODE_EDEFAULT;
			case StorePackage.STOCK_ITEM__STORE:
				return store != null;
			case StorePackage.STOCK_ITEM__PRODUCT:
				return product != null;
			case StorePackage.STOCK_ITEM__STORE_QUERY:
				return STORE_QUERY_EDEFAULT == null ? storeQuery != null : !STORE_QUERY_EDEFAULT.equals(storeQuery);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", salesPrice: ");
		result.append(salesPrice);
		result.append(", amount: ");
		result.append(amount);
		result.append(", minStock: ");
		result.append(minStock);
		result.append(", maxStock: ");
		result.append(maxStock);
		result.append(", incomingAmount: ");
		result.append(incomingAmount);
		result.append(", storeName: ");
		result.append(storeName);
		result.append(", storeLocation: ");
		result.append(storeLocation);
		result.append(", productBarcode: ");
		result.append(productBarcode);
		result.append(", storeQuery: ");
		result.append(storeQuery);
		result.append(')');
		return result.toString();
	}

} //StockItemImpl

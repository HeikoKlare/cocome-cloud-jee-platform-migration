/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import java.lang.reflect.InvocationTargetException;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.store.IStoreQuery;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl#getProductBarcode <em>Product Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.OrderEntryImpl#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderEntryImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry {
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
	protected OrderEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.ORDER_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER_ENTRY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER_ENTRY__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER_ENTRY__PRODUCT_BARCODE, oldProductBarcode, productBarcode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.ORDER_ENTRY__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER_ENTRY__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER_ENTRY__STORE_QUERY, oldStoreQuery, storeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initOrderEntry() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.ORDER_ENTRY__ID:
				return getId();
			case StorePackage.ORDER_ENTRY__AMOUNT:
				return getAmount();
			case StorePackage.ORDER_ENTRY__PRODUCT_BARCODE:
				return getProductBarcode();
			case StorePackage.ORDER_ENTRY__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case StorePackage.ORDER_ENTRY__STORE_QUERY:
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
			case StorePackage.ORDER_ENTRY__ID:
				setId((Long)newValue);
				return;
			case StorePackage.ORDER_ENTRY__AMOUNT:
				setAmount((Long)newValue);
				return;
			case StorePackage.ORDER_ENTRY__PRODUCT_BARCODE:
				setProductBarcode((Long)newValue);
				return;
			case StorePackage.ORDER_ENTRY__PRODUCT:
				setProduct((IProduct)newValue);
				return;
			case StorePackage.ORDER_ENTRY__STORE_QUERY:
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
			case StorePackage.ORDER_ENTRY__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.ORDER_ENTRY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case StorePackage.ORDER_ENTRY__PRODUCT_BARCODE:
				setProductBarcode(PRODUCT_BARCODE_EDEFAULT);
				return;
			case StorePackage.ORDER_ENTRY__PRODUCT:
				setProduct((IProduct)null);
				return;
			case StorePackage.ORDER_ENTRY__STORE_QUERY:
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
			case StorePackage.ORDER_ENTRY__ID:
				return id != ID_EDEFAULT;
			case StorePackage.ORDER_ENTRY__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case StorePackage.ORDER_ENTRY__PRODUCT_BARCODE:
				return productBarcode != PRODUCT_BARCODE_EDEFAULT;
			case StorePackage.ORDER_ENTRY__PRODUCT:
				return product != null;
			case StorePackage.ORDER_ENTRY__STORE_QUERY:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StorePackage.ORDER_ENTRY___INIT_ORDER_ENTRY:
				initOrderEntry();
				return null;
			case StorePackage.ORDER_ENTRY___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrderEntryImpl

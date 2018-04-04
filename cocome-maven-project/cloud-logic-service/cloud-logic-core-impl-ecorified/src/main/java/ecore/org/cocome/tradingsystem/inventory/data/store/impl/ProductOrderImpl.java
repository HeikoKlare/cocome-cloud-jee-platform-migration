/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import java.util.Collection;
import java.util.Date;

import org.cocome.tradingsystem.inventory.data.store.IOrderEntry;
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
 * An implementation of the model object '<em><b>Product Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getOrderingDate <em>Ordering Date</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getOrderEntries <em>Order Entries</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getStore <em>Store</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.ProductOrderImpl#getStoreQuery <em>Store Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOrderImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder {
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
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderingDate() <em>Ordering Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDERING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderingDate() <em>Ordering Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderingDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderingDate = ORDERING_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderEntries() <em>Order Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderEntries()
	 * @generated
	 * @ordered
	 */
	protected Collection<IOrderEntry> orderEntries;

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
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected IStore store;

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
	protected ProductOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOrderingDate() {
		return orderingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderingDate(Date newOrderingDate) {
		Date oldOrderingDate = orderingDate;
		orderingDate = newOrderingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__ORDERING_DATE, oldOrderingDate, orderingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IOrderEntry> getOrderEntries() {
		return orderEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderEntries(Collection<IOrderEntry> newOrderEntries) {
		Collection<IOrderEntry> oldOrderEntries = orderEntries;
		orderEntries = newOrderEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__ORDER_ENTRIES, oldOrderEntries, orderEntries));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__STORE_NAME, oldStoreName, storeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__STORE_LOCATION, oldStoreLocation, storeLocation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_ORDER__STORE, oldStore, store));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__STORE, oldStore, store));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_ORDER__STORE_QUERY, oldStoreQuery, storeQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_ORDER__ID:
				return getId();
			case StorePackage.PRODUCT_ORDER__DELIVERY_DATE:
				return getDeliveryDate();
			case StorePackage.PRODUCT_ORDER__ORDERING_DATE:
				return getOrderingDate();
			case StorePackage.PRODUCT_ORDER__ORDER_ENTRIES:
				return getOrderEntries();
			case StorePackage.PRODUCT_ORDER__STORE_NAME:
				return getStoreName();
			case StorePackage.PRODUCT_ORDER__STORE_LOCATION:
				return getStoreLocation();
			case StorePackage.PRODUCT_ORDER__STORE:
				if (resolve) return getStore();
				return basicGetStore();
			case StorePackage.PRODUCT_ORDER__STORE_QUERY:
				return getStoreQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.PRODUCT_ORDER__ID:
				setId((Long)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__ORDERING_DATE:
				setOrderingDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__ORDER_ENTRIES:
				setOrderEntries((Collection<IOrderEntry>)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_NAME:
				setStoreName((String)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_LOCATION:
				setStoreLocation((String)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__STORE:
				setStore((IStore)newValue);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_QUERY:
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
			case StorePackage.PRODUCT_ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_ORDER__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_ORDER__ORDERING_DATE:
				setOrderingDate(ORDERING_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_ORDER__ORDER_ENTRIES:
				setOrderEntries((Collection<IOrderEntry>)null);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_NAME:
				setStoreName(STORE_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_LOCATION:
				setStoreLocation(STORE_LOCATION_EDEFAULT);
				return;
			case StorePackage.PRODUCT_ORDER__STORE:
				setStore((IStore)null);
				return;
			case StorePackage.PRODUCT_ORDER__STORE_QUERY:
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
			case StorePackage.PRODUCT_ORDER__ID:
				return id != ID_EDEFAULT;
			case StorePackage.PRODUCT_ORDER__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case StorePackage.PRODUCT_ORDER__ORDERING_DATE:
				return ORDERING_DATE_EDEFAULT == null ? orderingDate != null : !ORDERING_DATE_EDEFAULT.equals(orderingDate);
			case StorePackage.PRODUCT_ORDER__ORDER_ENTRIES:
				return orderEntries != null;
			case StorePackage.PRODUCT_ORDER__STORE_NAME:
				return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
			case StorePackage.PRODUCT_ORDER__STORE_LOCATION:
				return STORE_LOCATION_EDEFAULT == null ? storeLocation != null : !STORE_LOCATION_EDEFAULT.equals(storeLocation);
			case StorePackage.PRODUCT_ORDER__STORE:
				return store != null;
			case StorePackage.PRODUCT_ORDER__STORE_QUERY:
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
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(", orderingDate: ");
		result.append(orderingDate);
		result.append(", orderEntries: ");
		result.append(orderEntries);
		result.append(", storeName: ");
		result.append(storeName);
		result.append(", storeLocation: ");
		result.append(storeLocation);
		result.append(", storeQuery: ");
		result.append(storeQuery);
		result.append(')');
		return result.toString();
	}

} //ProductOrderImpl

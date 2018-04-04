/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getEnterpriseName <em>Enterprise Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getProductOrders <em>Product Orders</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreImpl#getStockItems <em>Stock Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.store.Store {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnterpriseName() <em>Enterprise Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTERPRISE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterpriseName() <em>Enterprise Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseName()
	 * @generated
	 * @ordered
	 */
	protected String enterpriseName = ENTERPRISE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterprise()
	 * @generated
	 * @ordered
	 */
	protected static final ITradingEnterprise ENTERPRISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterprise()
	 * @generated
	 * @ordered
	 */
	protected ITradingEnterprise enterprise = ENTERPRISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductOrders() <em>Product Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrders()
	 * @generated
	 * @ordered
	 */
	protected Collection<IProductOrder> productOrders;

	/**
	 * The cached value of the '{@link #getStockItems() <em>Stock Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockItems()
	 * @generated
	 * @ordered
	 */
	protected Collection<IStockItem> stockItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.STORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnterpriseName() {
		return enterpriseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseName(String newEnterpriseName) {
		String oldEnterpriseName = enterpriseName;
		enterpriseName = newEnterpriseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__ENTERPRISE_NAME, oldEnterpriseName, enterpriseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradingEnterprise getEnterprise() {
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterprise(ITradingEnterprise newEnterprise) {
		ITradingEnterprise oldEnterprise = enterprise;
		enterprise = newEnterprise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__ENTERPRISE, oldEnterprise, enterprise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductOrder> getProductOrders() {
		return productOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductOrders(Collection<IProductOrder> newProductOrders) {
		Collection<IProductOrder> oldProductOrders = productOrders;
		productOrders = newProductOrders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__PRODUCT_ORDERS, oldProductOrders, productOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStockItem> getStockItems() {
		return stockItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockItems(Collection<IStockItem> newStockItems) {
		Collection<IStockItem> oldStockItems = stockItems;
		stockItems = newStockItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.STORE__STOCK_ITEMS, oldStockItems, stockItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initStore() {
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
	public int compareTo(IStore o) {
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
			case StorePackage.STORE__ID:
				return getId();
			case StorePackage.STORE__NAME:
				return getName();
			case StorePackage.STORE__LOCATION:
				return getLocation();
			case StorePackage.STORE__ENTERPRISE_NAME:
				return getEnterpriseName();
			case StorePackage.STORE__ENTERPRISE:
				return getEnterprise();
			case StorePackage.STORE__PRODUCT_ORDERS:
				return getProductOrders();
			case StorePackage.STORE__STOCK_ITEMS:
				return getStockItems();
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
			case StorePackage.STORE__ID:
				setId((Long)newValue);
				return;
			case StorePackage.STORE__NAME:
				setName((String)newValue);
				return;
			case StorePackage.STORE__LOCATION:
				setLocation((String)newValue);
				return;
			case StorePackage.STORE__ENTERPRISE_NAME:
				setEnterpriseName((String)newValue);
				return;
			case StorePackage.STORE__ENTERPRISE:
				setEnterprise((ITradingEnterprise)newValue);
				return;
			case StorePackage.STORE__PRODUCT_ORDERS:
				setProductOrders((Collection<IProductOrder>)newValue);
				return;
			case StorePackage.STORE__STOCK_ITEMS:
				setStockItems((Collection<IStockItem>)newValue);
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
			case StorePackage.STORE__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.STORE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StorePackage.STORE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case StorePackage.STORE__ENTERPRISE_NAME:
				setEnterpriseName(ENTERPRISE_NAME_EDEFAULT);
				return;
			case StorePackage.STORE__ENTERPRISE:
				setEnterprise(ENTERPRISE_EDEFAULT);
				return;
			case StorePackage.STORE__PRODUCT_ORDERS:
				setProductOrders((Collection<IProductOrder>)null);
				return;
			case StorePackage.STORE__STOCK_ITEMS:
				setStockItems((Collection<IStockItem>)null);
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
			case StorePackage.STORE__ID:
				return id != ID_EDEFAULT;
			case StorePackage.STORE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StorePackage.STORE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case StorePackage.STORE__ENTERPRISE_NAME:
				return ENTERPRISE_NAME_EDEFAULT == null ? enterpriseName != null : !ENTERPRISE_NAME_EDEFAULT.equals(enterpriseName);
			case StorePackage.STORE__ENTERPRISE:
				return ENTERPRISE_EDEFAULT == null ? enterprise != null : !ENTERPRISE_EDEFAULT.equals(enterprise);
			case StorePackage.STORE__PRODUCT_ORDERS:
				return productOrders != null;
			case StorePackage.STORE__STOCK_ITEMS:
				return stockItems != null;
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
			case StorePackage.STORE___INIT_STORE:
				initStore();
				return null;
			case StorePackage.STORE___TO_STRING:
				return toString();
			case StorePackage.STORE___COMPARE_TO__ISTORE:
				return compareTo((IStore)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StoreImpl

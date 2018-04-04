/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trading Enterprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl#getStores <em>Stores</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.TradingEnterpriseImpl#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradingEnterpriseImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise {
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
	 * The cached value of the '{@link #getSuppliers() <em>Suppliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected Collection<IProductSupplier> suppliers;

	/**
	 * The cached value of the '{@link #getStores() <em>Stores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStores()
	 * @generated
	 * @ordered
	 */
	protected Collection<IStore> stores;

	/**
	 * The default value of the '{@link #getEnterpriseQuery() <em>Enterprise Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseQuery()
	 * @generated
	 * @ordered
	 */
	protected static final IEnterpriseQuery ENTERPRISE_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterpriseQuery() <em>Enterprise Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseQuery()
	 * @generated
	 * @ordered
	 */
	protected IEnterpriseQuery enterpriseQuery = ENTERPRISE_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingEnterpriseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.TRADING_ENTERPRISE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.TRADING_ENTERPRISE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.TRADING_ENTERPRISE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductSupplier> getSuppliers() {
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppliers(Collection<IProductSupplier> newSuppliers) {
		Collection<IProductSupplier> oldSuppliers = suppliers;
		suppliers = newSuppliers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.TRADING_ENTERPRISE__SUPPLIERS, oldSuppliers, suppliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStore> getStores() {
		return stores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStores(Collection<IStore> newStores) {
		Collection<IStore> oldStores = stores;
		stores = newStores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.TRADING_ENTERPRISE__STORES, oldStores, stores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEnterpriseQuery getEnterpriseQuery() {
		return enterpriseQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseQuery(IEnterpriseQuery newEnterpriseQuery) {
		IEnterpriseQuery oldEnterpriseQuery = enterpriseQuery;
		enterpriseQuery = newEnterpriseQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.TRADING_ENTERPRISE__ENTERPRISE_QUERY, oldEnterpriseQuery, enterpriseQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initTradingEnterprise() {
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
			case EnterprisePackage.TRADING_ENTERPRISE__ID:
				return getId();
			case EnterprisePackage.TRADING_ENTERPRISE__NAME:
				return getName();
			case EnterprisePackage.TRADING_ENTERPRISE__SUPPLIERS:
				return getSuppliers();
			case EnterprisePackage.TRADING_ENTERPRISE__STORES:
				return getStores();
			case EnterprisePackage.TRADING_ENTERPRISE__ENTERPRISE_QUERY:
				return getEnterpriseQuery();
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
			case EnterprisePackage.TRADING_ENTERPRISE__ID:
				setId((Long)newValue);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__NAME:
				setName((String)newValue);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__SUPPLIERS:
				setSuppliers((Collection<IProductSupplier>)newValue);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__STORES:
				setStores((Collection<IStore>)newValue);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__ENTERPRISE_QUERY:
				setEnterpriseQuery((IEnterpriseQuery)newValue);
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
			case EnterprisePackage.TRADING_ENTERPRISE__ID:
				setId(ID_EDEFAULT);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__SUPPLIERS:
				setSuppliers((Collection<IProductSupplier>)null);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__STORES:
				setStores((Collection<IStore>)null);
				return;
			case EnterprisePackage.TRADING_ENTERPRISE__ENTERPRISE_QUERY:
				setEnterpriseQuery(ENTERPRISE_QUERY_EDEFAULT);
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
			case EnterprisePackage.TRADING_ENTERPRISE__ID:
				return id != ID_EDEFAULT;
			case EnterprisePackage.TRADING_ENTERPRISE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnterprisePackage.TRADING_ENTERPRISE__SUPPLIERS:
				return suppliers != null;
			case EnterprisePackage.TRADING_ENTERPRISE__STORES:
				return stores != null;
			case EnterprisePackage.TRADING_ENTERPRISE__ENTERPRISE_QUERY:
				return ENTERPRISE_QUERY_EDEFAULT == null ? enterpriseQuery != null : !ENTERPRISE_QUERY_EDEFAULT.equals(enterpriseQuery);
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
			case EnterprisePackage.TRADING_ENTERPRISE___INIT_TRADING_ENTERPRISE:
				initTradingEnterprise();
				return null;
			case EnterprisePackage.TRADING_ENTERPRISE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TradingEnterpriseImpl

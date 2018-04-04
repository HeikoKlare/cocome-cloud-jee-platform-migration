/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import javax.enterprise.inject.Instance;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductImpl#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product {
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
	 * The default value of the '{@link #getBarcode() <em>Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcode()
	 * @generated
	 * @ordered
	 */
	protected static final long BARCODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBarcode() <em>Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcode()
	 * @generated
	 * @ordered
	 */
	protected long barcode = BARCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PURCHASE_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected double purchasePrice = PURCHASE_PRICE_EDEFAULT;

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
	 * The default value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected static final IProductSupplier SUPPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected IProductSupplier supplier = SUPPLIER_EDEFAULT;

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
	 * The cached value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected Instance<IContextRegistry> registry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBarcode() {
		return barcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarcode(long newBarcode) {
		long oldBarcode = barcode;
		barcode = newBarcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__BARCODE, oldBarcode, barcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchasePrice(double newPurchasePrice) {
		double oldPurchasePrice = purchasePrice;
		purchasePrice = newPurchasePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__PURCHASE_PRICE, oldPurchasePrice, purchasePrice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSupplier getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(IProductSupplier newSupplier) {
		IProductSupplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__SUPPLIER, oldSupplier, supplier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__ENTERPRISE_QUERY, oldEnterpriseQuery, enterpriseQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance<IContextRegistry> getRegistry() {
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistry(Instance<IContextRegistry> newRegistry) {
		Instance<IContextRegistry> oldRegistry = registry;
		registry = newRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT__REGISTRY, oldRegistry, registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnterprisePackage.PRODUCT__ID:
				return getId();
			case EnterprisePackage.PRODUCT__BARCODE:
				return getBarcode();
			case EnterprisePackage.PRODUCT__PURCHASE_PRICE:
				return getPurchasePrice();
			case EnterprisePackage.PRODUCT__NAME:
				return getName();
			case EnterprisePackage.PRODUCT__SUPPLIER:
				return getSupplier();
			case EnterprisePackage.PRODUCT__ENTERPRISE_QUERY:
				return getEnterpriseQuery();
			case EnterprisePackage.PRODUCT__REGISTRY:
				return getRegistry();
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
			case EnterprisePackage.PRODUCT__ID:
				setId((Long)newValue);
				return;
			case EnterprisePackage.PRODUCT__BARCODE:
				setBarcode((Long)newValue);
				return;
			case EnterprisePackage.PRODUCT__PURCHASE_PRICE:
				setPurchasePrice((Double)newValue);
				return;
			case EnterprisePackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case EnterprisePackage.PRODUCT__SUPPLIER:
				setSupplier((IProductSupplier)newValue);
				return;
			case EnterprisePackage.PRODUCT__ENTERPRISE_QUERY:
				setEnterpriseQuery((IEnterpriseQuery)newValue);
				return;
			case EnterprisePackage.PRODUCT__REGISTRY:
				setRegistry((Instance<IContextRegistry>)newValue);
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
			case EnterprisePackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__BARCODE:
				setBarcode(BARCODE_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__PURCHASE_PRICE:
				setPurchasePrice(PURCHASE_PRICE_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__SUPPLIER:
				setSupplier(SUPPLIER_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__ENTERPRISE_QUERY:
				setEnterpriseQuery(ENTERPRISE_QUERY_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT__REGISTRY:
				setRegistry((Instance<IContextRegistry>)null);
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
			case EnterprisePackage.PRODUCT__ID:
				return id != ID_EDEFAULT;
			case EnterprisePackage.PRODUCT__BARCODE:
				return barcode != BARCODE_EDEFAULT;
			case EnterprisePackage.PRODUCT__PURCHASE_PRICE:
				return purchasePrice != PURCHASE_PRICE_EDEFAULT;
			case EnterprisePackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnterprisePackage.PRODUCT__SUPPLIER:
				return SUPPLIER_EDEFAULT == null ? supplier != null : !SUPPLIER_EDEFAULT.equals(supplier);
			case EnterprisePackage.PRODUCT__ENTERPRISE_QUERY:
				return ENTERPRISE_QUERY_EDEFAULT == null ? enterpriseQuery != null : !ENTERPRISE_QUERY_EDEFAULT.equals(enterpriseQuery);
			case EnterprisePackage.PRODUCT__REGISTRY:
				return registry != null;
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
		result.append(", barcode: ");
		result.append(barcode);
		result.append(", purchasePrice: ");
		result.append(purchasePrice);
		result.append(", name: ");
		result.append(name);
		result.append(", supplier: ");
		result.append(supplier);
		result.append(", enterpriseQuery: ");
		result.append(enterpriseQuery);
		result.append(", registry: ");
		result.append(registry);
		result.append(')');
		return result.toString();
	}

} //ProductImpl

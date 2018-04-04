/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.enterprise.inject.Instance;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.ProductSupplierImpl#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSupplierImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier {
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
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Collection<IProduct> products;

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
	protected ProductSupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.PRODUCT_SUPPLIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT_SUPPLIER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT_SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProduct> getProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducts(Collection<IProduct> newProducts) {
		Collection<IProduct> oldProducts = products;
		products = newProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT_SUPPLIER__PRODUCTS, oldProducts, products));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT_SUPPLIER__ENTERPRISE_QUERY, oldEnterpriseQuery, enterpriseQuery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.PRODUCT_SUPPLIER__REGISTRY, oldRegistry, registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initProductSupplier() {
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
			case EnterprisePackage.PRODUCT_SUPPLIER__ID:
				return getId();
			case EnterprisePackage.PRODUCT_SUPPLIER__NAME:
				return getName();
			case EnterprisePackage.PRODUCT_SUPPLIER__PRODUCTS:
				return getProducts();
			case EnterprisePackage.PRODUCT_SUPPLIER__ENTERPRISE_QUERY:
				return getEnterpriseQuery();
			case EnterprisePackage.PRODUCT_SUPPLIER__REGISTRY:
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
			case EnterprisePackage.PRODUCT_SUPPLIER__ID:
				setId((Long)newValue);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__PRODUCTS:
				setProducts((Collection<IProduct>)newValue);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__ENTERPRISE_QUERY:
				setEnterpriseQuery((IEnterpriseQuery)newValue);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__REGISTRY:
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
			case EnterprisePackage.PRODUCT_SUPPLIER__ID:
				setId(ID_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__PRODUCTS:
				setProducts((Collection<IProduct>)null);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__ENTERPRISE_QUERY:
				setEnterpriseQuery(ENTERPRISE_QUERY_EDEFAULT);
				return;
			case EnterprisePackage.PRODUCT_SUPPLIER__REGISTRY:
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
			case EnterprisePackage.PRODUCT_SUPPLIER__ID:
				return id != ID_EDEFAULT;
			case EnterprisePackage.PRODUCT_SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnterprisePackage.PRODUCT_SUPPLIER__PRODUCTS:
				return products != null;
			case EnterprisePackage.PRODUCT_SUPPLIER__ENTERPRISE_QUERY:
				return ENTERPRISE_QUERY_EDEFAULT == null ? enterpriseQuery != null : !ENTERPRISE_QUERY_EDEFAULT.equals(enterpriseQuery);
			case EnterprisePackage.PRODUCT_SUPPLIER__REGISTRY:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EnterprisePackage.PRODUCT_SUPPLIER___INIT_PRODUCT_SUPPLIER:
				initProductSupplier();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", name: ");
		result.append(name);
		result.append(", products: ");
		result.append(products);
		result.append(", enterpriseQuery: ");
		result.append(enterpriseQuery);
		result.append(", registry: ");
		result.append(registry);
		result.append(')');
		return result.toString();
	}

} //ProductSupplierImpl

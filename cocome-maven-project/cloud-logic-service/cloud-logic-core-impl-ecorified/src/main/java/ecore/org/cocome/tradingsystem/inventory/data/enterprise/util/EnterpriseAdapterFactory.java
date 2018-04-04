/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage
 * @generated
 */
public class EnterpriseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnterprisePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EnterprisePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseSwitch<Adapter> modelSwitch =
		new EnterpriseSwitch<Adapter>() {
			@Override
			public Adapter caseEnterpriseDatatypesFactory(EnterpriseDatatypesFactory object) {
				return createEnterpriseDatatypesFactoryAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProductSupplier(ProductSupplier object) {
				return createProductSupplierAdapter();
			}
			@Override
			public Adapter caseTradingEnterprise(TradingEnterprise object) {
				return createTradingEnterpriseAdapter();
			}
			@Override
			public Adapter caseIProduct(IProduct object) {
				return createIProductAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory <em>Datatypes Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory
	 * @generated
	 */
	public Adapter createEnterpriseDatatypesFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier <em>Product Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier
	 * @generated
	 */
	public Adapter createProductSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise <em>Trading Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise
	 * @generated
	 */
	public Adapter createTradingEnterpriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct <em>IProduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct
	 * @generated
	 */
	public Adapter createIProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EnterpriseAdapterFactory

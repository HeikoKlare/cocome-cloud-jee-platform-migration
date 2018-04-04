/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ecore.org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider;
import ecore.org.cocome.tradingsystem.inventory.data.store.IStockItem;
import ecore.org.cocome.tradingsystem.inventory.data.store.IStore;
import ecore.org.cocome.tradingsystem.inventory.data.store.OrderEntry;
import ecore.org.cocome.tradingsystem.inventory.data.store.ProductOrder;
import ecore.org.cocome.tradingsystem.inventory.data.store.StockItem;
import ecore.org.cocome.tradingsystem.inventory.data.store.Store;
import ecore.org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage
 * @generated
 */
public class StoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreSwitch() {
		if (modelPackage == null) {
			modelPackage = StorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER: {
				EnterpriseStoreQueryProvider enterpriseStoreQueryProvider = (EnterpriseStoreQueryProvider)theEObject;
				T result = caseEnterpriseStoreQueryProvider(enterpriseStoreQueryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.ORDER_ENTRY: {
				OrderEntry orderEntry = (OrderEntry)theEObject;
				T result = caseOrderEntry(orderEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.PRODUCT_ORDER: {
				ProductOrder productOrder = (ProductOrder)theEObject;
				T result = caseProductOrder(productOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.STOCK_ITEM: {
				StockItem stockItem = (StockItem)theEObject;
				T result = caseStockItem(stockItem);
				if (result == null) result = caseIStockItem(stockItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseIStore(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.STORE_DATATYPES_FACTORY: {
				StoreDatatypesFactory storeDatatypesFactory = (StoreDatatypesFactory)theEObject;
				T result = caseStoreDatatypesFactory(storeDatatypesFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.ISTOCK_ITEM: {
				IStockItem iStockItem = (IStockItem)theEObject;
				T result = caseIStockItem(iStockItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StorePackage.ISTORE: {
				IStore iStore = (IStore)theEObject;
				T result = caseIStore(iStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enterprise Store Query Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enterprise Store Query Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseStoreQueryProvider(EnterpriseStoreQueryProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderEntry(OrderEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductOrder(ProductOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockItem(StockItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatypes Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatypes Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreDatatypesFactory(StoreDatatypesFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStock Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStock Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStockItem(IStockItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStore(IStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StoreSwitch

/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CSVHelperImpl extends MinimalEObjectImpl.Container implements ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSVHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParsingPackage.Literals.CSV_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStore> getStores(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<ICustomer> getCustomers(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IUser> getUsers(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<ITradingEnterprise> getEnterprises(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IStockItem> getStockItems(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProduct> getProducts(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductSupplier> getProductSuppliers(String input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<IProductOrder> getProductOrders(String input) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParsingPackage.CSV_HELPER___GET_STORES__STRING:
				return getStores((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_CUSTOMERS__STRING:
				return getCustomers((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_USERS__STRING:
				return getUsers((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_ENTERPRISES__STRING:
				return getEnterprises((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_STOCK_ITEMS__STRING:
				return getStockItems((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_PRODUCTS__STRING:
				return getProducts((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_PRODUCT_SUPPLIERS__STRING:
				return getProductSuppliers((String)arguments.get(0));
			case ParsingPackage.CSV_HELPER___GET_PRODUCT_ORDERS__STRING:
				return getProductOrders((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CSVHelperImpl

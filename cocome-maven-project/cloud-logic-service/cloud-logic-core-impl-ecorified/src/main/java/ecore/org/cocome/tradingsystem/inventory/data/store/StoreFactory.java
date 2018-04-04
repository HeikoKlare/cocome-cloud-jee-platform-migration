package ecore.org.cocome.tradingsystem.inventory.data.store;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage
 * @generated
 */
public interface StoreFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    StoreFactory eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>EnterpriseStoreQueryProvider</em>'.
	 * @return a new object of class '<em>EnterpriseStoreQueryProvider</em>'.
	 * @generated
	 */
	EnterpriseStoreQueryProvider createEnterpriseStoreQueryProvider();	    		
	
	/**
	 * Returns a new object of class '<em>OrderEntry</em>'.
	 * @return a new object of class '<em>OrderEntry</em>'.
	 * @generated
	 */
	OrderEntry createOrderEntry();	    		
	
	/**
	 * Returns a new object of class '<em>ProductOrder</em>'.
	 * @return a new object of class '<em>ProductOrder</em>'.
	 * @generated
	 */
	ProductOrder createProductOrder();	    		
	
	/**
	 * Returns a new object of class '<em>StockItem</em>'.
	 * @return a new object of class '<em>StockItem</em>'.
	 * @generated
	 */
	StockItem createStockItem();	    		
	
	/**
	 * Returns a new object of class '<em>Store</em>'.
	 * @return a new object of class '<em>Store</em>'.
	 * @generated
	 */
	Store createStore();	    		
	
	/**
	 * Returns a new object of class '<em>StoreDatatypesFactory</em>'.
	 * @return a new object of class '<em>StoreDatatypesFactory</em>'.
	 * @generated
	 */
	StoreDatatypesFactory createStoreDatatypesFactory();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorePackage getStorePackage();
	
} //StoreFactory

package ecore.org.cocome.tradingsystem.inventory.data.store.impl;

import org.cocome.tradingsystem.inventory.data.store.EnterpriseStoreQueryProvider;
import org.cocome.tradingsystem.inventory.data.store.OrderEntry;
import org.cocome.tradingsystem.inventory.data.store.ProductOrder;
import org.cocome.tradingsystem.inventory.data.store.StockItem;
import org.cocome.tradingsystem.inventory.data.store.Store;
import org.cocome.tradingsystem.inventory.data.store.StoreDatatypesFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.inventory.data.store.StoreFactory;
import ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class StoreFactoryImpl extends EFactoryImpl implements StoreFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StoreFactory init() {
        try {
            StoreFactory theStoreFactory = (StoreFactory)EPackage.Registry.INSTANCE.getEFactory(StorePackage.eNS_URI);
            if (theStoreFactory != null) {
                return theStoreFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StoreFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public StoreFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case StorePackage.ENTERPRISE_STORE_QUERY_PROVIDER: return createEnterpriseStoreQueryProvider();
			case StorePackage.ORDER_ENTRY: return createOrderEntry();
			case StorePackage.PRODUCT_ORDER: return createProductOrder();
			case StorePackage.STOCK_ITEM: return createStockItem();
			case StorePackage.STORE: return createStore();
			case StorePackage.STORE_DATATYPES_FACTORY: return createStoreDatatypesFactory();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public EnterpriseStoreQueryProvider createEnterpriseStoreQueryProvider() {
		return new EnterpriseStoreQueryProvider(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public OrderEntry createOrderEntry() {
		return new OrderEntry(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ProductOrder createProductOrder() {
		return new ProductOrder(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public StockItem createStockItem() {
		return new StockItem(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Store createStore() {
		return new Store(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public StoreDatatypesFactory createStoreDatatypesFactory() {
		return new StoreDatatypesFactory(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public StorePackage getStorePackage() {
	return (StorePackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StorePackage getPackage() {
        return StorePackage.eINSTANCE;
    }
    
} //StoreFactoryImpl

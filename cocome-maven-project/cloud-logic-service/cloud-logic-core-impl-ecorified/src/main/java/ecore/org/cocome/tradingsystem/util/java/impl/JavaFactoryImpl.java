package ecore.org.cocome.tradingsystem.util.java.impl;

import org.cocome.tradingsystem.util.java.Assert;
import org.cocome.tradingsystem.util.java.DualElement;
import org.cocome.tradingsystem.util.java.DualIterator;
import org.cocome.tradingsystem.util.java.Iterables;
import org.cocome.tradingsystem.util.java.Lists;
import org.cocome.tradingsystem.util.java.Maps;
import org.cocome.tradingsystem.util.java.Reflection;
import org.cocome.tradingsystem.util.java.Sets;
import org.cocome.tradingsystem.util.java.Swing;
import org.cocome.tradingsystem.util.java.TimeSpan;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.util.java.JavaFactory;
import ecore.org.cocome.tradingsystem.util.java.JavaPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JavaFactory init() {
        try {
            JavaFactory theJavaFactory = (JavaFactory)EPackage.Registry.INSTANCE.getEFactory(JavaPackage.eNS_URI);
            if (theJavaFactory != null) {
                return theJavaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JavaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public JavaFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case JavaPackage.ASSERT: return createAssert();
			case JavaPackage.DUAL_ELEMENT: return createDualElement();
			case JavaPackage.DUAL_ITERATOR: return createDualIterator();
			case JavaPackage.ITERABLES: return createIterables();
			case JavaPackage.LISTS: return createLists();
			case JavaPackage.MAPS: return createMaps();
			case JavaPackage.REFLECTION: return createReflection();
			case JavaPackage.SETS: return createSets();
			case JavaPackage.SWING: return createSwing();
			case JavaPackage.TIME_SPAN: return createTimeSpan();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public Assert createAssert() {
		return new Assert(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public DualElement createDualElement() {
		return new DualElement(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public DualIterator createDualIterator() {
		return new DualIterator(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Iterables createIterables() {
		return new Iterables(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Lists createLists() {
		return new Lists(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Maps createMaps() {
		return new Maps(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Reflection createReflection() {
		return new Reflection(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Sets createSets() {
		return new Sets(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Swing createSwing() {
		return new Swing(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public TimeSpan createTimeSpan() {
		return new TimeSpan(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public JavaPackage getJavaPackage() {
	return (JavaPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JavaPackage getPackage() {
        return JavaPackage.eINSTANCE;
    }
    
} //JavaFactoryImpl

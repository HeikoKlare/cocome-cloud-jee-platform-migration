package org.cocome.tradingsystem.util.java;

public class DualElement<T, E> extends unification.org.cocome.tradingsystem.util.java.UnifiedDualElement<T, E> {
	public DualElement(T elem1, E elem2) {
		this.setElem1(elem1);
		this.setElem2(elem2);
	}
	
	public T getFirstElement() {
		return getElem1();
	}
	
	public E getSecondElement() {
		return getElem2();
	}

	public DualElement() {
	}
}

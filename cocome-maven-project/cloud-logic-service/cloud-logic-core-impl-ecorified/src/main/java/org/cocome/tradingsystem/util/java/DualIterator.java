package org.cocome.tradingsystem.util.java;

import java.util.Collection;
import java.util.Iterator;

public class DualIterator<T, E> extends unification.org.cocome.tradingsystem.util.java.UnifiedDualIterator<T, E> implements Iterable<DualElement<T, E>> {
	public DualIterator(Collection<T> coll1, Collection<E> coll2) {
		this.setColl1(coll1);
		this.setColl2(coll2);
		
		if (coll1 != null) {
			setIterator1(coll1.iterator());
		}
		
		if (coll2 != null) {
			setIterator2(coll2.iterator());
		}
	}
	
	@Override
	public Iterator<DualElement<T, E>> iterator() {
		return new Iterator<DualElement<T, E>>() {

			@Override
			public boolean hasNext() {
				if (getColl1() == null || getColl2() == null) return false;
				if (getIterator1() == null || getIterator2() == null) return false;
				
				return getIterator1().hasNext() || getIterator2().hasNext();
			}

			@Override
			public DualElement<T, E> next() {
				if (getColl1() == null || getColl2() == null) return null;
				if (getIterator1() == null || getIterator2() == null) return null;
				
				if (getIterator1().hasNext()) {
					setCurrElement1(getIterator1().next());
				}
				
				if (getIterator2().hasNext()) {
					setCurrElement2(getIterator2().next());
				}
				
				return new DualElement<T, E>(getCurrElement1(), getCurrElement2());
			}

			@Override
			public void remove() {
				if (getColl1() != null) {
					if (getIterator1() != null) {
						getIterator1().remove();
					};
				}
				
				if (getColl2() != null) {
					if (getIterator2() != null) {
						getIterator2().remove();
					}
				}
			}
		};
	}

	public DualIterator() {
	}

}

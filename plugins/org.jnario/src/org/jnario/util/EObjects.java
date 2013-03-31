package org.jnario.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

public class EObjects {

	public static Iterator<EObject> allParents(final EObject eObject){
		return new Iterator<EObject>() {
			EObject current = eObject;
			public boolean hasNext() {
				return current.eContainer() != null;
			}

			public EObject next() {
				current = current.eContainer();
				return current;
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}

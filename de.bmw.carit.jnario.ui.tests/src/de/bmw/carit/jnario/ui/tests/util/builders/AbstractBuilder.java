package de.bmw.carit.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;

public abstract class AbstractBuilder<T> {
	
	protected T result;
	
	public T get() {
		return result;
	}
	
	public abstract T build(IContainer container) throws CoreException;

}

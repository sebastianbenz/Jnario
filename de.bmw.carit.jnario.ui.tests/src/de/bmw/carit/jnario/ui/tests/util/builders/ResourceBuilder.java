package de.bmw.carit.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public interface ResourceBuilder {

	public abstract IResource build(IContainer container) throws CoreException;

}
/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.scoping;

import java.util.Collection;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.hamcrest.CoreMatchers;

import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

import de.bmw.carit.jnario.lib.Each;
import de.bmw.carit.jnario.lib.ExampleTable;
import de.bmw.carit.jnario.lib.ExampleTableIterators;
import de.bmw.carit.jnario.lib.Expectations;
import de.bmw.carit.jnario.lib.Should;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class JnarioExtensionClassNameProvider extends ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(ExampleTable.class, ExampleTableIterators.class);
		result.put(Object.class, Should.class);
		result.put(Object.class, Each.class);
		result.put(Object.class, CoreMatchers.class);
		return result;
	}
	
	@Override
	protected Collection<String> computeLiteralClassNames() {
		Collection<String> result = super.computeLiteralClassNames();
		result.add(Each.class.getName());
		result.add(Expectations.class.getName());
		return result;
	}
	
}

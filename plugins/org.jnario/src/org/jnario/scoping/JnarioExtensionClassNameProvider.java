/*******************************************************************************
# * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.scoping;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StringConversions;
import org.jnario.lib.Wait;
import org.junit.Assert;

import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class JnarioExtensionClassNameProvider extends ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(ExampleTable.class, ExampleTableIterators.class);
//		result.replaceValues(Object.class, ImmutableList.of(Should.class, Each.class, ObjectExtensions.class));
		result.put(Object.class, Should.class);
		result.put(Object.class, Each.class);
		result.put(String.class, StringConversions.class);
		result.put(Iterable.class, JnarioIterableExtensions.class);
		result.put(Iterator.class, JnarioIteratorExtensions.class);
		return result;
	}
	
	@Override
	protected Collection<String> computeLiteralClassNames() {
		Collection<String> result = super.computeLiteralClassNames();
		result.add(Each.class.getName());
		result.add(Should.class.getName());
		result.add(Wait.class.getName());
		result.add(JnarioCollectionLiterals.class.getName());
		result.add(Assert.class.getName());
		return result;
	}
	
}

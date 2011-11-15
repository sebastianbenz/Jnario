package de.bmw.carit.jnario.common.scoping;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.hamcrest.CoreMatchers;

import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

import de.bmw.carit.jnario.lib.JnarioObjectExtensions;

@Singleton
public class JnarioExtensionClassNameProvider extends ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(Object.class, JnarioObjectExtensions.class);
		result.put(Object.class, CoreMatchers.class);
		return result;
	}
	
}

package de.bmw.carit.jnario.spec.scoping;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider.ExtensionClassNameProvider;

import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

import de.bmw.carit.jnario.lib.JnarioObjectExtensions;

@Singleton
public class JnarioExtensionClassNameProvider extends ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(Object.class, JnarioObjectExtensions.class);
		return result;
	}
	
}

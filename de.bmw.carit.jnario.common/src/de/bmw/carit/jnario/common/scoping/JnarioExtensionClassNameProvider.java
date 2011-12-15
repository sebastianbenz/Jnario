package de.bmw.carit.jnario.common.scoping;

import java.util.Collection;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.hamcrest.CoreMatchers;

import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

import de.bmw.carit.jnario.lib.Each;
import de.bmw.carit.jnario.lib.Expectations;
import de.bmw.carit.jnario.lib.XMatchers;

@Singleton
public class JnarioExtensionClassNameProvider extends ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(Object.class, XMatchers.class);
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

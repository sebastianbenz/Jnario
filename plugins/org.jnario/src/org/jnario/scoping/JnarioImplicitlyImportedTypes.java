package org.jnario.scoping;

import java.util.List;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;
import org.jnario.lib.Each;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.lib.Wait;
import org.junit.Assert;

public class JnarioImplicitlyImportedTypes extends ImplicitlyImportedTypes {

	@Override
	protected List<Class<?>> getExtensionClasses() {
		List<Class<?>> result = super.getExtensionClasses();
//		result.remove(ObjectExtensions.class);
		result.add(Should.class);
//		result.add(ObjectExtensions.class);
		result.add(Each.class);
		result.add(StringConversions.class);
		result.add(JnarioIterableExtensions.class);
		result.add(JnarioIteratorExtensions.class);
		result.add(StepArguments.class);
		return result;
	}
	
	@Override
	protected List<Class<?>> getStaticImportClasses() {
		List<Class<?>> result = super.getStaticImportClasses();
		result.add(Each.class);
		result.add(Should.class);
		result.add(Wait.class);
		result.add(JnarioCollectionLiterals.class);
		result.add(Assert.class);
		return result;
	}
	
}

package org.jnario.spec.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScope;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.jnario.scoping.JnarioImportedNamespaceScopeProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Inject;

public class SpecImportedNamespaceScopeProvider extends
		JnarioImportedNamespaceScopeProvider {

	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;
	
	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		if (reference == SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE) {
				Resource resource = context.eResource();
				IJvmTypeProvider typeProvider = typeScopeProvider.getTypeProvider(resource.getResourceSet());
				AbstractTypeScope typeScope = typeScopeProvider.createTypeScope(typeProvider, null);
				return SelectableBasedScope.createScope(typeScope, getAllDescriptions(resource), reference.getEReferenceType(), false);
		}else{
			return super.getScope(context, reference);
		}
	}

}

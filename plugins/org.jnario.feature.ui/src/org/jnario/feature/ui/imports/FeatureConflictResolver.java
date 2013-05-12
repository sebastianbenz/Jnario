package org.jnario.feature.ui.imports;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.imports.ConflictResolver;
import org.eclipse.xtext.xbase.imports.NonOverridableTypesProvider;
import org.eclipse.xtext.xbase.imports.TypeUsages;
import org.jnario.lib.StepArguments;

public class FeatureConflictResolver extends ConflictResolver {

	@Override
	public Map<String, JvmDeclaredType> resolveConflicts(TypeUsages usages,
			NonOverridableTypesProvider nonOverridableTypesProvider,
			XtextResource resource) {
		Map<String, JvmDeclaredType> resolveConflicts = super.resolveConflicts(usages, nonOverridableTypesProvider, resource);
		resolveConflicts.remove(StepArguments.class.getName());
		return resolveConflicts;
	}
	
	@Override
	protected boolean isConflictsWithNonOverridableTypes(
			Iterable<JvmDeclaredType> types, TypeUsages usages,
			NonOverridableTypesProvider nonOverridableTypesProvider,
			String simpleName) {
		if(StepArguments.class.getSimpleName().equals(simpleName)){
			return true;
		}
		return super.isConflictsWithNonOverridableTypes(types, usages,
				nonOverridableTypesProvider, simpleName);
	}
	
}

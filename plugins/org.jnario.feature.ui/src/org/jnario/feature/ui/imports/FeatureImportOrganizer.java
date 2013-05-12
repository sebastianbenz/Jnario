package org.jnario.feature.ui.imports;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.imports.ImportOrganizer;
import org.eclipse.xtext.xbase.imports.NonOverridableTypesProvider;
import org.eclipse.xtext.xbase.imports.TypeUsage;
import org.jnario.lib.StepArguments;

public class FeatureImportOrganizer extends ImportOrganizer {

	@Override
	protected boolean needsImport(JvmDeclaredType type, String name,
			NonOverridableTypesProvider nonOverridableTypesProvider,
			Iterable<TypeUsage> usages) {
		if(StepArguments.class.getSimpleName().equals(name)){
			return false;
		}
		return super.needsImport(type, name, nonOverridableTypesProvider, usages);
	}
	
}

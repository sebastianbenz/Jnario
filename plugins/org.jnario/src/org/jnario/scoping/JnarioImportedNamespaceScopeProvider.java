package org.jnario.scoping;

import java.util.List;

import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

public class JnarioImportedNamespaceScopeProvider extends
		XtendImportedNamespaceScopeProvider {

	public static final QualifiedName JNARIO_LIB = QualifiedName.create("org","jnario","lib");
	
	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> implicitImports = super.getImplicitImports(ignoreCase);
		implicitImports.add(new ImportNormalizer(JNARIO_LIB, true, false));
		return implicitImports;
	}
}

package org.jnario.spec.ui.validator;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.ide.validator.XtendUIValidator;
import org.jnario.JnarioPackage;
import org.jnario.spec.spec.SpecPackage;

public class SpecUIValidator extends XtendUIValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> packages = super.getEPackages();
		packages.add(SpecPackage.eINSTANCE);
		return packages;
	}
}

package org.jnario.feature.validation;

import static com.google.common.collect.Iterables.filter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.jnario.feature.feature.FeaturePackage;

import com.google.common.base.Predicate;

public class FeatureNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {
	
	@Override
	public void checkUniqueNames(Iterable<IEObjectDescription> descriptions,
			CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		Iterable<IEObjectDescription> onlySteps = filter(descriptions, new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return FeaturePackage.Literals.STEP_IMPLEMENTATION.isSuperTypeOf(input.getEClass());
			}
		});
		super.checkUniqueNames(onlySteps, cancelIndicator, acceptor);
	}
	
	@Override
	protected EClass getAssociatedClusterType(EClass eClass) {
		if(FeaturePackage.Literals.STEP_IMPLEMENTATION.isSuperTypeOf(eClass)){
			return FeaturePackage.Literals.STEP_IMPLEMENTATION;
		}
		return super.getAssociatedClusterType(eClass);
	}
	
}

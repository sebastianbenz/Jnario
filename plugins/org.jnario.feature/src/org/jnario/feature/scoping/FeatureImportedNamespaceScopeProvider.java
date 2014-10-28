package org.jnario.feature.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.scoping.JnarioImportedNamespaceScopeProvider;

import com.google.common.collect.Lists;

public class FeatureImportedNamespaceScopeProvider extends
		JnarioImportedNamespaceScopeProvider {

	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		if (reference == FeaturePackage.Literals.STEP_REFERENCE__REFERENCE
				|| reference == FeaturePackage.Literals.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE) {
			IScope globalScope = getGlobalScope(context.eResource(), reference);
			return internalGetScope(globalScope, globalScope, context,
					reference);
		} else {
			return super.getScope(context, reference);
		}
	}

	@Override
	protected ISelectable internalGetAllDescriptions(final Resource resource) {
		List<IEObjectDescription> descriptions = Lists.newArrayList();
		for (EObject content : resource.getContents()) {
			if (content instanceof JvmDeclaredType) {
				doGetAllDescriptions((JvmDeclaredType) content, descriptions);
			} else if (content instanceof FeatureFile) {
				doGetAllDescriptions(((FeatureFile) content), descriptions);
			}
		}
		return new MultimapBasedSelectable(descriptions);
	}

	private void doGetAllDescriptions(FeatureFile featureFile,
			List<IEObjectDescription> descriptions) {
		for (XtendTypeDeclaration typeDeclaration : featureFile.getXtendTypes()) {
			if (typeDeclaration instanceof Feature) {
				doGetAllDescriptions((Feature) typeDeclaration, descriptions);
			}
		}

	}

	private void doGetAllDescriptions(Feature feature,
			List<IEObjectDescription> descriptions) {
		for (Scenario scenario : feature.getScenarios()) {
			doGetAllDescriptions(descriptions, scenario);
		}
	}

	private void doGetAllDescriptions(List<IEObjectDescription> descriptions,
			Scenario scenario) {
		for (Step step : scenario.getSteps()) {
			descriptions.add(EObjectDescription.create(
					getQualifiedNameProvider().apply(step), step));
		}
	}

	private void doGetAllDescriptions(JvmDeclaredType type,
			List<IEObjectDescription> descriptions) {
		descriptions.add(EObjectDescription.create(getQualifiedNameConverter()
				.toQualifiedName(type.getIdentifier()), type));
		for (JvmMember member : type.getMembers()) {
			if (member instanceof JvmDeclaredType) {
				doGetAllDescriptions((JvmDeclaredType) member, descriptions);
			}
		}
	}

}

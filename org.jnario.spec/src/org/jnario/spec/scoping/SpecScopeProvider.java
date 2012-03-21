/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.scoping;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.scoping.ExtensionMethodsFeaturesProvider;
import org.eclipse.xtend.core.scoping.XtendScopeProvider;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.jnario.CollectionLiteral;
import org.jnario.spec.naming.OperationNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecScopeProvider extends XtendScopeProvider {
	
	private static final int DEFAULT_EXTENSION_PRIORITY = 45;
	
	private static final int THIS_EXTENSION_PRIORITY_OFFSET = 200;
	private static final int DYNAMIC_EXTENSION_PRIORITY_OFFSET = 210;
	
	@Inject
	private IXtendJvmAssociations xtendjvmAssociations;
	
	@Inject
	private Provider<ExtensionMethodsFeaturesProvider> extensionMethodsFeaturesProvider;

	@Inject
	private TypeReferences typeReferences;
	
	@Inject
	private OperationNameProvider operationNameProvider;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION){
			return targetOperation(context, reference);
		}else if(reference == XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE && (context instanceof CollectionLiteral)){
			return collectionLiteralScope((CollectionLiteral)context);
		}
		return super.getScope(context, reference);
	}

	private IScope collectionLiteralScope(CollectionLiteral context) {
		IScope scope = super.getScope(context, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
		return scope;
	}

	private IScope targetOperation(EObject subject, EReference reference) {
		ExampleGroup context = getContainerOfType(subject.eContainer(), ExampleGroup.class);
		if(context == null){
			return IScope.NULLSCOPE;
		}
		
		JvmTypeReference targetTypeReference = context.getTargetType();
		if(targetTypeReference == null){
			return IScope.NULLSCOPE;
		}
		
		JvmType targetType = targetTypeReference.getType();
		if(targetType == null || targetType.eIsProxy()){
			return IScope.NULLSCOPE;
		}
		if (!(targetType instanceof JvmGenericType)) {
			return IScope.NULLSCOPE;
		}
		Iterable<JvmOperation> operations = filter(((JvmGenericType) targetType).getMembers(), JvmOperation.class);
		
		IScope simpleNames = scopeFor(operations, simpleNameProvider(), IScope.NULLSCOPE);
		return scopeFor(operations, operationNameProvider, simpleNames);
	}

	private Function<JvmOperation, QualifiedName> simpleNameProvider() {
		return new Function<JvmOperation, QualifiedName>(){

			public QualifiedName apply(JvmOperation input) {
				return QualifiedName.create(input.getSimpleName());
			}
			
		};
	}
	
	@Override
	protected void addFeatureDescriptionProviders(
			Resource resource, 
			JvmDeclaredType contextType,
			XExpression implicitReceiver,
			XExpression implicitArgument,
			int priority,
			IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
		super.addFeatureDescriptionProviders(resource, contextType, implicitReceiver, implicitArgument, priority, acceptor);
		if(contextType == null){
			return;
		}
		EObject source = xtendjvmAssociations.getPrimarySourceElement(contextType);
		// extensions for this
		if (contextType != null && source instanceof ExampleGroup) {
			boolean isThis = false;
			if (implicitReceiver instanceof XFeatureCall) {
				isThis = ((XFeatureCall) implicitReceiver).getFeature() == contextType;
			}
			if (implicitReceiver == null || isThis) {
				XFeatureCall callToThis = XbaseFactory.eINSTANCE.createXFeatureCall();
				callToThis.setFeature(contextType);
				// injected extensions
				Iterable<XtendField> extensionFields = getExtensionDependencies((XtendClass) source);
				int extensionPriority = priority + DYNAMIC_EXTENSION_PRIORITY_OFFSET;
				if (isThis && implicitArgument == null)
					extensionPriority = DEFAULT_EXTENSION_PRIORITY;
				boolean isStatic = isStaticContext(((SimpleAcceptor)acceptor).getExpression());
				for (XtendField extensionField : extensionFields) {
					JvmIdentifiableElement dependencyImplicitReceiver = findImplicitReceiverFor(extensionField);
					XMemberFeatureCall callToDependency = XbaseFactory.eINSTANCE.createXMemberFeatureCall();
					callToDependency.setMemberCallTarget(EcoreUtil2.clone(callToThis));
					callToDependency.setFeature(dependencyImplicitReceiver);
					if (dependencyImplicitReceiver != null) {
						ExtensionMethodsFeaturesProvider extensionFeatureProvider = extensionMethodsFeaturesProvider.get();
						extensionFeatureProvider.setContext(extensionField.getType());
						extensionFeatureProvider.setExpectNoParameters(isThis);
						addFeatureDescriptionProviders(contextType, extensionFeatureProvider, callToDependency, implicitArgument, extensionPriority, isStatic, acceptor);
					}
				}
				JvmTypeReference typeRef = typeReferences.createTypeRef(contextType);
				ExtensionMethodsFeaturesProvider featureProvider = extensionMethodsFeaturesProvider.get();
				featureProvider.setContext(typeRef);
				featureProvider.setExpectNoParameters(isThis);
				addFeatureDescriptionProviders(contextType, featureProvider, callToThis, implicitArgument, priority + THIS_EXTENSION_PRIORITY_OFFSET, isStatic, acceptor);
			}
		}
		
	}
	
}

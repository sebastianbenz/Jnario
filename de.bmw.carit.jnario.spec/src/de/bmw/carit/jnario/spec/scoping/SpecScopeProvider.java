package de.bmw.carit.jnario.spec.scoping;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xtend2.scoping.ExtensionMethodsFeaturesProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.naming.OperationNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecPackage;

/**
 * Partially copied from Xtend2ScopeProvider
 * @author Sven Efftinge
 * @author Sebastian Zarnekow - Implicit first argument
 */
@SuppressWarnings("restriction")
public class SpecScopeProvider extends XbaseWithAnnotationsScopeProvider {
	
	@Inject
	private OperationNameProvider operationNameProvider;

	private static final int IMPORTED_STATIC_FEATURE_PRIORITY = 50;
	private static final int DEFAULT_EXTENSION_PRIORITY = 45;
	private static final int IMPLICIT_ARGUMENT_PRIORITY = 400;
	
	private static final int THIS_EXTENSION_PRIORITY_OFFSET = 200;
	private static final int DYNAMIC_EXTENSION_PRIORITY_OFFSET = 210;
	private static final int STATIC_EXTENSION_PRIORITY_OFFSET = 220;
	
	@Inject
	private IJvmModelAssociations xtend2jvmAssociations;

	@Inject
	private Provider<StaticallyImportedFeaturesProvider> staticallyImportedFeaturesProvider;

	@Inject
	private Provider<ExtensionMethodsFeaturesProvider> extensionMethodsFeaturesProvider;

	@Inject
	private TypeReferences typeReferences;

	@Override
	protected void addStaticFeatureDescriptionProviders(
			Resource resource, 
			JvmDeclaredType contextType,
			IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
		super.addStaticFeatureDescriptionProviders(resource, contextType, acceptor);
		
		StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider.get();
		staticProvider.setResourceContext(resource);
		staticProvider.setExtensionProvider(false);
		
		addFeatureDescriptionProviders(contextType, staticProvider, null, null, IMPORTED_STATIC_FEATURE_PRIORITY, true, acceptor);
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
		
		if (implicitReceiver == null || implicitArgument != null) {
			final StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider.get();
			staticProvider.setResourceContext(resource);
			staticProvider.setExtensionProvider(true);
			if (implicitArgument != null) {
				// use the implicit argument as implicit receiver
				SimpleAcceptor casted = (SimpleAcceptor) acceptor;
				JvmTypeReference implicitArgumentType = getTypeProvider().getType(implicitArgument, true);
				IAcceptor<IJvmFeatureDescriptionProvider> myAcceptor = casted.getParent().curry(implicitArgumentType, casted.getExpression());
				addFeatureDescriptionProviders(contextType, staticProvider, implicitArgument, null, priority + STATIC_EXTENSION_PRIORITY_OFFSET, true, myAcceptor);
			} else {
				addFeatureDescriptionProviders(contextType, staticProvider, implicitReceiver, implicitArgument, priority + STATIC_EXTENSION_PRIORITY_OFFSET, true, acceptor);
			}
		}
		
	}
	

	@Override
	protected void addFeatureCallScopes(
			EObject featureCall, 
			final IScope localVariableScope,
			final IJvmFeatureScopeAcceptor featureScopeDescriptions) {
		IEObjectDescription implicitThis = localVariableScope.getSingleElement(THIS);
		if (implicitThis != null) {
			EObject implicitReceiver = implicitThis.getEObjectOrProxy();
			if (implicitReceiver instanceof JvmIdentifiableElement) {
				JvmTypeReference receiverType = getTypeProvider().getTypeForIdentifiable((JvmIdentifiableElement) implicitReceiver);
				if (receiverType != null) {
					XFeatureCall receiver = XbaseFactory.eINSTANCE.createXFeatureCall();
					receiver.setFeature((JvmIdentifiableElement) implicitReceiver);
					IEObjectDescription implicitIt = localVariableScope.getSingleElement(IT);
					if (implicitIt != null) {
						EObject implicitArgument = implicitIt.getEObjectOrProxy();
						if (implicitArgument instanceof JvmIdentifiableElement) {
							JvmTypeReference argumentType = getTypeProvider().getTypeForIdentifiable((JvmIdentifiableElement) implicitArgument);
							if (argumentType != null) {
								XFeatureCall argument = XbaseFactory.eINSTANCE.createXFeatureCall();
								argument.setFeature((JvmIdentifiableElement) implicitArgument);
								addFeatureScopes(receiverType, featureCall, getContextType(featureCall), receiver, argument, IMPLICIT_ARGUMENT_PRIORITY, featureScopeDescriptions);
							}
						}
					}
				}
			}
		}
		super.addFeatureCallScopes(featureCall, localVariableScope, featureScopeDescriptions);
	}
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION){
			return targetOperation(context, reference);
		}
		return super.getScope(context, reference);
	}


	private IScope targetOperation(EObject subject, EReference reference) {
		ExampleGroup context = EcoreUtil2.getContainerOfType(subject.eContainer(), ExampleGroup.class);
		if(context == null){
			return IScope.NULLSCOPE;
		}
		JvmDeclaredType targetType = context.getTargetType();
		if(targetType == null){
			return IScope.NULLSCOPE;
		}
		Iterable<JvmOperation> operations = filter(targetType.getMembers(), JvmOperation.class);
		return scopeFor(operations, operationNameProvider, IScope.NULLSCOPE);
	}
	
}

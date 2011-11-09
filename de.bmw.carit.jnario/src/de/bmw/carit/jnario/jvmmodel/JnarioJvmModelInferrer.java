package de.bmw.carit.jnario.jvmmodel;

import static com.google.common.collect.Iterators.filter;
import static org.eclipse.xtext.EcoreUtil2.cloneWithProxies;

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;
import com.google.inject.internal.BytecodeGen.Visibility;

import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;

public class JnarioJvmModelInferrer implements IJvmModelInferrer{
	
	@Inject
	protected TypesFactory typesFactory;
	
	@Inject
	private IJvmModelAssociator associator;
	
	@Inject
	private JvmTypesBuilder jvmTypesBuilder;
	
	@Inject 
	private JnarioCompileStrategies compileStrategies;
	
	@Inject
	private ITypeProvider typeProvider;

	@Override
	public void infer(EObject e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
		if (e instanceof Jnario){
			final Jnario jnarioSpec = (Jnario) e;
			JvmGenericType inferredJvmType = transform(jnarioSpec, prelinkingPhase);
			acceptor.accept(inferredJvmType);
		}
	}
	
	protected JvmGenericType transform(Jnario jnarioSpec, boolean prelinkingPhase){
		// FIXME: generate one class for each scenario, now only first scenario is generated
		for(Scenario scenario: jnarioSpec.getScenarios()){
			return transform(scenario, prelinkingPhase);
		}
		return null;
	}
	
	protected JvmGenericType transform(Scenario scenario, boolean prelinkingPhase){
		JvmGenericType inferredJvmType = typesFactory.createJvmGenericType();
		scenario.eResource().getContents().add(inferredJvmType);
		associator.associatePrimary(scenario, inferredJvmType);

//		inferredJvmType.setPackageName(scenario.getPackageName());
		inferredJvmType.setSimpleName(extractValidName(scenario.getName()) + "1");
		inferredJvmType.setVisibility(JvmVisibility.PUBLIC);
		if (!prelinkingPhase) {
			generateVariables(scenario, inferredJvmType);
			
			addConstructor(scenario, inferredJvmType);
			for (Step step : scenario.getSteps()) {
				transform(step, inferredJvmType);
			}
//			computeInferredReturnTypes(inferredJvmType);
//			jvmTypesBuilder.translateAnnotationsTo(scenario.getAnnotations(), inferredJvmType);
//			jvmTypesBuilder.setDocumentation(inferredJvmType, jvmTypesBuilder.getDocumentation(scenario));
//			nameClashResolver.resolveNameClashes(inferredJvmType);
		}
		return inferredJvmType;
	}

	private void generateVariables(Scenario scenario, JvmGenericType inferredJvmType) {
		Iterator<EObject> eAllContents = scenario.eAllContents();
		Iterator<XVariableDeclaration> allVariables = filter(eAllContents, XVariableDeclaration.class);
		while(allVariables.hasNext()){
			XVariableDeclaration currentDec = allVariables.next();
			JvmField field = typesFactory.createJvmField();
			field.setSimpleName(currentDec.getSimpleName());
			JvmTypeReference type;
			if (currentDec.getType() != null) {
				type = currentDec.getType();
			} else {
				type = typeProvider.getType(currentDec.getRight());
			}
			
			if(type != null && type.getType() instanceof JvmDeclaredType){
				field.setType(type);
				inferredJvmType.getMembers().add(field);
				associator.associatePrimary(scenario, field);
			}
			
		}
	}

	protected void addConstructor(Scenario scenario, JvmGenericType inferredJvmType) {
		JvmConstructor constructor = typesFactory.createJvmConstructor();
		constructor.setSimpleName(extractValidName(scenario.getName()));
		constructor.setVisibility(JvmVisibility.PUBLIC);
		inferredJvmType.getMembers().add(constructor);
		associator.associatePrimary(scenario, constructor);
	}
	
	protected JvmMember transform(Step step, JvmGenericType inferredJvmType) {
		
		JvmOperation operation = typesFactory.createJvmOperation();
		inferredJvmType.getMembers().add(operation);
		associator.associatePrimary(step, operation);
		operation.setSimpleName("testMethod");
		operation.setVisibility(JvmVisibility.PUBLIC);
//		operation.setReturnType();
		
		jvmTypesBuilder.setBody(operation, compileStrategies.forGivenMethod(step.getCode().getBlockExpression()));
		
		return operation;
	}
	
	protected void computeInferredReturnTypes(JvmGenericType inferredJvmType) {
		Iterable<JvmOperation> operations = inferredJvmType.getDeclaredOperations();
		for (JvmOperation jvmOperation : operations) {
			if (!jvmOperation.eIsSet(TypesPackage.Literals.JVM_OPERATION__RETURN_TYPE))
				jvmOperation.setReturnType(getTypeProxy(jvmOperation));
		}
	}

	protected JvmTypeReference getTypeProxy(EObject pointer) {
		JvmParameterizedTypeReference typeReference = typesFactory.createJvmParameterizedTypeReference();
		final Resource eResource = pointer.eResource();
		String fragment = eResource.getURIFragment(pointer);
		URI uri = eResource.getURI();
		uri = uri.appendFragment(fragment);
		((InternalEObject) typeReference).eSetProxyURI(uri);
		return typeReference;
	}
	
	public static String extractValidName(String originalName){
		String name = "";
		String[] words = originalName.split(" ");
		for(String word: words){
			// make first letter upper case and join them to name
			String firstLetter = word.charAt(0) + "";
			name = name + firstLetter.toUpperCase() + word.substring(1);
		}
		
		String firstLetter = name.charAt(0) + "";
		firstLetter = firstLetter.toLowerCase();
		name = firstLetter + name.substring(1);
		
		return name.replaceAll("[^A-Za-z0-9_]","");
	}

}

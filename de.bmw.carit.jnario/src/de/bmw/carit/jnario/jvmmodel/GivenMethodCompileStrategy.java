package de.bmw.carit.jnario.jvmmodel;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;

public class GivenMethodCompileStrategy implements Functions.Function1<ImportManager, CharSequence> {

	@Inject
	private ITypeProvider typeProvider;

	@Inject
	private XbaseCompiler compiler;
	
	private XBlockExpression expression;

	protected void initialize(XBlockExpression expression) {
		this.expression = expression;
	}

	public CharSequence apply(ImportManager importManager) {

		final StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(importManager);
		
//		XConstructorCall xConstructorCall = XbaseFactory.eINSTANCE.createXConstructorCall();
//		JvmConstructor constructor = TypesFactory.eINSTANCE.createJvmConstructor();
//		constructor.setDeclaringType(value);
//		xConstructorCall.setConstructor();
//		
//		XVariableDeclaration xVariableDeclaration = XbaseFactory.eINSTANCE.createXVariableDeclaration();
//		xVariableDeclaration.setName("context");
//		xVariableDeclaration.setRight(newContext);
		
		JvmParameterizedTypeReference reference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
		reference.setType(TypesFactory.eINSTANCE.createJvmVoid());
		
		compiler.compile(expression, appendable, reference);

		return appendable.toString();
	}

}
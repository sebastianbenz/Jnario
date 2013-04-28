package org.jnario.typing;

import org.eclipse.xtend.core.typesystem.XtendTypeComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.jnario.Assertion;
import org.jnario.ShouldThrow;

import com.google.inject.Inject;

public class JnarioTypeComputer extends XtendTypeComputer {
	
	@Inject CommonTypeComputationServices services;
	@Inject TypeReferences  typeReferences;
	
	@Override
	public void computeTypes(XExpression expression, ITypeComputationState state) {
		if(expression instanceof Assertion){
			_computeType((Assertion)expression, state);
		}else if(expression instanceof ShouldThrow){
			_computeType((ShouldThrow)expression, state);
		}else{
			super.computeTypes(expression, state);
		}
	}
	
	private void _computeType(ShouldThrow expression, ITypeComputationState state) {
		ITypeComputationState expressionState = state.withoutExpectation();
		expressionState.computeTypes(expression.getExpression());
		state.acceptActualType(getPrimitiveVoid(state), ConformanceHint.NO_IMPLICIT_RETURN);
	}

	private void _computeType(Assertion assertion, ITypeComputationState state){
		ITypeComputationState conditionExpectation = state.withExpectation(getTypeForName(Boolean.TYPE, state));
		conditionExpectation.computeTypes(assertion.getExpression());
	}
	
}
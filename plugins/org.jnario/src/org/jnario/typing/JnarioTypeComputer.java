package org.jnario.typing;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.xtend.core.typesystem.XtendTypeComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationResult;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.legacy.StandardTypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter;
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.jnario.Assertion;
import org.jnario.ExampleColumn;
import org.jnario.ShouldThrow;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
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
		}else if(expression instanceof ExampleColumn){
			_computeType((ExampleColumn)expression, state);
		}else{
			super.computeTypes(expression, state);
		}
	}
	
	protected void _computeType(ExampleColumn column, ITypeComputationState state) {
		ITypeReferenceOwner owner = state.getReferenceOwner();
		ITypeComputationState childState;
		LightweightTypeReference actualType = null;
		if(column.getType() != null){
			actualType = new OwnedConverter(owner).apply(column.getType());
			childState = state.withExpectation(actualType);
			for (XExpression cell : column.getCells()) {
				childState.computeTypes(cell).getActualExpressionType();
			}
		}else{
			childState = state.withoutExpectation();
			List<LightweightTypeReference> types = newArrayList();
			for (XExpression cell : column.getCells()) {
				types.add(childState.computeTypes(cell).getActualExpressionType());
			}
			if(!types.isEmpty()){
				actualType = services.getTypeConformanceComputer().getCommonSuperType(types, owner);
			}
		}
		state.acceptActualType(actualType);
	}
	
	private void _computeType(ShouldThrow expression, ITypeComputationState state) {
		LightweightTypeReference throwable = getTypeForName(Throwable.class, state);
		ITypeComputationState expressionState = state.withExpectation(throwable);
		expressionState.computeTypes(expression.getExpression());
		state.acceptActualType(getPrimitiveVoid(state), ConformanceHint.NO_IMPLICIT_RETURN);
	}

	private void _computeType(Assertion assertion, ITypeComputationState state){
		ITypeComputationState conditionExpectation = state.withExpectation(getTypeForName(Boolean.TYPE, state));
		conditionExpectation.computeTypes(assertion.getExpression());
	}
	
}
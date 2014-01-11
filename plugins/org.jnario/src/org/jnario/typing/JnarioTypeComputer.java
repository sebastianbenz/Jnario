package org.jnario.typing;


import static org.jnario.jvmmodel.DoubleArrowSupport.isDoubleArrow;

import java.util.List;

import org.eclipse.xtend.core.typesystem.XtendTypeComputer;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.jnario.Assertion;
import org.jnario.Should;
import org.jnario.ShouldThrow;

import com.google.inject.Inject;

public class JnarioTypeComputer extends XtendTypeComputer {

	@Inject
	CommonTypeComputationServices services;
	@Inject
	TypeReferences typeReferences;

	@Override
	public void computeTypes(XExpression expression, ITypeComputationState state) {
		if (expression instanceof Assertion) {
			_computeType((Assertion) expression, state);
		} else if (expression instanceof ShouldThrow) {
			_computeType((ShouldThrow) expression, state);
		} else {
			super.computeTypes(expression, state);
		}
	}

	private void _computeType(ShouldThrow expression,
			ITypeComputationState state) {
		ITypeComputationState expressionState = state.withoutExpectation();
		expressionState.computeTypes(expression.getExpression());
		state.acceptActualType(getPrimitiveVoid(state),
				ConformanceHint.NO_IMPLICIT_RETURN);
	}

	private void _computeType(Assertion assertion, ITypeComputationState state) {
		ITypeComputationState conditionExpectation = state
				.withExpectation(getTypeForName(Boolean.TYPE, state));
		conditionExpectation.computeTypes(assertion.getExpression());
	}

	protected void _computeTypes(final XAbstractFeatureCall featureCall,
			ITypeComputationState state) {
		if (isShouldBeNull(featureCall) || isDoubleArrowNull(featureCall)) {
			List<? extends IFeatureLinkingCandidate> candidates = state.getLinkingCandidates(featureCall);
			for (IFeatureLinkingCandidate candidate : candidates) {
				if (candidate.getFeature() instanceof JvmOperation) {
					JvmOperation operation = (JvmOperation) candidate.getFeature();
					if(canHandleNullArg(operation)){
						candidate.applyToComputationState();
						return;
					}
				}
			}
		} else {
			super._computeTypes(featureCall, state);
		}
	}

	private boolean canHandleNullArg(JvmOperation operation) {
		if(operation.getParameters().size() != 2){
			return false;
		}
		JvmTypeReference parameterType = operation.getParameters().get(1).getParameterType();
		if(parameterType == null){
			return false;
		}
		return !(parameterType.getType() instanceof JvmPrimitiveType);
	}

	private boolean isDoubleArrowNull(final XAbstractFeatureCall featureCall) {
		return isDoubleArrow(featureCall) && ((XBinaryOperation)featureCall).getRightOperand() instanceof XNullLiteral;
	}

	private boolean isShouldBeNull(final XAbstractFeatureCall featureCall) {
		return featureCall instanceof Should && ((Should) featureCall).getRightOperand() instanceof XNullLiteral;
	}

}
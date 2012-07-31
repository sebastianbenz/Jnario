package org.jnario.ui.quickfix;

import java.util.Collections;

import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xbase.typesystem.util.TypeParameterByConstraintSubstitutor;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class TypeSubstitutionHelper {

	@Inject CommonTypeComputationServices computationServices;

	public TypeParameterByConstraintSubstitutor typeParameterByConstraintSubstitutor(){
		return new TypeParameterByConstraintSubstitutor(Collections.<JvmTypeParameter, JvmTypeReference>emptyMap(), computationServices);
	}
	
}

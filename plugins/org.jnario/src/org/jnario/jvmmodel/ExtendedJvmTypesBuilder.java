/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel;

import static java.util.Collections.singletonList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class ExtendedJvmTypesBuilder extends JvmTypesBuilder {

	@Inject
	private TypeReferences references;
	
	public JvmAnnotationReference toAnnotation(EObject sourceElement, String annotationTypeName, String valueName, Object value) {
		JvmAnnotationReference result = TypesFactory.eINSTANCE.createJvmAnnotationReference();
		JvmType jvmType = references.findDeclaredType(annotationTypeName, sourceElement);
		if(jvmType == null){
			return null;
		}
		if (!(jvmType instanceof JvmAnnotationType)) {
			return null;
		}
		result.setAnnotation((JvmAnnotationType) jvmType);
		if(value == null){
			return result;
		}
		Iterable<?> values;
		if (!(value instanceof Iterable<?>)) {
			values = singletonList(value);
		}else{
			values = (Iterable<?>) value;
		}
		JvmAnnotationValue annotationValue = null;
		for (Object object : values) {
			if (object instanceof String) {
				if(annotationValue == null){
					annotationValue = TypesFactory.eINSTANCE.createJvmStringAnnotationValue();
				}
				((JvmStringAnnotationValue)annotationValue).getValues().add((String) value);
			}else if(object instanceof Class<?>){
				JvmType type = references.findDeclaredType((Class<?>) value, sourceElement);
				if(annotationValue == null){
					annotationValue = TypesFactory.eINSTANCE.createJvmTypeAnnotationValue();
				}
				if(type != null){
					((JvmTypeAnnotationValue)annotationValue).getValues().add(references.createTypeRef(type));
				}
			}else if(object instanceof JvmGenericType){
				if(annotationValue == null){
					annotationValue = TypesFactory.eINSTANCE.createJvmTypeAnnotationValue();
				}
				((JvmTypeAnnotationValue)annotationValue).getValues().add(references.createTypeRef((JvmGenericType)object));
			}else if (value instanceof Integer) {
				if(annotationValue == null){
					annotationValue = TypesFactory.eINSTANCE.createJvmIntAnnotationValue();
				}
				((JvmIntAnnotationValue)annotationValue).getValues().add((Integer) value);
			}
		}
		if(annotationValue == null){
			return result;
		}
		setAnnotationValueName(valueName, jvmType, annotationValue);
		result.getValues().add(annotationValue);
		return result;
	}

	protected void setAnnotationValueName(String valueName, JvmType jvmType,
			JvmAnnotationValue annotationValue) {
		for (JvmOperation  operation: ((JvmAnnotationType)jvmType).getDeclaredOperations()) {
			if(operation.getSimpleName().equals(valueName)){
				annotationValue.setOperation(operation);
			}
		}
	}
	
	public JvmAnnotationReference toAnnotation(EObject sourceElement, String annotationTypeName, Object value) {
		return toAnnotation(sourceElement, annotationTypeName, null, value);
	}
	
}
 
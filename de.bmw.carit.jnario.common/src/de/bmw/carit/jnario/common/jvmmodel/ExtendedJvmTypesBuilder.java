package de.bmw.carit.jnario.common.jvmmodel;

import static java.util.Collections.singletonList;

import java.util.List;

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
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.inject.Inject;

public class ExtendedJvmTypesBuilder extends JvmTypesBuilder {

	@Inject
	private TypeReferences references;
	
	public JvmGenericType toClass(EObject sourceElement, String name, JvmGenericType superType,
			Procedure1<JvmGenericType> initializer) {
		JvmGenericType result = super.toClass(sourceElement, name, initializer);
		if(superType != null){
			result.getSuperTypes().add(references.createTypeRef(superType));
		}
		return result;
	}
	
	public JvmAnnotationReference toAnnotation(EObject sourceElement, String annotationTypeName, String valueName, Object value) {
		JvmAnnotationReference result = TypesFactory.eINSTANCE.createJvmAnnotationReference();
		JvmType jvmType = references.findDeclaredType(annotationTypeName, sourceElement);
		if (!(jvmType instanceof JvmAnnotationType)) {
			throw new IllegalArgumentException("The given class " + annotationTypeName + " is not an annotation type.");
		}
		result.setAnnotation((JvmAnnotationType) jvmType);
		if(value == null){
			return result;
		}
		List<?> valueList;
		if (!(value instanceof List<?>)) {
			valueList = singletonList(value);
		}else{
			valueList = (List<?>) value;
		}
		JvmAnnotationValue annotationValue = null;
		for (Object object : valueList) {
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
				((JvmTypeAnnotationValue)annotationValue).getValues().add(references.createTypeRef(type));
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

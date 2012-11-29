package org.jnario.feature.jvmmodel;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static org.eclipse.emf.ecore.util.EcoreUtil.replace;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;

import com.google.inject.Inject;

public class JvmFieldReferenceUpdater {
	
	@SuppressWarnings("serial")
	private class FieldReferenceFinder extends XbaseUsageCrossReferencer{

		private JvmGenericType newType;
		private JvmGenericType originalType;

		protected FieldReferenceFinder(EObject eObject) {
			super(eObject);
		}
		
		protected boolean crossReference(EObject eObject, EReference eReference, EObject crossReferencedEObject) {
			if(crossReferencedEObject instanceof JvmField){
				return updateFieldReference(eObject, eReference, (JvmField)crossReferencedEObject);
			}
			if(crossReferencedEObject == originalType){
				replace(eObject, eReference, originalType, newType);
			}
			return false;
		}

		protected boolean updateFieldReference(EObject eObject,
				EReference eReference, JvmField sourceField) {
			if(sourceField.isStatic()){
				return false;
			}
			if(!sourceField.getDeclaringType().getSimpleName().equals(originalType.getSimpleName())){
				return false;
			}
			JvmField newField = findMatchingField(sourceField);
			replace(eObject, eReference, sourceField, newField);
			return true;
		}
		
		private JvmField findMatchingField(JvmField sourceField) {
			Iterable<JvmMember> members = allMembersOf(newType);
			for (JvmField candidate : filter(members, JvmField.class)) {
				if(candidate.getSimpleName() == null && equal(candidate.getType().getQualifiedName(), sourceField.getType().getQualifiedName())){
					candidate.setSimpleName(sourceField.getSimpleName());
					return candidate;
				}
				if(equal(candidate.getSimpleName(), sourceField.getSimpleName())){
					return candidate;
				}
			}
			EObject source = associations.getPrimarySourceElement(sourceField);
			JvmField newField = typesBuilder.toField(source, sourceField.getSimpleName(), sourceField.getType());
			newType.getMembers().add(newField);
			return newField;
		}

		public Iterable<JvmMember> allMembersOf(JvmGenericType type) {
			Iterable<JvmMember> members = type.getMembers();
			for (JvmTypeReference superTypeReference : type.getSuperTypes()) {
				JvmType superType = superTypeReference.getType();
				if(superType != null && superType instanceof JvmGenericType){
					members = concat(members, ((JvmGenericType)superType).getMembers());
				}
			}
			return members;
		}

		public void updateFields(JvmGenericType originalType, JvmGenericType newType){
			this.originalType = originalType;
			this.newType = newType;
			crossReference();
			done();
		}
		
		@Override
		protected void done() {
			super.done();
			newType = null;
		}
	}
	
	@Inject ExtendedJvmTypesBuilder typesBuilder;
	@Inject IJvmModelAssociations associations;
	
	public void updateReferences(EObject eObject, JvmGenericType originalType, JvmGenericType newType) {
		FieldReferenceFinder referenceFinder = new FieldReferenceFinder(eObject);
		referenceFinder.updateFields(originalType, newType);
	}
	
}

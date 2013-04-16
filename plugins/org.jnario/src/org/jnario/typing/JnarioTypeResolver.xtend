package org.jnario.typing

import com.google.inject.Inject
import java.util.Map
import org.eclipse.xtend.core.typesystem.DispatchAndExtensionAwareReentrantTypeResolver
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xtype.XComputedTypeReference
import org.jnario.ExampleColumn
import org.jnario.ExampleTable
import org.eclipse.xtext.common.types.JvmMember

class JnarioTypeResolver extends DispatchAndExtensionAwareReentrantTypeResolver {
	
	@Inject extension IJvmModelAssociations
	
//	override computeTypes(ResolvedTypes resolvedTypes, IFeatureScopeSession session, EObject element) {
//		switch(element){
//			ExampleTable: {
//				element.columns.forEach[
//					resolvedTypes.computeTypes(session, it)
//				]
//			}
//			default: super.computeTypes(resolvedTypes, session, element)
//		}
//	}
//	
	
	override protected _doPrepare(ResolvedTypes resolvedTypes, IFeatureScopeSession session, JvmConstructor constructor, Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
		super._doPrepare(resolvedTypes, session, constructor, resolvedTypesByContext)
		val source = constructor.primarySourceElement
		if(source instanceof ExampleTable){
			constructor.parameters.forEach[param |
				val column = param.primarySourceElement as ExampleColumn
				param.parameterType.setColumnTypeProvider(constructor, resolvedTypes, session, column, resolvedTypesByContext)
			]
		}
	}
	
	override protected _doPrepare(ResolvedTypes resolvedTypes, IFeatureScopeSession session, JvmField field, Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
		super._doPrepare(resolvedTypes, session, field, resolvedTypesByContext)
		val source = field.primarySourceElement
		if(source instanceof ExampleColumn){
			field.type.setColumnTypeProvider(field, resolvedTypes, session, source as ExampleColumn, resolvedTypesByContext)
		}
	}
	
	override protected _doPrepare(ResolvedTypes resolvedTypes, IFeatureScopeSession session, JvmOperation operation, Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
		super._doPrepare(resolvedTypes, session, operation, resolvedTypesByContext)
		val source = operation.primarySourceElement
		if(source instanceof ExampleColumn){
			operation.returnType.setColumnTypeProvider(operation, resolvedTypes, session, source as ExampleColumn, resolvedTypesByContext)
		}
	}
	
	def void setColumnTypeProvider(JvmTypeReference typeRef, JvmMember member, ResolvedTypes resolvedTypes, IFeatureScopeSession session, ExampleColumn column, Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext){
		if(!InferredTypeIndicator::isInferred(typeRef)){
			return;
		}
		val casted = typeRef as XComputedTypeReference
		val childResolvedTypes = declareTypeParameters(resolvedTypes, member, resolvedTypesByContext);
		val indicator = casted.getTypeProvider() as InferredTypeIndicator
		val reference = createComputedTypeReference(resolvedTypesByContext, childResolvedTypes, session, member, indicator, false);
		casted.setEquivalent(reference);
		val result = services.getXtypeFactory().createXComputedTypeReference();
			result.setTypeProvider(new ColumnTypeProvider[
//				var type = resolvedTypes.getActualType(column)
//				if(type == null){
//					computeTypes(resolvedTypesByContext, resolvedTypes, session, column)
//				}			
//				type = resolvedTypes.getActualType(column)
//				type?.toJavaCompliantTypeReference
			val types = <LightweightTypeReference>newArrayList()
			for (cell : column.cells) {
				val operation = cell.jvmElements.head as JvmIdentifiableElement
				var type = resolvedTypes.getActualType(operation)
//				if(type == null){
//					computeTypes(resolvedTypesByContext, resolvedTypes, session, cell)
//				}
//				type = resolvedTypes.getActualType(cell)
				if(type != null){
					types.add(type);
				}
			}
			val owner = resolvedTypes.referenceOwner
			if(types.empty){
				return null
			}
			services.getTypeConformanceComputer().getCommonSuperType(types, owner).toJavaCompliantTypeReference
		])
		casted.setEquivalent(result)
	}
}

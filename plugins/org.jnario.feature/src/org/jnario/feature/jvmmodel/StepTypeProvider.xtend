package org.jnario.feature.jvmmodel

import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.jnario.feature.feature.Given
import org.jnario.feature.feature.GivenReference
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.Then
import org.jnario.feature.feature.ThenReference
import org.jnario.feature.feature.When
import org.jnario.feature.feature.WhenReference

import static org.jnario.feature.feature.FeaturePackage.*

class StepTypeProvider {
	
	public static val ANDS = #{eINSTANCE.but, eINSTANCE.butReference, eINSTANCE.and, eINSTANCE.andReference}
	public static val GIVEN = #{eINSTANCE.given, eINSTANCE.givenReference}
	public static val WHEN = #{eINSTANCE.when, eINSTANCE.whenReference}
	public static val THEN = #{eINSTANCE.then, eINSTANCE.thenReference}
	
	def dispatch Set<EClass> getExpectedTypes(Given step){
		GIVEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(GivenReference step){
		GIVEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(WhenReference step){
		WHEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(When step){
		WHEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(Then step){
		THEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(ThenReference step){
		THEN
	}
	
	def dispatch Set<EClass> getExpectedTypes(Step step){
		step.definingStep.expectedTypes
	}
	
	def EClass getActualType(Step step){
		step.definingStep.eClass
	}
	
	private def getDefiningStep(Step step){
		val container = step.eContainer() as Scenario
		val index = container.getSteps().indexOf(step)
		var i = index
		while(i >= 0){
			val candidate = container.getSteps().get(i);
			if(!ANDS.contains(candidate.eClass)){
				return candidate
			}
			i = i - 1
		}
		step
	}
	
}
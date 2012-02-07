package de.bmw.carit.jnario.tests.unit.naming

import com.google.inject.Inject
import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.StepReference
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator

import static de.bmw.carit.jnario.tests.util.Query.*
import de.bmw.carit.jnario.naming.StepExpressionProvider

@InstantiateWith(typeof(SpecTestInstantiator))
describe StepExpressionProvider{

	@Inject extension ModelStore modelStore
	
	it "should return the name for a step with definition"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario
					Given a step with an implementation
						"the implementation"
		''')
		assert step.stepExpression == subject.expressionOf(step)
	}
	
	it "should copy the referenced step's implementation and set the referencing step"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario 1
					Given a step 
						
				Scenario: MyScenario 2
					Given a step 
						"the implementation"
		''')
		val expr = subject.expressionOf(step)
		assert expr != null
		assert step.stepExpression == expr
		assert (step as StepReference).reference.stepExpression != expr
	}
	
	def step(){
		return query(modelStore).first(typeof(Step))
	}
}
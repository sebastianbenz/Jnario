package org.jnario.spec.tests.integration

import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith

@CreateWith(typeof(SpecTestCreator))
describe "Defining Spec base classes"{
	@Inject extension BehaviorExecutor
	fact "Extend annotation defines the super class"{
		'''
		import org.jnario.runner.Extends
		import junit.framework.TestCase

		@Extends(typeof(TestCase)) 
		describe "A spec"{
			fact typeof(ASpecSpec).superclass => typeof(TestCase)
		}
		'''.executesSuccessfully
	}
}
package org.jnario.spec.tests.unit.compiler

import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith

import static org.junit.Assert.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject

@CreateWith(typeof(SpecTestCreator))
describe "Compiler"{
	@Inject extension BehaviorExecutor
	fact "long boolean expressions compile correctly"{
		'''
		describe "Something with an expression"{
			fact "a fact with an if"{
				val x = 4
				if(x > 4 && x > 5){
					
				}
			}
		}
		'''.executesSuccessfully
	}
	
	fact "assert with multiple bool expressions"{
		'''
		describe "Something with an expression"{
			fact "a fact with an if"{
				val x = 6
				assert x > 4 && x > 5
			}
		}
		'''.executesSuccessfully
	}
	
	fact "=> with multiple bool expressions"{
		'''
		describe "Something with an expression"{
			fact "a fact with =>"{
				val x = 6
				(x > 4 && x > 5) => true
			}
		}
		'''.executesSuccessfully
	}
	
	fact "should with multiple bool expressions"{
		'''
		describe "Something with an expression"{
			fact "a fact with should"{
				val x = 6
				x > 4 && x > 5 should be true
			}
		}
		'''.executesSuccessfully
	}

}
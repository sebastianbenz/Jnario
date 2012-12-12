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
	
	fact "automatically converts lists to arrays"{
		'''
		describe "Something with an expression"{
			fact "any fact"{
			}
			
			def String[] x(){
			list("some string")
			}
		}
		'''.executesSuccessfully
	}
	
	fact "resolve fact method name clashes"{
		'''
			describe "Using Should"{
			  
			 	  fact "a***"  
			      fact "a???" 
			   		
			}
		'''.executesSuccessfully
	}
	
	fact "supports should in closures"{
		'''
		describe "Should in closures"{
			fact "should-be in closure" {
		        [|1 should be 1].apply;  
		        [|var int i; 1 should be 1].apply;
		        [|].apply ;
		    }
		}
		'''.executesSuccessfully
	}
	
	fact "compiles rich strings"{
		"
		describe 'Richstrings'{
			fact {
				val x = 'world'
		        '''hello «x»'''.toString => 'hello world'
		    }
		}
		".executesSuccessfully
	}
	
	fact "supports enums in tables"{
		'''
			import static org.jnario.spec.tests.unit.compiler.MyEnum.*
			
			describe "Tests type inference of the table columns"{
				
				
				def myTable {
					| value  |
					| VALUE1 |
					| VALUE2 |
			    }		
				
				fact "Table column type get inferred by the stand-alone compile correctly" {
					myTable.forEach [
						value should not be null
					]
				}
			}
		'''.executesSuccessfully
	}
}
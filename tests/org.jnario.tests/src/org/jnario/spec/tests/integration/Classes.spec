package org.jnario.spec.tests.integration

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor

/*
 * You can define xtend helper classes in your specs.
 */
@CreateWith(typeof(SpecTestCreator))
describe "Defining Xtend classes in your specs"{

	@Inject extension BehaviorExecutor
	
   /*
   * @filter('''|.executesSuccessfully)  
   */
	fact "either before..."{
		'''
        @Data class Greeter{
          String name
          def sayHello(){
            "Hello " + name
          }
        }

        describe "Saying Hello"{
          fact new Greeter("Sebastian").sayHello => "Hello Sebastian"
        }  	
		'''.executesSuccessfully
	}
	
   /*
   * @filter('''|.executesSuccessfully)  
   */
	fact "...or after your specs"{
		'''
        describe "Saying Hello"{
          fact new Greeter("Sebastian").sayHello => "Hello Sebastian"
        }  	

        @Data class Greeter{
          String name
          def sayHello(){
            "Hello " + name
          }
        }
		'''.executesSuccessfully
	}
}
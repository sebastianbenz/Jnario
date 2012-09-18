package org.jnario.jnario.tests.unit.report

import org.jnario.report.IsMatchingSpec
import static org.jnario.jnario.test.util.Specs.*
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.spec.spec.Example

@CreateWith(typeof(SpecTestCreator))
describe IsMatchingSpec {
	
	@Inject ModelStore m
	
	context "Example"{

//		def createExample(String name){
//			m.parse('''
//				package demo
//				describe "Calculator"{
//					fact «name»
//				}
//			''').allContents.filter(typeof(Example)).first
//		}
//		
//		def examples{
//			| name 				| expected  |
//			| "adding values "  | true		|
//		}
//		fact "examples are matched by classname and fact"{
//			examples.forEach[
//				val spec = createExample(name)
//				subject.matches(spec, execution) => expected
//			]
//		}
	}
	
	context "Step"{
		
	}
	
	context "Specification"{
		
	}
	
	
	
	
}
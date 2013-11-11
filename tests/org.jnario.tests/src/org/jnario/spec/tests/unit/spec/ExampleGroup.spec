package org.jnario.spec.tests.unit.spec

import com.google.inject.Inject
import org.jnario.Executable
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.jvmmodel.SpecExecutableProvider

import static org.jnario.lib.JnarioCollectionLiterals.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe SpecExecutableProvider {
	
	@Inject extension ModelStore
	fact "returns all examples"{
		'''
		describe "Something"{
			fact "fact 1"
			fact "fact 2"
		}
		'''.parseSpec
		exampleGroup("Something").executables => list(example("fact 1"), example("fact 2"))
	}
	
	fact "returns all sub example groups"{
		'''
		describe "Something"{
			describe "exampleGroup 1"{}
			describe "exampleGroup 2"{}
		}
		'''.parseSpec
		exampleGroup("Something").executables => list(exampleGroup("exampleGroup 1"), exampleGroup("exampleGroup 2"))
	}

	fact "returns all facts in sub example groups"{
		'''
		describe "Something"{
			describe "exampleGroup 1"{
				fact "fact 1"
			}
			describe "exampleGroup 2"{
				fact "fact 2"
			}
		}
		'''.parseSpec
		exampleGroup("Something").executables.toSet => <Executable>set(exampleGroup("exampleGroup 1"), example("fact 1"), exampleGroup("exampleGroup 2"), example("fact 2"))
	}

	def executables(Executable spec){
		subject.getExecutables(spec) 
	}
} 
package org.jnario.suite.unit

import org.jnario.suite.resource.SuiteResourceDescriptionManager
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.SuiteTestInstantiator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.core.resources.IResource
import org.eclipse.emf.ecore.resource.Resource
import org.hamcrest.Matcher
import org.jnario.lib.Should
import org.eclipse.emf.ecore.util.EcoreUtil
import org.jnario.suite.suite.SpecReference

@InstantiateWith(typeof(SuiteTestInstantiator))
describe SuiteResourceDescriptionManager {
	
	@Inject extension ModelStore m
	
	Resource spec
	
	before spec = parseSpec('''
		package test
		describe "MySpec"{
			
		}''')
	
	context "no pattern"{
		fact "affected if referenced"{
			val suite = m.parseSuite('''
				package test
				#My Suite
				- "MySpec"
			''')
			suite should be affected
		}
		fact "not affected if not referenced"{
			val suite = m.parseSuite('''
				package test
				#My Suite
				- "MyOtherSpec"
			''')
			suite should not be affected
		}
	}
	
	def Matcher<Resource> affected(){
		Should::matches("affected")[suite |
			val ref = suite.allContents.filter(typeof(SpecReference)).head
			assert !ref.spec.eIsProxy
			val newDescription = subject.getResourceDescription(spec)
			val candidate = subject.getResourceDescription(suite)
			val delta = subject.createDelta(null, newDescription)
			subject.isAffected(delta, candidate)
		]
	}

}
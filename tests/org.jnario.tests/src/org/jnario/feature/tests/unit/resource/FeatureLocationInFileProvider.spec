package org.jnario.feature.tests.unit.resource

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.ITextRegion
import org.jnario.feature.resource.FeatureLocationInFileProvider
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith

import static org.junit.Assert.*

@CreateWith(typeof(FeatureTestCreator))
describe FeatureLocationInFileProvider {
	
	CharSequence content
	@Inject extension ModelStore
	
	fact "Scenario significant region spans over first line"{
		
		'''
			Feature: My Feature
			Scenario: My Scenario
				Given something
		'''.parse
		
		firstScenario.siginificantRegion.is("Scenario: My Scenario")
	}
	
	fact "Scenario full text region spans over all steps"{
		
		'''
			Feature: My Feature
			Scenario: My Scenario
				String something
				Given something
				And something else
		'''.parse
		
		firstScenario.region.is('''
			Scenario: My Scenario
				String something
				Given something
				And something else
		''')
	}
	
	def is(CharSequence actual, CharSequence expected){
		assertEquals(expected.toString, actual.toString)
	}
	
	def parse(CharSequence s){
		content = s
		s.parseScenario
	}
	
	def siginificantRegion(EObject object){
		subject.getSignificantTextRegion(firstScenario).toText
	}
	
	def region(EObject object){
		subject.getFullTextRegion(firstScenario).toText
	}
	
	def toText(ITextRegion region){
		content.subSequence(region.offset, region.offset + region.length)
	}

}
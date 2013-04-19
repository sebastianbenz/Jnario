package org.jnario.feature.tests.unit.contentassist

import org.jnario.feature.ui.contentassist.FeatureProposalProvider
import org.jnario.feature.FeatureUiInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.runner.Extends
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest
import org.jnario.feature.FeatureStandaloneSetup

@Extends(typeof(AbstractContentAssistProcessorTest))
describe "FeatureProposalProvider"{
	
	context "same file"{
		fact "proposes implemented steps"{
			newBuilder.append('''
				Feature: My Feature
					Scenario: My Scenario
					Given an implemented step
						1 + 1 => 2
					
			''').assertProposal("And an implemented step")
			
		}
		
	}
	
	
	
	override protected doGetSetup() {
		[|new FeatureUiInjectorProvider().injector]
	}
	
}
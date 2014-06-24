package org.jnario.feature.tests.unit.formatting

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.jnario.test.util.AbstractXbaseFormatterTest
import org.jnario.spec.SpecInjectorProvider
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecInjectorProvider))
class FormatterTest extends AbstractXbaseFormatterTest {
	@Test
	@Ignore
	def public void testFormatLinebreaks() {
		assertFormatted(
	        '''
				package test
				Feature: Calculator
				  Background:
				   int result
				   Given a calculator
				  Scenario: Adding two numbers 2
				   When I enter two numbers "20" and "70"
				       result = args.first.toInt + args.second.toInt
				   Then it returns "90"
				     	result => args.first.toInt
				  Scenario: Adding two numbers wer
				    When I enter two numbers "20" and "80"
				    Then it returns "100"
			''',
			'''
				package test
				Feature: Calculator
				  Background:
				   int result
				   Given a calculator
				  Scenario: Adding two numbers 2
				   When I enter two numbers "20" and "70"
				       result = args.first.toInt + args.second.toInt
				   Then it returns "90"
				     	result => args.first.toInt
				  Scenario: Adding two numbers wer
				    When I enter two numbers "20" and "80"
				    Then it returns "100"
	        '''
		)
	}
}
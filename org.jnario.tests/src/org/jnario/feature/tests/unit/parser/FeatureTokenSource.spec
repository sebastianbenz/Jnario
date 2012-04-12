/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.parser


import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CommonToken
import org.antlr.runtime.Token
import org.eclipse.xtext.parser.antlr.TokenAcceptor
import org.jnario.feature.parser.FeatureTokenSource

import static org.jnario.feature.parser.antlr.internal.InternalFeatureLexer.*
import static tests.FeatureTokenSourceSpec.*

import static extension org.jnario.lib.Should.*
describe FeatureTokenSource{
	
	TokenAcceptor tokenAcceptor = new TokenAcceptor
	static String prefix = "package test\n"
	CharSequence input
	
	fact "Splits feature"{
		setInput('''
			Feature: example
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1)
		)
	}
	
	fact "Splits incomplete feature"{
		setInput('''
			Feature: example''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example", 1)
		)
	}
	
	fact "Splits incomplete feature with text"{
		setInput('''
			Feature: example
			 some text''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  " some text", 2)
		)
	}
	
	
	fact "Splits incomplete feature with text and new line"{
		setInput('''
			Feature: example
			some text
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  "some text\n", 2)
		)
	}
	
	
	fact "Splits feature with text and scenario"{
		setInput('''
			Feature: example
			  Text1
			  Text2
			Scenario: scenario1
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  "  Text1\n  Text2\n", 2),
			token(RULE_SCENARIO_TEXT,  "Scenario: scenario1\n", 4)
		)
	}
	
	fact "splits feature with text and background"{
		setInput('''
			Feature: example
			  Text1
			  Text2
			  Background: scenario1
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  "  Text1\n  Text2\n  ", 2),
			token(RULE_BACKGROUND_TEXT,  "Background: scenario1\n", 4)
		)
	}
	
	fact "splits feature with text"{
		setInput('''
			Feature: example
			  Text1
			  Text2
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  "  Text1\n  Text2\n", 2)
		)
	}
	
	fact "splits feature with scenario"{
		setInput('''
			Feature: example
			Scenario: scenario1''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_SCENARIO_TEXT,  "Scenario: scenario1", 2)
		)
	}
	
	fact "splits feature with scenario and line break"{
		setInput('''
			Feature: example
			Scenario: scenario1
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_SCENARIO_TEXT,  "Scenario: scenario1\n", 2)
		)
	}
	
	fact "splits feature with background"{
		setInput('''
			Feature: example
			 Background:
			''')
		assertSplitsIn(
			token(RULE_FEATURE_TEXT,  "Feature: example\n", 1),
			token(RULE_TEXT,  " ", 2),
			token(RULE_BACKGROUND_TEXT,  "Background:\n", 2)
		)
	}

	def void assertSplitsIn(CommonToken... expectedTokens){
		split(token(input))
		val actualTokens = tokenAcceptor.toList
		actualTokens.size => expectedTokens.size
		actualTokens.forEach[e, i|
			val expected = expectedTokens.get(i)
			val actual = e as CommonToken
			actual.type => expected.type
			actual.text => expected.text
			actual.line => expected.line
		]
	}

	def token(int type, String text, int line){
		val result = new CommonToken(type, text)
		result.line = line
		return result
	}

	def token(CharSequence text){
		val input = new ANTLRStringStream(text.toString)
		val start = prefix.length
		val stop = text.toString.length-1
		new CommonToken(input, -1, -1, start, stop)
	}
	
	def setInput(CharSequence input){
		this.input = prefix + input
	}
	
	def split(Token token){
		subject.doSplitToken(token, tokenAcceptor)
	}

}
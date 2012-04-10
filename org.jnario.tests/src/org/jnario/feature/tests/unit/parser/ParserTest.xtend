package org.jnario.feature.tests.unit.parser

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.jnario.test.util.AbstractParserTest
import org.junit.runner.RunWith
import org.jnario.feature.FeatureInjectorProvider
import org.jnario.feature.tests.unit.parser.examples.Examples

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(FeatureInjectorProvider))
class ParserTest extends AbstractParserTest{
	
	override context(){
		typeof(Examples)
	}
}
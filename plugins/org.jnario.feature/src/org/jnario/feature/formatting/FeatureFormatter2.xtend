package org.jnario.feature.formatting

import com.google.inject.Inject
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Scenario
import org.jnario.formatter.JnarioFormatter

class FeatureFormatter2 extends JnarioFormatter {
	
	@Inject extension NodeModelAccess
	@Inject extension FormattingDataFactory
	
	def protected dispatch void format(Scenario scenario, FormattableDocument format) { 
		format += scenario.nodeForEObject.prepend[increaseIndentation]
	}

	def protected dispatch void format(Background background, FormattableDocument format) { 
		format += background.nodeForEObject.prepend[increaseIndentation]
	}
}
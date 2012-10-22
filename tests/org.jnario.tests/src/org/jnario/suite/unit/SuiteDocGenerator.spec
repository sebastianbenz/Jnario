/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SuiteTestCreator
import org.jnario.runner.CreateWith
import org.jnario.suite.doc.SuiteDocGenerator
import org.jnario.suite.suite.SuiteFile

import static junit.framework.Assert.*

@CreateWith(typeof(SuiteTestCreator))
describe SuiteDocGenerator {
	
	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa

	before{
		parseSpec('''
		package test
		describe "Red"{
		}
		describe "Blue"{
		}
		describe "Green"{
		}
		describe "Grey"{
		}
		''')
	}
	
	fact "Generates suite doc with resolved specs"{
		val actual = generateDoc('''
			package test
			
			#Heading
			Heading description.
			- "Red"
			- "Blue": with a description
			##Subheading
			Subheading description with **markdown**.
			- \.*G.*\
		''')
		
		val expected = '''
			<p>Heading description.</p>
			<ul>
				<li><a class="specref " href="../test/RedSpec.html">Red</a> </li>
				<li><a class="specref " href="../test/BlueSpec.html">Blue</a>: with a description </li>
			</ul>
			<span id="Subheading" class="suite "><h2>Subheading</h2></span>
			<p>Subheading description with <strong>markdown</strong>.</p>
			<ul>
				<li><a class="specref " href="../test/GreenSpec.html">Green</a> </li>
				<li><a class="specref " href="../test/GreySpec.html">Grey</a> </li>
			</ul>
		'''.toString
		
		assertEquals(expected, actual)
	}

	def generateDoc(CharSequence input){
		val resource = parseSuite(input)
		subject.createHtmlFile(resource.contents.head as SuiteFile).content.toString
	}

}
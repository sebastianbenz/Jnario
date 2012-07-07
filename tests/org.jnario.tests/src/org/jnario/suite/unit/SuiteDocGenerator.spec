package org.jnario.suite.unit

import org.jnario.suite.doc.SuiteDocGenerator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.suite.suite.SuiteFile
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator

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
			<span id="Heading_Heading_description_"><p>Heading description.</p></span>
			<ul>
			<li><a href="../test/RedSpec.html">Red</a> </li>
			<li><a href="../test/BlueSpec.html">Blue</a> with a description</li>
			</ul>
			<h2>Subheading</h2>
			<span id="Subheading_Subheading_description_with_markdown_"><p>Subheading description with <strong>markdown</strong>.</p></span>
			<ul>
			<li><a href="../test/GreenSpec.html">Green</a> </li>
			<li><a href="../test/GreySpec.html">Grey</a> </li>
			</ul>
		'''.toString
		
		assertEquals(expected, actual)
	}

	def generateDoc(CharSequence input){
		val resource = parseSuite(input)
		subject.createHtmlFile(resource.contents.head as SuiteFile).content.toString
	}

}
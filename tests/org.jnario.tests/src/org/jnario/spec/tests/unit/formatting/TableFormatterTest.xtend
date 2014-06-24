package org.jnario.spec.tests.unit.formatting

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.jnario.test.util.AbstractXbaseFormatterTest
import org.jnario.spec.SpecInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecInjectorProvider))
class TableFormatterTest extends AbstractXbaseFormatterTest {
	@Test
	def public void testFormatLinebreaks() {
		assertFormatted(
	        '''
				package test

				describe "Test" {
					def tab {
						| a | b | c |
						| 1 | 2 | 3 |
						| 4 | 5 | 6 |
						| 7 | 8 | 9 |
					}
				}
			''',
			'''
				package test

				describe "Test" {def tab {| a| b | c | 		| 1 | 2 | 3 | | 4 | 5 | 6 | | 7 | 8 | 9 |}}
	        '''
		)
	}

	@Test
	def public void testFormatColumnWidth() {
		assertFormatted(
	        '''
				package test

				describe "Test" {
					def tab {
						| int a | b    | ccc |
						| 1+  1 | 2    | 3   |
						| 1 + 1 | 1234 | 7   |
						| 3  +1 | 4    | 5   |
					}
				}
			''',
			'''
				package test

				describe "Test" {
					def tab {
						|int a| b         | ccc |
						|   1+  1 | 2    | 3   |
						|      1 + 1 | 1234 | 7   |
						|    3  +1|    4      |5|
					}
				}
	        '''
		)
	}
	
	@Test
	def public void testFormatMultilineCells() {
		assertFormatted(
	        '''
				package test

				describe "Test" {
					def tab {
						| int  a    | b    | ccc |
						| 1+  1     | 2    | 3   |
						| Math.max(
					      1,2)      | 1234 | 7   |
						| 3+1       | 4    | 5   |
					}
				}
			''',
			'''
				package test

				describe "Test" {
					def tab {
						| int  a| b|ccc |
						| 1+  1|2 |3|
						|                Math.max(
					      1,2)                     | 1234 |7  |
						|3+1| 4| 5|
					}
				}
	        '''
		)
	}

	@Test
	def public void testFormatMultilineCells2() {
		assertFormatted(
	        	'''
				package test

				describe "Test" {
					def tab {
						| int  a    | b    | ccc |
						| 1+  1     | 2    | 3   |
						| Math.max(
					           1,2)      | 1234 | 7   |
						| 3+1       | 4    | 5   |
					}
				}
			''',
			'''
				package test

				describe "Test" {
					                     def tab {
						| int  a| b|ccc |
						| 1+  1|2 |3|
						|                Math.max(
					           1,2)                     | 1234 |7  |
						|3+1| 4| 5|
					}
				}
	        '''
		)
	}

	@Test
	def public void testFormatMultilineWithClosures() {
		assertFormatted(
	        '''
				package test

				describe "Test" {
					def myExampleWithClosures{
						| input | operation        | result |
						| "a"   | [String s | 
						          s.toUpperCase]   | "A"    |
						| "B"   | [String s 
						          | s.toLowerCase] | "b"    |
					}
				}
			''',
			'''
				package test

				describe "Test" {
					def myExampleWithClosures{
						| input | operation | result |
						| "a"   | [String s | 
						          s.toUpperCase] |                "A"    |
						| "B"   | [String s 
						          | s.toLowerCase] | "b"            |
				    }
				}
	        '''
		)
	}

	@Test
	def public void testFormatNoTables() {
		assertFormatted(
	        '''
				package test

				describe "Test" {

					fact true => true

					fact "Test" {
					}
				}
			''',
			'''
				package test

				describe "Test" {

					fact true => true

					fact "Test" {
					}
				}
	        '''
		)
	}
}
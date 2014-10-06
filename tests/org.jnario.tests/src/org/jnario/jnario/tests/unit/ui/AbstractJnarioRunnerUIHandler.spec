package org.jnario.jnario.tests.unit.ui

import org.eclipse.jdt.internal.junit.model.TestCaseElement
import org.eclipse.jdt.internal.junit.model.TestElement
import org.eclipse.jdt.internal.junit.model.TestRoot
import org.eclipse.jdt.internal.junit.model.TestRunSession
import org.eclipse.jdt.internal.junit.model.TestSuiteElement
import org.eclipse.jdt.junit.model.ITestElement
import org.eclipse.ui.part.ViewPart
import org.jnario.ui.handler.AbstractJnarioRunnerUIHandler
import org.jnario.util.Strings

import static org.hamcrest.Matchers.*

class TestUIHandler extends AbstractJnarioRunnerUIHandler {

	override getAction(ViewPart part, ITestElement element) {
	}

}

describe "AbstractJnarioRunnerUIHandler" {

	/**
	 * JUnit suite names are annotated with [IGNORED] if all child members are ignored
	 * and [PENDING] if all child members are ignored and at least one is pending.
	 */
	describe "Suite Labelling" {
		val root = new TestRoot(new TestRunSession("run", null))
		val handler = new TestUIHandler()
		val ViewPart part = null

		def cases {
			| left        | right | result        |
			| null        | null  | notMarked     |
			| tc          | null  | notMarked     |
			| ign         | null  | markedIgnored |
			| pend        | null  | markedPending |
			| tc          | ign   | notMarked     |
			| tc          | pend  | notMarked     |
			| ign         | pend  | markedPending |
			| ign         | ign   | markedIgnored |
			| suite(tc)   | pend  | notMarked     |
			| suite(pend) | tc    | notMarked     |
			| suite(tc)   | ign   | notMarked     |
			| suite(ign)  | tc    | notMarked     |
			| suite(pend) | ign   | markedPending |
			| suite(ign)  | pend  | markedPending |
			| suite(ign)  | ign   | markedIgnored |
		}

		fact "All cases" {
			cases.forEach [
				val elements = list(left, right).filterNull
				result.matches(label(root(elements))) should be true
			]
		}

		def root((TestSuiteElement)=>TestElement... elementConstructors) {
			suite(elementConstructors).apply(root)
		}

		def suite((TestSuiteElement)=>TestElement... elementConstructors) {
			[ TestSuiteElement parent |
				val suite = new TestSuiteElement(parent, "id", "name", 10)
				elementConstructors.forEach[it.apply(suite)]
				suite
			]
		}

		def tc() {
			[TestSuiteElement suite|new TestCaseElement(suite, "id", "tc")]
		}

		def ign() {
			[ TestSuiteElement suite |
				tc().apply(suite) => [
					name = "tc-ign"
					ignored = true
				]
			]
		}

		def pend() {
			[ TestSuiteElement suite |
				ign().apply(suite) => [
					name = "tc [PENDING]"
				]
			]
		}

		def label(TestSuiteElement suite) {
			handler.getSimpleLabel(part, suite)
		}

		def markedPending() {
			allOf(containsString(Strings::PENDING_FLAG), ^not(containsString(Strings::IGNORED_FLAG)))
		}

		def markedIgnored() {
			allOf(containsString(Strings::IGNORED_FLAG), ^not(containsString(Strings::PENDING_FLAG)))
		}

		def notMarked() {
			^not(anyOf(containsString(Strings::IGNORED_FLAG), containsString(Strings::PENDING_FLAG)))
		}
	}

}

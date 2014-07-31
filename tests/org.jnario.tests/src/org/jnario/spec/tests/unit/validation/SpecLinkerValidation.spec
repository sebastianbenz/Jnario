package org.jnario.spec.tests.unit.validation

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.validation.Issue
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.junit.Assert

@CreateWith(typeof(SpecTestCreator))
describe "Linker validation"{
  @Inject extension ParseHelper< EObject > parseHelper
  @Inject extension ValidationTestHelper validationTestHelper

  fact "No validation errors"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          1 should not be 2
        }
      }
    '''.parse.validate.assertNoIssues
  }

  fact "Unknown variable"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          println(abc)
        }
      }
    '''.parse.validate.assertIssues(
    	"The method or field abc is undefined"
    )
  }

  fact "Unknown variable within should_be_0"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          abc should be 0
        }
      }
    '''.parse.validate.assertIssues(
    	"The method or field abc is undefined"
    )
  }

  fact "Unknown variable within should_be_null (Bug #137)"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          abc should be null
        }
      }
    '''.parse.validate.assertIssues(
    	"The method or field abc is undefined"
    )
  }

  fact "Unknown variable within => null"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          abc => null
        }
      }
    '''.parse.validate.assertIssues(
    	"The method or field abc is undefined"
    )
  }

  fact "Method call with should be null"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          string => null
        }
        def getString() {""}
      }
    '''.parse.validate.assertNoIssues
  }

  fact "Null variable with should be null"{
    '''
      package bootstrap

      describe "something"{
        fact "x" {
          val withoutType = null
          withoutType => null
        }
      }
    '''.parse.validate.assertNoIssues
  }

  def assertNoIssues(List<Issue> issues) {
  	issues.size => 0
  }

  def assertIssues(List<Issue> issues, String ... parts) {
  	val sb = new StringBuilder
	for (issue : issues.filter[!parts.exists[part| message.contains(part)]]) {
		sb.append("- unmatched actual issue: ")
		sb.append(issue)
		sb.append(System.getProperty("line.separator"))
	}
	for (part : parts.filter[part | !issues.exists[message.contains(part)]]) {
		sb.append("- unmatched expected issue part: ")
		sb.append(part)
		sb.append(System.getProperty("line.separator"))
	}
	if (sb.length > 0) {
		Assert.fail('''
			Issue mismatch
			«sb.toString»
		''');
	}
  }

}

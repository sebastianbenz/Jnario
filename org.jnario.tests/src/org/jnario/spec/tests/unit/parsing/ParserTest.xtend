package org.jnario.spec.tests.unit.parsing

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.junit.Test
import static org.jnario.jnario.test.util.ClassPathUriProviderBuilder.*
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.jnario.spec.SpecInjectorProvider
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.Issue
import java.util.List
import org.eclipse.xtext.diagnostics.Severity
import static org.junit.Assert.*
import org.eclipse.emf.common.util.URI
import com.google.common.collect.Lists

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecInjectorProvider))
class ParserTest {
	
	
	@Inject extension ModelStore
	@Inject extension IResourceValidator
	
	@Test
	def void shouldParseAllFilesWithoutParseError(){
		load(startingFrom(typeof(ParserTest)).select[onlySpecFiles])
		val specs = Lists::newArrayList(resources.filter[URI.onlySpecFiles])
		specs.forEach[ resource |
			val issues = validate(resource, CheckMode::ALL, CancelIndicator::NullImpl)
			assertTrue(errorMessage(issues), issues.empty)			
		]
	}
	
	def onlySpecFiles(URI uri){
		return uri.fileExtension != null && uri.fileExtension.equals("spec")
	}
	
	def errorMessage(List<Issue> issues){
		val result = new StringBuilder()
		for (Issue issue : issues) {
			val issueBuilder = createIssueMessage(issue);
			result.append(issueBuilder);
		}
		return result.toString
	}
	
	def StringBuilder createIssueMessage(Issue issue) {
		val resourceUri = issue.getUriToProblem().trimFragment();
		val issueBuilder = new StringBuilder("\n");
		issueBuilder.append(issue.getSeverity()).append(": \t");
		issueBuilder.append(resourceUri.lastSegment()).append(" - ");
		if (resourceUri.isFile()) {
			issueBuilder.append(resourceUri.toFileString());
		}
		issueBuilder.append("\n").append(issue.getLineNumber()).append(": ").append(issue.getMessage());
		return issueBuilder;
	}
}
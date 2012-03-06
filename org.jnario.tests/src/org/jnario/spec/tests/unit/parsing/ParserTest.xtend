package org.jnario.spec.tests.unit.parsing

import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.validation.Issue
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.SpecInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

import static org.jnario.jnario.test.util.ClassPathUriProviderBuilder.*

import static extension org.jnario.jnario.test.util.Resources.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecInjectorProvider))
class ParserTest {
	
	@Inject extension ModelStore
	
	@Test
	def void shouldParseAllFilesWithoutParseError(){
		load(startingFrom(typeof(ParserTest)).select[onlySpecFiles])
		val specs = Lists::newArrayList(resources.filter[URI.onlySpecFiles])
		specs.forEach[ resource |
			resource.checkForParseErrors
		]
	}
	
	def onlySpecFiles(URI uri){
		return uri.fileExtension != null && uri.fileExtension.equals("spec")
	}
	
	def errorMessage(Iterable<Issue> issues){
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
package org.jnario.compiler;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Predicate;

class SeverityFilter implements Predicate<Issue> {
	
	public static final SeverityFilter WARNING = new SeverityFilter(Severity.WARNING);
	public static final SeverityFilter ERROR = new SeverityFilter(Severity.ERROR);
	private Severity severity;

	private SeverityFilter(Severity severity) {
		this.severity = severity;
	}

	public boolean apply(Issue issue) {
		return this.severity == issue.getSeverity();
	}
}
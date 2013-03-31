/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
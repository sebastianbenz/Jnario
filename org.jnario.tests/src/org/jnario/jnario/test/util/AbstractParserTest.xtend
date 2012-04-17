/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.validation.Issue
import org.junit.Before
import org.junit.Test

import static org.eclipse.emf.ecore.resource.Resource$Factory$Registry.*
import static org.jnario.jnario.test.util.ClassPathUriProviderBuilder.*

import static extension org.jnario.jnario.test.util.Resources.*

class AbstractParserTest{
	
	@Inject extension ModelStore
	@Inject FileExtensionProvider fileExtensionProvider
	
	@Before
	def void setup(){
		if(fileExtensionProvider == null) return // its time for xtend to support abstract classes
		val fileExtension = fileExtensionProvider.fileExtensions.head
		val factory = INSTANCE.extensionToFactoryMap.get(fileExtension)
		INSTANCE.extensionToFactoryMap.put(fileExtension + "_", factory)
	}
	
	@Test
	def void shouldParseAllFilesWithoutParseError(){
		if(context == null) return;
		load(startingFrom(context).select[onlySpecFiles])
		val specs = Lists::newArrayList(resources.filter[URI.onlySpecFiles])
		specs.forEach[ resource |
			resource.checkForParseErrors
		]
	}
	
	def Class<?> context(){
		return null
	}
	
	def onlySpecFiles(URI uri){
		return fileExtensionProvider.isValid(uri.strippedFileExtension)
	}
	
	def strippedFileExtension(URI uri){
		val fileExtension = uri?.fileExtension
		if(fileExtension == null){
			return ""
		}
		fileExtension.substring(0, fileExtension.length - 1)
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
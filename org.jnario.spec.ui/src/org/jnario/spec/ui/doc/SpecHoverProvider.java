/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 * 
 */
package org.jnario.spec.ui.doc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.ide.hover.XtendHoverProvider;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.spec.doc.DocGenerator;
import org.jnario.spec.spec.ExampleGroup;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz 
 *
 */
@SuppressWarnings("restriction")
public class SpecHoverProvider extends XtendHoverProvider {
	
	@Inject	private DocGenerator docGenerator;
	@Inject private HtmlFileBuilder htmlFileBuilder;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider#getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getFirstLine(EObject o) {
		if (o instanceof ExampleGroup) {
			return "";
		}else{
			return super.getFirstLine(o);
		}
	}

	@Override
	protected String computeSignature(EObject call, EObject o) {
		return super.computeSignature(call, o);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#getDocumentation(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getDocumentation(EObject o) {
		String comment;
		if (o instanceof ExampleGroup) {
			ExampleGroup exampleGroup = (ExampleGroup) o;
			comment = docGenerator.createHtmlFile(exampleGroup).toText().toString();
		}else{
			comment = super.getDocumentation(o);
		}
		return comment;
	}
	
}

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
package org.jnario.ui.doc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.ide.hover.XtendHoverProvider;
import org.jnario.Specification;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFileBuilder;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz 
 *
 */
@SuppressWarnings("restriction")
public class JnarioHoverProvider extends XtendHoverProvider {
	
	@Inject	AbstractDocGenerator docGenerator;
	@Inject HtmlFileBuilder htmlFileBuilder;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider#getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getFirstLine(EObject o) {
		if (o instanceof Specification) {
			return "";
		}else{
			return super.getFirstLine(o);
		}
	}

	@Override
	protected String computeSignature(EObject call, EObject o) {
		return super.computeSignature(call, o);
	}
	
	@Override
	protected String getDocumentation(EObject o) {
		String comment;
		if (o instanceof Specification) {
			Specification spec = (Specification) o;
			comment = docGenerator.createHtmlFile(spec).toText().toString();
		}else{
			comment = super.getDocumentation(o);
		}
		return comment;
	}
	
}

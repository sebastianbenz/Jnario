/*******************************************************************************
s * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtend.core.conversion.XtendValueConverterService;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;
import com.google.inject.Singleton;
@Singleton
public class JnarioValueConverterService extends XtendValueConverterService {
	
	@Inject ShouldValueConverter shouldValueConverter;
	
	@ValueConverter(rule = "Should")
	public IValueConverter<String> getShouldValueConverter() {
		return shouldValueConverter;
	}
	
	@Inject
	private JnarioRichTextEndValueConverter richTextEndValueConverter;

	@ValueConverter(rule = "RICH_TEXT_END")
	public IValueConverter<String> getRichTextEndValueConverter() {
		return richTextEndValueConverter;
	}

	@Inject
	private JnarioRichTextStartValueConverter richTextStartValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_START")
	public IValueConverter<String> getRichTextStartValueConverter() {
		return richTextStartValueConverter;
	}

	@Inject
	private JnarioRichTextInBetweenValueConverter richTextInbetweenValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_INBETWEEN")
	public IValueConverter<String> getRichTextInbetweenValueConverter() {
		return richTextInbetweenValueConverter;
	}
	
	@Inject
	private JnarioRichTextValueConverter richTextValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT")
	public IValueConverter<String> getRichTextValueConverter() {
		return richTextValueConverter;
	}
	
	@Inject
	private JnarioCommentRichTextInBetweenValueConverter commentRichTextInBetweenValueConverter;

	@ValueConverter(rule = "COMMENT_RICH_TEXT_INBETWEEN")
	public IValueConverter<String> getCommentRichTextInBetweenValueConverter() {
		return commentRichTextInBetweenValueConverter;
	}
	
	@Inject
	private JnarioCommentRichTextEndValueConverter commentRichTextEndValueConverter;

	@ValueConverter(rule = "COMMENT_RICH_TEXT_END")
	public IValueConverter<String> getCommentRichTextEndValueConverter() {
		return commentRichTextEndValueConverter;
	}

}

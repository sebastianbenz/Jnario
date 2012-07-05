/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.highlighting;

import static org.eclipse.jface.resource.JFaceResources.getDefaultFontDescriptor;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

/**
 * @author Sebastian Benz 
 */
@SuppressWarnings("restriction")
public class SuiteHighlightingConfiguration extends XbaseHighlightingConfiguration {

	private static final int DEFAULT_FONT_SIZE = getDefaultFontDescriptor()
			.getFontData()[0].getHeight();
	public static final String SUITE_ID = "Feature";
	public static final String TEXT_ID = "Text";
	public static final String LINK_ID = "Link";
	public static final String PATTERN_ID = "Pattern";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(SUITE_ID, "Feature",
				suiteTextStyle());
		acceptor.acceptDefaultHighlighting(TEXT_ID, "Text", textTextStyle());
		acceptor.acceptDefaultHighlighting(PATTERN_ID, "Pattern", patternTextStyle());
		acceptor.acceptDefaultHighlighting(LINK_ID, "Link", linkTextStyle());
	}

	public TextStyle suiteTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 3, SWT.BOLD));
		return textStyle;
	}
	
	public TextStyle textTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));
		return textStyle;
	}
	
	public TextStyle patternTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));
		textStyle.setColor(new RGB(171, 48, 0));
		return textStyle;
	}
	
	public TextStyle linkTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	protected FontData fontWithHeight(int height, int style) {
		return new FontData(JFaceResources.DIALOG_FONT, height, style);
	}

}

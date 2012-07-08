/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.highlighting;

import static org.eclipse.jface.resource.JFaceResources.getDefaultFontDescriptor;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend.ide.highlighting.XtendHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz 
 */
public class FeatureHighlightingConfiguration extends XtendHighlightingConfiguration {

	private static final int DEFAULT_FONT_SIZE = getDefaultFontDescriptor()
			.getFontData()[0].getHeight();
	public static final String SCENARIO_ID = "Scenario";
	public static final String TAG_ID = "Tag";
	public static final String CODE_ID = "Code";
	public static final String FEATURE_ID = "Feature";
	public static final String CODE_BOLD_ID = "CodeBold";
	public static final String STEP_ID = "Step";
	public static final String STEP_REFERENCE_ID = "StepReference";
	public static final String STEP_UNRESOLVED_REFERENCE_ID = "StepUnresolvedReference";
	public static final String STEP_TEXT_ID = "Step_Text";
	public static final String EXAMPLE_ID = "Example";
	public static final String IDENTIFIERS_ID = "Identifiers";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(SCENARIO_ID, "Scenario",
				scenarioTextStyle());
		acceptor.acceptDefaultHighlighting(FEATURE_ID, "Feature",
				featureTextStyle());
		acceptor.acceptDefaultHighlighting(STEP_ID, "Step", stepKeyWordStyle());
		acceptor.acceptDefaultHighlighting(STEP_TEXT_ID, "Step_Text", stepTextStyle());
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tag", tagTextStyle());
		acceptor.acceptDefaultHighlighting(CODE_ID, "Code", codeTextStyle());
		acceptor.acceptDefaultHighlighting(CODE_BOLD_ID, "Code Bold",
				codeBoldTextStyle());
		acceptor.acceptDefaultHighlighting(EXAMPLE_ID, "Example",
				exampleWordStyle());
		acceptor.acceptDefaultHighlighting(STEP_REFERENCE_ID, "Step reference",
				stepRefKeyWordStyle());
		acceptor.acceptDefaultHighlighting(STEP_UNRESOLVED_REFERENCE_ID, "Unresolved step reference",
				stepUnresolvedRefKeyWordStyle());
		acceptor.acceptDefaultHighlighting(IDENTIFIERS_ID, "Identifiers", identifiersTextStyle());
	}

	private TextStyle tagTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(grey());
		return textStyle;
	}

	protected RGB grey() {
		return new RGB(125, 125, 125);
	}

	public TextStyle codeTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	public TextStyle codeBoldTextStyle() {
		TextStyle textStyle = super.defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}

	public TextStyle scenarioTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 2, SWT.BOLD));
		return textStyle;
	}

	public TextStyle featureTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 3, SWT.BOLD));
		return textStyle;
	}
	
	public TextStyle stepKeyWordStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1, SWT.BOLD));
		textStyle.setColor(new RGB(50, 150, 36));
		return textStyle;
	}
	
	public TextStyle stepRefKeyWordStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1, SWT.BOLD));
		textStyle.setColor(new RGB(139, 156, 127));
		return textStyle;
	}
	
	public TextStyle stepUnresolvedRefKeyWordStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1, SWT.BOLD));
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}
	
	public TextStyle stepTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1, SWT.BOLD));
		return textStyle;
	}
	
	public TextStyle exampleWordStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 1, SWT.BOLD));
		return textStyle;
	}
	
	public TextStyle identifiersTextStyle(){
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(204, 0, 0));
//		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));
		return textStyle;
	}

	protected FontData fontWithHeight(int height, int style) {
		return new FontData(JFaceResources.DIALOG_FONT, height, style);
	}

//	@Override
//	public TextStyle defaultTextStyle() {
//		TextStyle textStyle = new TextStyle();
//		textStyle.setColor(new RGB(0, 0, 0));
//		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));
//		return textStyle;
//	}
}

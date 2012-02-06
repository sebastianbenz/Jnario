/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.editor;

import static de.bmw.carit.jnario.ui.editor.JnarioTaskTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION;
import static org.eclipse.jface.text.IDocumentExtension3.DEFAULT_PARTITIONING;
import static org.eclipse.jface.text.TextUtilities.getContentType;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.AnnotationPainter.NullStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.custom.LineBackgroundEvent;
import org.eclipse.swt.custom.LineBackgroundListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.xbase.ui.editor.XbaseEditor;

public class JnarioEditor extends XbaseEditor {

	private static final RGB NONE_CODE_COLOR = new RGB(245, 245, 245);
	

	public class CodeBackgroundColorizer implements LineBackgroundListener {
		private Color background;

		public void lineGetBackground(LineBackgroundEvent event) {	
			
			String trimedLine = event.lineText.trim();
			if(trimedLine.isEmpty()){
				event.lineBackground = getBackgroundColor();
			}

			// get offset in displayed document
			int imageDocumentOffset = event.lineOffset + event.lineText.length() - 1;
			
			// get offset in original document for matching with contentType
			XtextSourceViewer viewer = (XtextSourceViewer) getSourceViewer();
			int originalDocumentOffset = viewer.widgetOffset2ModelOffset(imageDocumentOffset);
			
			if (!isNotCode(originalDocumentOffset)) {
				return;
			}
			event.lineBackground = getBackgroundColor();
		}

		private Color getBackgroundColor() {
			if (background == null) {
				background = new Color(Display.getDefault(), NONE_CODE_COLOR);
			}
			return background;
		}

		private boolean isNotCode(int offset) {
			if (offset < 0 || offset > getDocument().getLength()) {
				return false;
			}
			try {
				String contentType = getContentType(getDocument(), DEFAULT_PARTITIONING, offset, false);
				return NONE_CODE_PARTITION.equals(contentType);
			} catch (BadLocationException e) {
				throw new RuntimeException(e);
			}
		}

		public void dispose() {
			getBackgroundColor().dispose();
			background = null;
		}
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer result = super.createSourceViewer(parent, ruler, styles);
		result.getTextWidget().setWordWrap(true);
		result.getTextWidget().addLineBackgroundListener(createBackgroundColorizer());
		return result;
	}

	protected CodeBackgroundColorizer createBackgroundColorizer() {
		return new CodeBackgroundColorizer();
	}

	@Override
	public void dispose() {
		super.dispose();
		createBackgroundColorizer().dispose();
	}
	
	@Override
	protected ProjectionSupport installProjectionSupport(ProjectionViewer projectionViewer) {
		ProjectionSupport projectionSupport = super.installProjectionSupport(projectionViewer);
		projectionSupport.setAnnotationPainterDrawingStrategy(new NullStrategy());
		return projectionSupport;
	}

}
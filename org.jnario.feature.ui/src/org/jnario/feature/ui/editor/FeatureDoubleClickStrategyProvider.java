/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtend.ide.editor.XtendDoubleClickStrategyProvider;
import org.eclipse.xtext.ui.editor.doubleClicking.FixedCharCountPartitionDoubleClickSelector;

public class FeatureDoubleClickStrategyProvider extends
		XtendDoubleClickStrategyProvider {

	
	public ITextDoubleClickStrategy getStrategy(ISourceViewer sourceViewer, String contentType, String documentPartitioning) {
		if (FeatureTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION.equals(contentType))
			return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 0, 0);
		return super.getStrategy(sourceViewer, contentType, documentPartitioning);
	}
}

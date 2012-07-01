/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.autoedit;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtend.ide.autoedit.AutoEditStrategyProvider;
import org.jnario.feature.ui.editor.FeatureTokenTypeToPartitionTypeMapper;

public class FeatureAutoEditStrategyProvider extends AutoEditStrategyProvider{

	@Override
	protected void configureIndentationEditStrategy(IEditStrategyAcceptor acceptor) {
		super.configureIndentationEditStrategy(acceptor);
		acceptor.accept(defaultIndentLineAutoEditStrategy.get(), IDocument.DEFAULT_CONTENT_TYPE);
		acceptor.accept(defaultIndentLineAutoEditStrategy.get(), FeatureTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION);
	}
	
}

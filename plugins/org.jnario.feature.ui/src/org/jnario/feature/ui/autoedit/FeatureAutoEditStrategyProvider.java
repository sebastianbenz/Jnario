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
	
	@Override
	protected void configureStringLiteral(IEditStrategyAcceptor acceptor) {
		acceptor.accept(partitionInsert.newInstance("'''", "'''"), FeatureTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION);
		acceptor.accept(partitionInsert.newInstance("\"","\""),FeatureTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION);
		// The following two are registered for the default content type, because on deletion 
		// the command.offset is cursor-1, which is outside the partition of terminals.length = 1.
		// How crude is that?
		// Note that in case you have two string literals following each other directly, the deletion strategy wouldn't apply.
		// One could add the same strategy for the STRING partition in addition to solve this
		acceptor.accept(partitionDeletion.newInstance("\"","\""),FeatureTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION);
		super.configureStringLiteral(acceptor);
	}
	
}

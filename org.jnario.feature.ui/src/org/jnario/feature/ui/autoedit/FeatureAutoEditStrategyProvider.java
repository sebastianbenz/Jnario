package org.jnario.feature.ui.autoedit;

import org.eclipse.xtend.ide.autoedit.AutoEditStrategyProvider;
import org.jnario.feature.ui.editor.FeatureTaskTokenTypeToPartitionTypeMapper;

public class FeatureAutoEditStrategyProvider extends AutoEditStrategyProvider{

	@Override
	protected void configureIndentationEditStrategy(IEditStrategyAcceptor acceptor) {
		super.configureIndentationEditStrategy(acceptor);
		acceptor.accept(defaultIndentLineAutoEditStrategy.get(), FeatureTaskTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION);
	}
	
}

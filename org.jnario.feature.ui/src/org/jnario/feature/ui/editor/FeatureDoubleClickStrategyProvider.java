package org.jnario.feature.ui.editor;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtend.ide.editor.XtendDoubleClickStrategyProvider;
import org.eclipse.xtext.ui.editor.doubleClicking.FixedCharCountPartitionDoubleClickSelector;

public class FeatureDoubleClickStrategyProvider extends
		XtendDoubleClickStrategyProvider {

	
	public ITextDoubleClickStrategy getStrategy(ISourceViewer sourceViewer, String contentType, String documentPartitioning) {
		if (FeatureTaskTokenTypeToPartitionTypeMapper.NONE_CODE_PARTITION.equals(contentType))
			return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 0, 0);
		return super.getStrategy(sourceViewer, contentType, documentPartitioning);
	}
}

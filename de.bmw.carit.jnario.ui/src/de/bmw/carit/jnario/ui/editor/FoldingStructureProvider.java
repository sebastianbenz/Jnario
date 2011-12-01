package de.bmw.carit.jnario.ui.editor;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider;

public class FoldingStructureProvider extends DefaultFoldingStructureProvider {
	
	@Override
	protected ProjectionAnnotation createProjectionAnnotation(boolean isCollapsed, Position foldedRegion) {
		return new ProjectionAnnotation(isCollapsed){
			
			@Override
			public void paint(org.eclipse.swt.graphics.GC gc, org.eclipse.swt.widgets.Canvas canvas, org.eclipse.swt.graphics.Rectangle rectangle) {
				
			}
		};
	}

}

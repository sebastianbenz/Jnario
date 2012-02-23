/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.xtext.xtend2.ui.editor.InitiallyCollapsableAwareFoldingStructureProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFoldingStructureProvider extends InitiallyCollapsableAwareFoldingStructureProvider {
	
	@Override
	protected ProjectionAnnotation createProjectionAnnotation(boolean isCollapsed, Position foldedRegion) {
		return new ProjectionAnnotation(isCollapsed){
			
			@Override
			public void paint(org.eclipse.swt.graphics.GC gc, org.eclipse.swt.widgets.Canvas canvas, org.eclipse.swt.graphics.Rectangle rectangle) {
				
			}
		};
	}

}

/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureShowCodeHandler extends AbstractHandler {

	private boolean codeIsShown = false;

	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
			return null;
		}

		IHandlerService handlerService = (IHandlerService) window.getWorkbench().getService(IHandlerService.class);
		String commandName;
		if(codeIsShown){
			commandName = "org.eclipse.ui.edit.text.folding.collapse_all";
		}else{
			commandName = "org.eclipse.ui.edit.text.folding.expand_all";
		}

		try {
			handlerService.executeCommand(commandName, new Event());
			codeIsShown = !codeIsShown;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

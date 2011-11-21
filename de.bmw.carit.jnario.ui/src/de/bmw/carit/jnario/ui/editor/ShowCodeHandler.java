package de.bmw.carit.jnario.ui.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

public class ShowCodeHandler extends AbstractHandler {

	private boolean codeIsShown = false;

	@Override
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

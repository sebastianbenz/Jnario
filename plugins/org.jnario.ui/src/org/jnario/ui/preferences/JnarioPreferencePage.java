package org.jnario.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JnarioPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public JnarioPreferencePage() {
		super(GRID);
	}
	
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
	}
	
}
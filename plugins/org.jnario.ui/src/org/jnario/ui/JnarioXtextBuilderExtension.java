package org.jnario.ui;

import org.eclipse.xtext.builder.smap.DebugSourceInstallingCompilationParticipant;
import org.jnario.ui.smap.JnarioDebugSourceInstallingCompilationParticipant;

import com.google.inject.Binder;
import com.google.inject.Module;

public class JnarioXtextBuilderExtension implements Module {

	public void configure(Binder binder) {
		binder.bind(DebugSourceInstallingCompilationParticipant.class).to(JnarioDebugSourceInstallingCompilationParticipant.class);
	}

}

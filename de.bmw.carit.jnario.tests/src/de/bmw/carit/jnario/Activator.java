package de.bmw.carit.jnario;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleReference;

public class Activator extends Plugin {

	private static Activator INSTANCE;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static Activator getDefault() {
		return INSTANCE;
	}

}

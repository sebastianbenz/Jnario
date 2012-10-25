package org.jnario.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SourceAdapter extends AdapterImpl {

	public static SourceAdapter adapt(EObject object, EObject source) {
		SourceAdapter adapter = (SourceAdapter) EcoreUtil.getAdapter(object.eAdapters(), source);
		if (adapter == null) {
			adapter = new SourceAdapter(source);
			object.eAdapters().add(adapter);
		}
		return adapter;
	}
	
	public static EObject find(EObject object) {
		for(Adapter adapter: object.eAdapters()) {
			if (adapter instanceof SourceAdapter)
				return ((SourceAdapter) adapter).getSource();
		}
		return null;
	}

	private final EObject source;
	
	protected SourceAdapter(EObject source) {
		this.source = source;
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type == SourceAdapter.class; 
	}
	
	public EObject getSource() {
		return source;
	}
	
	
}
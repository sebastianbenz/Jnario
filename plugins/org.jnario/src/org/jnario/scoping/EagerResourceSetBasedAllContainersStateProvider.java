package org.jnario.scoping;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;
import org.eclipse.xtext.resource.impl.EagerResourceSetBasedResourceDescriptions;

public class EagerResourceSetBasedAllContainersStateProvider extends
		ResourceSetBasedAllContainersStateProvider {

	@Override
	public IAllContainersState get(IResourceDescriptions context) {
		if (context instanceof EagerResourceSetBasedResourceDescriptions) {
			EagerResourceSetBasedResourceDescriptions resourceDescs = (EagerResourceSetBasedResourceDescriptions) context;
			ResourceSet resourceSet = resourceDescs.getResourceSet();
			IAllContainersState adapter = (IAllContainersState) EcoreUtil.getAdapter(resourceSet.eAdapters(),
					IAllContainersState.class);
			if (adapter == null) {
				return handleAdapterNotFound(resourceSet);
			}
			return adapter;
		}
		return super.get(context);
	}
}

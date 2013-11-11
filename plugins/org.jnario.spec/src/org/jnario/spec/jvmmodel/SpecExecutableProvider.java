package org.jnario.spec.jvmmodel;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.jnario.Executable;
import org.jnario.jvmmodel.ExecutableProvider;

public class SpecExecutableProvider implements ExecutableProvider {

	public List<Executable> getExecutables(Executable executable) {
		List<Executable> result = newArrayList();
		addExecutables(result, executable);
		return result;
	}

	private void addExecutables(List<Executable> result, Executable executable) {
		Iterable<Executable> children = getChildren(executable);
		for (Executable child : children) {
			result.add(child);
			addExecutables(result, child);
		}
	}

	private Iterable<Executable> getChildren(Executable specification) {
		return filter(specification.eContents(), Executable.class);
	}

}

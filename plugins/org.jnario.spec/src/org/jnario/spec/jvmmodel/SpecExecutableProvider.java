package org.jnario.spec.jvmmodel;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.jnario.Executable;
import org.jnario.jvmmodel.ExecutableProvider;

public class SpecExecutableProvider implements ExecutableProvider {

	public List<Executable> getExecutables(Executable specification) {
		return newArrayList(filter(specification.eContents(), Executable.class));
	}

}

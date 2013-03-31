package org.jnario.jvmmodel;

import java.util.List;

import org.jnario.Executable;

public interface ExecutableProvider {

	List<? extends Executable> getExecutables(Executable specification);
	
}

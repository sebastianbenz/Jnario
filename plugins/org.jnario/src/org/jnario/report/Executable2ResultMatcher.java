package org.jnario.report;

import org.jnario.Executable;

public interface Executable2ResultMatcher {
	boolean matches(Executable executable, SpecExecution execution);
}

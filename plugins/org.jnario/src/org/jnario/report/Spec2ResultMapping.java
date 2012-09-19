package org.jnario.report;

import org.jnario.Executable;

import com.google.inject.ImplementedBy;

@ImplementedBy(HashBasedSpec2ResultMapping.class)
public interface Spec2ResultMapping {
	SpecExecution getResult(Executable executable);
}

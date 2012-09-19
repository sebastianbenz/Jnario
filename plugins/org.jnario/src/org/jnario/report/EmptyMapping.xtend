package org.jnario.report

import org.jnario.Executable

class EmptyMapping implements Spec2ResultMapping{
	override SpecExecution getResult(Executable executable){
		return SpecExecution::NO_EXECUTION
	}
}
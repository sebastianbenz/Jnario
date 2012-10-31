package org.jnario.doc

import org.jnario.report.ExecutableStateSwitch
import org.jnario.report.Failed
import org.jnario.report.NotRun
import org.jnario.report.Passed
import org.jnario.report.Pending

class ErrorMessageProvider extends ExecutableStateSwitch<String> {
	

	override protected handleFailed(Failed execution) ''''''
	
	override protected handleNotRun(NotRun execution) ''''''
	
	override protected handlePassed(Passed execution) ''''''
	
	override protected handlePending(Pending execution) ''''''
	
}
package org.jnario.report;

public abstract class ExecutableStateSwitch<T> {
	
	public T doSwitch(SpecExecution execution){
		T result = null;
		if (execution instanceof Failed) {
			result = handleFailed((Failed) execution);
		}else if (execution instanceof NotRun) {
			result = handleNotRun((NotRun) execution);
		}else if (execution instanceof Passed) {
			result = handlePassed((Passed) execution);
		}else if (execution instanceof Pending) {
			result = handlePending((Pending) execution);
		}
		return result;
	}

	protected abstract T handlePassed(Passed execution);
	protected abstract T handlePending(Pending execution);
	protected abstract T handleNotRun(NotRun execution);
	protected abstract T handleFailed(Failed execution);
}

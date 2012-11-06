package org.jnario.lib.tests

import org.eclipse.xtext.xbase.lib.Functions$Function0
import org.jnario.lib.Clock
import org.jnario.lib.Sleeper
import org.jnario.lib.TimeoutError
import org.jnario.lib.Wait
import org.jnario.runner.CreateWith
import org.mockito.Mock

import static org.mockito.Mockito.*

@CreateWith(typeof(MockInjector))
describe Wait {
	
	@Mock Sleeper sleeper
	@Mock Clock clock
	@Mock Functions$Function0<Boolean> condition 
	
	before subject = new Wait(sleeper, clock)

	fact "waits until condition is true"{
		when(condition.apply).thenReturn(false, false, true)
		waitFor(condition)
		verify(condition, times(3)).apply
	}

	fact "tries every specified polling frequency"{
		subject.pollingInterval = 10l
		when(condition.apply).thenReturn(false, false, true)
		waitFor(condition)
		verify(sleeper, times(2)).sleep(10l)			
	}
	
	fact "throws TimeoutError after specified time"{
		subject.duration = 100l
		when(condition.apply).thenReturn(false)
		when(clock.currentTime).thenReturn(0l, 50l, 100l, 150l)
		waitFor(condition) throws TimeoutError
	}
	
	def waitFor(Functions$Function0<Boolean> condition){
		subject.until(condition)
	}
}
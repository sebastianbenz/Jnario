package org.jnario.lib

import java.lang.AssertionError

class TimeoutError extends AssertionError {
	new(String message){
		super(message)
	}
}
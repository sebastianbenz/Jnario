/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ConsoleRecorder {

	var PrintStream old
	var ByteArrayOutputStream pipeOut
	
	def static start(){
		new ConsoleRecorder().startRecording
	}
	
	def startRecording(){
		pipeOut = new ByteArrayOutputStream()
		old = System::out
		System::setOut(new PrintStream(pipeOut))
		return this
	}
	
	def stop(){
		System::setOut(old)
		pipeOut.toString
	}
		
}
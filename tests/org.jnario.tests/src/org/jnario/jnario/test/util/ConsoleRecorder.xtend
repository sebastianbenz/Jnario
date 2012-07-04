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
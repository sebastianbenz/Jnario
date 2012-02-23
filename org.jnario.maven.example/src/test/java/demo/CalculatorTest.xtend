package demo

import org.junit.Test

class CalculatorTest {
	
	@Test
	def void shouldRun(){
		new Calculator().add(1, 1)
	}
	
}
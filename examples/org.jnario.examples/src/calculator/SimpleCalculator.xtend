package calculator

class SimpleCalculator {
	
	val values = <Integer>newArrayList()
	var result = 0
	
	def enter(String string){
		values += Integer::valueOf(string)
	}
	

	def add(){
		result = values.fold(0)[a,b|a + b]
	}
	

	def result(){
		result.toString
	}
	
	override toString() {
		"Calculator"		
	}
}
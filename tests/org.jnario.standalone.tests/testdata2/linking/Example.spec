package linking

describe "Example" {

	def aTable{
		| x | y |
		| 0 | 0 |
	}

	fact "should pass"{
		1 + 1 => 2
	} 
	describe "Nested Example" {
		fact "should pass aswell"{
			1 + 1 => 2
		} 
	}
}
	 
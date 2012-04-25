package calculator

describe Calculator "- A minimal Spec" {
	
	fact subject.add(4, 5) => 9
	fact subject.divide(10, 5) => 1
	fact subject.divide(10, 0) should throw ArithmeticException

}                                          
package calculator

describe Calculator{
	
	context add(int, int){
		it "should add two values"{
			subject.add(1, 2).should.be(3)		
		}
	}
 
	context divide(int, int){
		it "should divide two values"{
			subject.divide(6, 2).should.be(2)		
		}
		it throws ArithmeticException "on division by zero"{
			subject.divide(1, 0)	 	
		}
	}
	
}

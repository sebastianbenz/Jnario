package calculator

import calculator.Calculator

describes Calculator {
       
   var calculator = new Calculator() 

   context "addition"{
   		it "should behave like expected"{
        	calculator.add(5, 1).should(equal(6)))
   		}

   		it "should also do this"{
        	calculator.add(5, 1).should(not(equal(7)))
   		}
   }

   context "division"{
   		it "should behave like expected"{
        	calculator.divide(5, 1).should(equal(6)))
   		}

   		it "should also do this"{
        	calculator.divide(5, 1).should(not(equal(7)))
   		}
   }
       
}

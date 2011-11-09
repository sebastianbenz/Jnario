package calculator

import calculator.Calculator

describes "Calculator" {

   it "shouldAdd"{
   		org::junit::Assert::assertEquals(new calculator.Calculator().add(4, 2), 6) 
   } 
       
}  
  
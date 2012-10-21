package calculator

	Feature: Addition
	
	  In order to avoid silly mistakes
	  As a math idiot
	  I want to be told the sum of two numbers
	  
	  Scenario: Add two numbers
	    val calculator = new Calculator()
	    int result
	    When I entered "50" and "70"
	    	     result = calculator.add(args.first, args.second)
	    Then the result should be "120" 
		     result => args.first.toInt   
		      
  
	      
	      
	      
	      
	      
	      
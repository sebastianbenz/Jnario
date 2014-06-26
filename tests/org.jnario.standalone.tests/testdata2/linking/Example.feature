package linking

Feature: Examples

	Background: Some more info
	
	Given I have entered "333" into the calculator

	Scenario: Example tables.
		var a = 0
		var b = 0
		var result = 0
		Given some two numbers "10" and "20"
			a = args.first.toInt
			b = args.second.toInt
		When I add them
			result = a + b
		Then the result should be "30"
			result => args.first.toInt

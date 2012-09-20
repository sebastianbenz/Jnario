package example
Feature: Something
	Scenario: MyScenario
		Given a step
			1 + 1 => 2
		And a pending step
		And step with umläuts
			1 => 1
		And step with args "arg"
			1 => 1
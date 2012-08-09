package gameoflife

Feature: Game of Life

	Scenario: Box
		Given a world 
			'''
				------
				--XX--
				--XX--
				------
			'''
		When the world evolves
		Then the world is
			'''
				------
				--XX--
				--XX--
				------
			'''
		
	Scenario: Blinker
		Given a world 
			'''
				-----
				--X--
				--X--
				--X--
				-----
			'''
		When the world evolves
		Then the world is
			'''
				-----
				-----
				-XXX-
				-----
				-----
			'''
		
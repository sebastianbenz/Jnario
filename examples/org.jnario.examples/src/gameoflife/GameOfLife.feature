package gameoflife

import static gameoflife.Evolution.*
import static gameoflife.World.*

Feature: Simulating Game of Life

	Scenario: Box
		World world
		Given a world 
			''' 
				------
				--XX--
				--XX--
				------ 
			'''
			world = parseWorld(args.first)
		When the world evolves
			world = gameOfLife.evolve(world)
		Then the world is
			'''
				------
				--XX--
				--XX--
				------
			'''
			world => parseWorld(args.first)
			
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
		
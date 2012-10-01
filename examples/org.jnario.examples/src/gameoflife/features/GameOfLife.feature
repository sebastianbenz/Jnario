package gameoflife.features

import static gameoflife.Evolution.*
import static gameoflife.World.*
import gameoflife.* 

Feature: Playing Game of Life
 
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
			
		Then the world evolves into
			'''
				------
				--XX--
				--XX--
				------
			'''
			world = gameOfLife.evolve(world)
			world => parseWorld(args.first)
			
	Scenario: Blinker 1
		Given a world 
			'''
				-----
				--X--
				--X--
				--X--
				-----
			'''
		Then the world evolves into
			'''
				-----
				-----
				-XXX-
				-----
				-----
			'''
			
	Scenario: Blinker 2
		Given a world 
			'''
				-----
				-----
				-XXX-
				-----
				-----
			'''
		Then the world evolves into
			'''
				-----
				--X--
				--X--
				--X--
				-----
			'''

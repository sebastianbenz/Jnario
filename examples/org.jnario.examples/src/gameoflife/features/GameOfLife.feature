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
			
	Scenario: Blinker
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
		And the world evolves into
			'''
				-----
				--X--
				--X--
				--X--
				-----
			'''
		
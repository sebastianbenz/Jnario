package org.jnario

import java.util.List
import org.hamcrest.Matcher
import static org.hamcrest.CoreMatchers.*

describe "Test"{
	
	Matcher<List<?>> empty = matches("empty")[it.empty]

	fact newArrayList("") should be empty
	
	
	def greaterThan(int x){
		matches("greather than " + x)[List<?> it | size > x]
	}

	fact newArrayList() should be greaterThan(1)
	
	
	facts newArrayList => [
		it should be empty
		size should be 0
	]
	
	fact newArrayList should be allOf(empty, greaterThan(10))
	
}
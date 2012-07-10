/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration
import static org.jnario.lib.JnarioCollectionLiterals.*

/*
 * Jnario provides shorter versions of the Xtend standard collection literals.
 */
describe "Collection Literals"{

	fact "List Literal"{
	  list("green", "red")             => newArrayList("green", "red")
	  list(list("green"), list("red")) => newArrayList(newArrayList("green"), newArrayList("red"))
	}
	
	fact "Set Literal"{
	  set("green", "red")              => newHashSet("green", "red")
	  set(set("green"), set("red"))    => newHashSet(newHashSet("green"), newHashSet("red"))
	}  
	
	fact "Map Literal"{
	  map(
	    "green"  -> "apple",
	    "yellow" -> "banana",
	    "red"    -> "tomato"
	  ) => newHashMap(
	    "green"  -> "apple",
	    "yellow" -> "banana",
	    "red"    -> "tomato"
	  )
	}    
	
	fact "Iterable & Iterator Helpers"{
		val values = list(1, 2, 3, 4 , 5)
		values.first  => 1
		values.second => 2
		values.third  => 3
		values.forth  => 4
		values.fifth  => 5
		
		val objects = list(1, "string", true, "other string")
		objects.first(typeof(String))  => "string"
		objects.second(typeof(String)) => "other string"
	}
			
}
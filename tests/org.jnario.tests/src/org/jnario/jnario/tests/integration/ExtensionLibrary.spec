/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.integration

import static extension org.jnario.lib.StringConversions.*
import static org.jnario.lib.JnarioCollectionLiterals.*

/*
 * Jnario extends the extension library of Xtend with additional 
 * functions which can be useful when writing tests. 
 * 
 */
describe "Extension Library"{
	
	/*
	 * When writing tests the concrete implementation of a collection usually doesn't matter
	 * so much. Therefore, Jnario provides shorter versions of Xtend's collection literals.
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
	}
	
	/*
	 * Another common use case when writing speces is to access specific 
	 * elements collections, iterables & iterators. Jnario provides helper 
	 * methods to simplify accessing elements by index.
	 */
	describe "Iterable & Iterator Helpers"{
		
		/*
		 * Accessing elements in Iterables by index or type.
		 * These extensions work also with Lists and other Collections.
		 */
		fact "Iterables"{
			val values = list(1, 2, 3, 4 , 5)
			
			values.first  => 1
			values.last   => 5

			values.second => 2
			values.third  => 3
			values.forth  => 4
			values.fifth  => 5
			
			values.get(3) => 4
			
			val objects = list(1, "string", true, "other string")
			objects.first(typeof(String))  => "string"
			objects.second(typeof(String)) => "other string"
		}
		
		/*
		 * These methods work also for Iterators. Note 
		 * that calling one of these methods will consume
		 * the iterator to the position of the returned element.
		 */
		fact "Iterators"{
			val values = list(1, 2, 3, 4 , 5)

			values.iterator.first  => 1
			values.iterator.last   => 5
			
			values.iterator.get(3) => 4

			values.iterator.second => 2
			values.iterator.third  => 3
			values.iterator.forth  => 4
			values.iterator.fifth  => 5
			
			val objects = list(1, "string", true, "other string")
			objects.iterator.first(typeof(String))  => "string"
			objects.iterator.second(typeof(String)) => "other string"
		}
	}
	
	/*
	 * Arguments passed in from step definitions in Jnario Features
	 * are always of type String. These extension methods simplify 
	 * converting these string parameters into other types or representations.
	 */
	describe "Converting Strings"{
		
		/*
		 * Converting strings to other primitive types.
		 */
		fact "Converting Strings to Primitives"{
			"true".toBool  => true
			"5".toInt      => 5
			"5.5".toDouble => 5.5
			"5".toLong     => 5l
		}
		
		/*
		 * Converting comma separated value strings into a list of strings.
		 */
		fact "Converting Strings to Lists"{
			"1,2,3".toList              => list("1", "2", "3")
			"1, 2, 3".toList            => list("1", "2", "3")
			"1, 2, 3".toList.map[toInt] => list(1, 2, 3)
		}
	}
			
}
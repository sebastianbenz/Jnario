package org.jnario.lib;

import java.util.Iterator;

import com.google.common.collect.Iterators;

public class JnarioIteratorExtensions {

	/**
     * Returns the element at the specified position in the arguments.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this argument list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
	public static <T> T  get(Iterator<T> iterator, int index){
		return Iterators.get(iterator, index);
	}
	
	/**
	 * @return the first argument
	 */
	public static <T> T first(Iterator<T> iterator){
		return get(iterator, 0);
	}
	
	/**
	 * @return the second argument
	 */
	public static <T> T  second(Iterator<T> iterator){
		return  get(iterator, 1);
	}
	
	/**
	 * @return the third argument
	 */
	public static <T> T  third(Iterator<T> iterator){
		return  get(iterator, 2);
	}
	
	/**
	 * @return the forth argument
	 */
	public static <T> T  forth(Iterator<T> iterator){
		return  get(iterator, 3);
	}
	
	/**
	 * @return the fifth argument
	 */
	public static <T> T  fifth(Iterator<T> iterator){
		return get(iterator, 4);
	}
}

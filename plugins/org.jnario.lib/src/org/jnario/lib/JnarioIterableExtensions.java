package org.jnario.lib;

import com.google.common.collect.Iterables;

public class JnarioIterableExtensions {

	/**
     * Returns the element at the specified position in the arguments.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this argument list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
	public static <T> T  get(Iterable<T> iterable, int index){
		return Iterables.get(iterable, index);
	}
	
	/**
	 * @return the first argument
	 */
	public static <T> T first(Iterable<T> iterable){
		return get(iterable, 0);
	}
	
	/**
	 * @return the second argument
	 */
	public static <T> T  second(Iterable<T> iterable){
		return  get(iterable, 1);
	}
	
	/**
	 * @return the third argument
	 */
	public static <T> T  third(Iterable<T> iterable){
		return  get(iterable, 2);
	}
	
	/**
	 * @return the forth argument
	 */
	public static <T> T  forth(Iterable<T> iterable){
		return  get(iterable, 3);
	}
	
	/**
	 * @return the fifth argument
	 */
	public static <T> T  fifth(Iterable<T> iterable){
		return get(iterable, 4);
	}
}

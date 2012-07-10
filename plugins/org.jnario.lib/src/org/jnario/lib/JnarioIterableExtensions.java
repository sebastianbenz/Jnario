package org.jnario.lib;

import static com.google.common.collect.Iterables.filter;

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
	
	/**
	 * @return the first argument with the specified type
	 */
	public static <T> T first(Iterable<?> iterator, Class<T> type){
		return first(filter(iterator, type));
	}
	
	/**
	 * @return the second argument with the specified type
	 */
	public static <T> T  second(Iterable<?> iterator, Class<T> type){
		return  second(filter(iterator, type));
	}
}

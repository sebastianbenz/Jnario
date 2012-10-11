/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.util.List;

import com.google.common.base.Function;

/**
 * Jnario extensions to convert string values into other formats. 
 * Useful when converting {@link StepArguments}.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class StringConversions {

	/**
     * Parses the string argument as a signed decimal integer. The 
     * characters in the string must all be decimal digits, except that 
     * the first character may be an ASCII minus sign <code>'-'</code> 
     * (<code>'&#92;u002D'</code>) to indicate a negative value. The resulting 
     * integer value is returned, exactly as if the argument and the radix 
     * 10 were given as arguments to the 
     * {@link #parseInt(java.lang.String, int)} method.
     *
     * @param s	   a <code>String</code> containing the <code>int</code>
     *             representation to be parsed
     * @return     the integer value represented by the argument in decimal.
     * @exception  NumberFormatException  if the string does not contain a
     *               parsable integer.
     * @see        java.lang.Integer#parseInt(String)	
     */
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
	
	 /**
     * Parses the string argument as a signed decimal
     * <code>long</code>.  The characters in the string must all be
     * decimal digits, except that the first character may be an ASCII
     * minus sign <code>'-'</code> (<code>&#92;u002D'</code>) to
     * indicate a negative value. The resulting <code>long</code>
     * value is returned, exactly as if the argument and the radix
     * <code>10</code> were given as arguments to the {@link
     * #parseLong(java.lang.String, int)} method.
     * <p>
     * Note that neither the character <code>L</code>
     * (<code>'&#92;u004C'</code>) nor <code>l</code>
     * (<code>'&#92;u006C'</code>) is permitted to appear at the end
     * of the string as a type indicator, as would be permitted in
     * Java programming language source code.
     *
     * @param      s   a <code>String</code> containing the <code>long</code>
     *             representation to be parsed
     * @return     the <code>long</code> represented by the argument in 
     *		   decimal.
     * @exception  NumberFormatException  if the string does not contain a
     *               parsable <code>long</code>.
     * @see        java.lang.Long#parseLong(String)	
     */
	public static long toLong(String s) {
		return Long.parseLong(s);
	}
	
    /**
     * Returns a new <code>double</code> initialized to the value
     * represented by the specified <code>String</code>, as performed
     * by the <code>valueOf</code> method of class
     * <code>Double</code>.
     *
     * @param      s   the string to be parsed.
     * @return the <code>double</code> value represented by the string
     *         argument.
     * @exception NumberFormatException if the string does not contain
     *            a parsable <code>double</code>.
     * @see        java.lang.Double#parseDouble(String)
     */
	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}
	
	/**
     * Returns a <code>Boolean</code> with a value represented by the
     * specified string.  The <code>Boolean</code> returned represents a
     * true value if the string argument is not <code>null</code>
     * and is equal, ignoring case, to the string {@code "true"}.
     *
     * @param   s   a string.
     * @return  the <code>Boolean</code> value represented by the string.
     * @see        java.lang.Boolean#parseBoolean(String)
     */
	public static boolean toBool(String s) {
		return Boolean.parseBoolean(s);
	}
    /**
     * Translates the string representation of a {@code BigDecimal}
     * into a {@code BigDecimal}.  The string representation consists
     * of an optional sign, {@code '+'} (<tt> '&#92;u002B'</tt>) or
     * {@code '-'} (<tt>'&#92;u002D'</tt>), followed by a sequence of
     * zero or more decimal digits ("the integer"), optionally
     * followed by a fraction, optionally followed by an exponent.
     */
	public static BigDecimal toBigDecimal(String s) {
		if("0".equals(s)){
			return BigDecimal.ZERO;
		}
		if("1".equals(s)){
			return BigDecimal.ONE;
		}
		if("10".equals(s)){
			return BigDecimal.TEN;
		}
		return new BigDecimal(s);
	}
	
	/**
	 * Convert a comma separated value string into a {@link List}.
	 * 
	 * @param s a list with comma separated values
	 * @return a list with the trimmed values
	 */
	public static List<String> toList(String s){
		return transform(asList(s.split(",\\s*")), new Function<String, String>() {
			public String apply(String input){
				return input.trim();
			}
		});
	}
	
	/**
	 * Removes for each line in a string all similiar white spaces.
	 * This is useful when 
	 * processing multiline strings arguments from steps in feature files.
	 * 
	 * @param the input {@link CharSequence}
	 * @return the normalized string
	 */
	public static String normalize(CharSequence input){
		return new WhiteSpaceNormalizer().normalize(input);
	}
}

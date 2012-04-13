/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.util;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.isWhitespace;
import static java.lang.Character.toUpperCase;

import java.io.InputStream;
import java.util.Scanner;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Strings extends org.eclipse.xtext.util.Strings{

	
	
	public static String convertStreamToString(InputStream is) { 
	    return new Scanner(is).useDelimiter("\\A").next();
	}
	
	public static String convertToCamelCase(String string) {
		return convertToCamelCase(new StringBuilder(string)).toString();
	}
	
	public static StringBuilder convertToCamelCase(StringBuilder string) {
		StringBuilder b = new StringBuilder();
		if(string == null){
			return b.append("Null");
		}
		boolean lastWhiteSpace = true;
		for(int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			if(isLetterOrDigit(c)){
				if(lastWhiteSpace){
					c = toUpperCase(c);
				}
				b.append(c);
				lastWhiteSpace = false;
			}else{
				lastWhiteSpace = true;
			}
		}
		return b;
	}
	
	private static boolean isWhiteSpace(String desc, int begin) {
		return Character.isWhitespace(desc.charAt(begin));
	}

	
	public static String getFirstWord(String string){
		if(string != null){
			int begin = 0;
			for (; isWhiteSpace(string, begin); begin++) {
			}
			int end = string.indexOf(' ', begin);
			if (end > 0) {
				return string.substring(begin, end);
			} else{
				if(string.length() > 0){
					return string;
				}
			}
		}
		return "";
	}

	public static int startsWithWord(String string, String word) {
		if(word.length() > string.length()){
			return -1;
		}
		for(int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			if(!isWhitespace(c)){
				for(int j = 0; j < word.length(); j++){
					if(word.charAt(j) != string.charAt(i + j)){
						return -1;
					}
				}
				return i;
			}
		}
		return -1;
	}
}

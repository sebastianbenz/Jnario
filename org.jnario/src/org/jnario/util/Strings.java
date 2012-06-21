/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.util;

import static java.lang.Character.isJavaIdentifierPart;
import static java.lang.Character.isJavaIdentifierStart;
import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.isWhitespace;
import static java.lang.Character.toUpperCase;

import java.io.InputStream;
import java.util.Scanner;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Strings extends org.eclipse.xtext.util.Strings{
	
	public static int trimWhitespaceAtEnd(String s){
		int count = 0;
		for(int j = s.length()-1; j >= 0 && isWhitespace(s.charAt(j)); j--){
			count++;
		}
		return count;
	}
	
	public static String trimFirstLine(String s){
		int index = indexOfNewLine(s);
		if(index == -1){
			return "";
		}
		return s.substring(index+1);
	}
	
	public static int indexOfNewLine(String s){
		return indexOf(s, '\r', '\n');
	}
	
	public static int indexOf(String s, char... chars){
		if(s == null){
			return -1;
		}
		for(int i = 0; i < s.length(); i++){
			for (char c : chars) {
				if(c == s.charAt(i)){
					return i;
				}
			}
		}
		return -1;
	}
	
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
				if(isValidJavarIndentifier(i, c)){
					b.append(c);
				}
				lastWhiteSpace = false;
			}else{
				lastWhiteSpace = true;
			}
		}
		return b;
	}

	private static boolean isValidJavarIndentifier(int position, char c) {
		return (position == 0 && isJavaIdentifierStart(c)) || isJavaIdentifierPart(c);
	}
	
	public static String getFirstWord(String string){
		if(string != null){
			int begin = 0;
			for (; isWhitespace(string.charAt(begin)); begin++) {
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
				for(int j = 0; j < word.length() && i + j < string.length(); j++){
					if(word.charAt(j) != string.charAt(i + j)){
						return -1;
					}
				}
				return i;
			}
		}
		return -1;
	}
	
	public static String firstLine(String string){
		int lineEnd = indexOf(string, '\r', '\n');
		if(lineEnd == -1){
			return string;
		}
		return string.substring(0, lineEnd);
	}

	public static String toClassName(String originalName){
		if(originalName == null){
			return null;
		}
		return toFirstUpper(convertToCamelCase(originalName));
	}

	public static String toClassName(String name, String keyword) {
		if(isEmpty(name)){
			name = "";
		}
		String keyWithSeparator = keyword + ": ";
		if(name.indexOf(keyWithSeparator) == -1){
			name = "";
		}else{
			name = name.substring(keyWithSeparator.length());
		}
		name = name.trim();
		if(name.length() == 0){
			name = keyword;
		}
		return toClassName(name);
	}

	public static int lastIndexOfPrefix(String s, char c) {
		int begin = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c){
				begin++;
			}else{
				break;
			}
		}
		return begin;
	}
}

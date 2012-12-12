/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.util;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.io.Closeables.closeQuietly;
import static java.lang.Character.isJavaIdentifierPart;
import static java.lang.Character.isJavaIdentifierStart;
import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.isWhitespace;
import static java.lang.Character.toUpperCase;
import static java.util.Collections.singletonMap;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Strings extends org.eclipse.xtext.util.Strings{
	
	public static int countWhitespaceAtEnd(CharSequence s){
		int count = 0;
		for(int j = s.length()-1; j >= 0 && isWhitespace(s.charAt(j)); j--){
			count++;
		}
		return count;
	}
	
	public static CharSequence trimWhitespaceAtEnd(CharSequence s){
		int count = countWhitespaceAtEnd(s);
		return s.subSequence(0, s.length() - count);
	}
	
	public static String trim(String s, char c){
		if(isNullOrEmpty(s)){
			return s;
		}
		int start = 0;
		while(start < s.length() && s.charAt(start) == c){
			start++;
		}
		int end = s.length();
		while(end > start && s.charAt(end-1) == c){
			end--;
		}
		return s.substring(start, end);
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
	
	@SuppressWarnings("resource")
	public static String convertStreamToString(InputStream is) { 
		String result = new Scanner(is).useDelimiter("\\A").next();
	    closeQuietly(is);
		return result;
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
			if(isLetterOrDigit(c) || isTrailingEscapeCharacter(i, c)){
				if(lastWhiteSpace){
					c = toUpperCase(c);
				}
				if(i == 0 && !isJavaIdentifierStart(c) && isJavaIdentifierPart(c)){
					b.append("_");
				}
				if(isJavaIdentifierPart(c)){
					b.append(c);
				}
				lastWhiteSpace = false;
			}else{
				lastWhiteSpace = true;
			}
		}
		return b;
	}

	private static boolean isTrailingEscapeCharacter(int i, char c) {
		return i == 0 && c == '_';
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
	
	public static String makeJunitConform(StringBuilder result) {
		return makeJunitConform(result.toString());
	}
	
	public static String makeJunitConform(String result) {
		if(result == null){
			return null;
		}
		result = result.replaceAll("\\r?\\n\\s*", " ");
		return convertToJavaString(replace(result, '(', '[', ')', ']', '#', '-'), true).trim();
	}
	
	private static String replace(String s, char... replacements){
		if(s == null){
			return null;
		}
		boolean isReplaced = false;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			isReplaced = false;
			char c = s.charAt(i);
			for(int j = 0; j < replacements.length; j = j + 2){
				char pattern = replacements[j];
				if(pattern == c){
					sb.append(replacements[j+1]);
					isReplaced = true;
					break;
				}
			}
			if(!isReplaced){
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static StringBuilder markAsPending(StringBuilder sb){
		return sb.append(" [PENDING]");
	}

	public static String toString(Resource resource) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			resource.save(outputStream, singletonMap(SaveOptions.defaultOptions(), true));
		} catch (Exception ex) {
			Exceptions.sneakyThrow(ex);
		}
		return outputStream.toString();
	}
	
	public static String trailingWhitespace(CharSequence s){
		if(s == null || s.length() == 0){
			return "";
		}
		String result = "";
		int i = s.length()-1;
		char lastChar = s.charAt(i);
		while(isWhitespace(lastChar)){
			result = lastChar + result;
			i--;
			if(i < 0){
				break;
			}
			lastChar = s.charAt(i);
		}
		return result;
	}
	
	public static boolean endsWith(CharSequence s, CharSequence postfix){
		if(s.length() < postfix.length()){
			return false;
		}
		int offset = s.length() - postfix.length();
		for(int i = 0; i < postfix.length(); i++){
			char left = s.charAt(i + offset);
			char right = postfix.charAt(i);
			if(left != right){
				return false;
			}
			
		}
		return true;
	}

}

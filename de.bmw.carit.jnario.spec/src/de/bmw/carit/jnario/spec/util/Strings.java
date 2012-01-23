/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.util;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toUpperCase;

import java.io.InputStream;
import java.util.Scanner;
/**
 * @author Sebastian Benz
 */
public class Strings {

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

}

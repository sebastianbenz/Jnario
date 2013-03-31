/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import java.lang.reflect.Method;

import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * A converter from {@link Named} annotation values to unicode strings.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class NameProvider {
	
	public static NameProvider create(){
		return new NameProvider();
	}

	public String nameOf(Method javaMethod) {
		return nameOf(javaMethod.getAnnotation(Named.class), javaMethod.getName());
	}

	private String nameOf(Named named, String defaultName) {
		return named == null ? defaultName : convertFromJavaString(named.value(), true);
	}

	public String nameOf(Class<?> javaClass) {
		return nameOf(javaClass.getAnnotation(Named.class), javaClass.getName());
	}
	

	/**
	 * Mostly copied from {@link java.util.Properties#loadConvert}
	 */
	private String convertFromJavaString(String javaString, boolean useUnicode) {
		char[] in = javaString.toCharArray();
		int off = 0;
		int len = javaString.length();
		char[] convtBuf = new char[len];
		char aChar;
		char[] out = convtBuf;
		int outLen = 0;
		int end = off + len;

		while (off < end) {
			aChar = in[off++];
			if (aChar == '\\') {
				aChar = in[off++];
				if (useUnicode && aChar == 'u') {
					// Read the xxxx
					int value = 0;
					if(off+4 > end)
						throw new IllegalArgumentException("Malformed \\uxxxx encoding.");
					for (int i = 0; i < 4; i++) {
						aChar = in[off++];
						switch (aChar) {
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
								value = (value << 4) + aChar - '0';
								break;
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
								value = (value << 4) + 10 + aChar - 'a';
								break;
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
								value = (value << 4) + 10 + aChar - 'A';
								break;
							default:
								throw new IllegalArgumentException("Malformed \\uxxxx encoding.");
						}
					}
					out[outLen++] = (char) value;
				} else {
					if (aChar == 't')
						aChar = '\t';
					else if (aChar == 'r')
						aChar = '\r';
					else if (aChar == 'n')
						aChar = '\n';
					else if (aChar == 'f')
						aChar = '\f';
					else if (aChar == 'b')
						aChar = '\b';
					else if (aChar == '"')
						aChar = '\"';
					else if (aChar == '\'')
						aChar = '\'';
					else if (aChar == '\\')
						aChar = '\\';
					else
						throw new IllegalArgumentException("Illegal escape character \\" + aChar);
					out[outLen++] = aChar;
				}
			} else {
				out[outLen++] = aChar;
			}
		}
		return new String(out, 0, outLen);
	}

	public String nameOf(Class<?> javaClass, String methodName) {
		try {
			Method method = javaClass.getMethod(methodName);
			return nameOf(method);
		} catch (SecurityException e) {
			Exceptions.sneakyThrow(e);
		} catch (NoSuchMethodException e) {
			Exceptions.sneakyThrow(e);
		}
		return methodName;
	}

}

/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.doc

import java.util.regex.Pattern

import static org.jnario.spec.doc.FilterExtractor.*
import static org.jnario.spec.doc.FilteringResult.*
import java.util.List

class FilterExtractor {
	
	private static String TAG = "(^|\\W)@filter(\\((.*?)\\))"
	private static Pattern TAG_PATTERN = Pattern::compile(TAG, Pattern::DOTALL)
	
	def FilteringResult apply(String input){
		if(input == null){
			return EMPTY_RESULT
		}
		val resultString = new StringBuilder()
		val List<Filter> filters = newArrayList()
		
		val matcher = TAG_PATTERN.matcher(input);
		var offset = 0
		while (matcher.find()) {
			filters += RegexFilter::create(matcher.group(3))
			
			val nextOffset = matcher.start()
			resultString.append(input.substring(offset, nextOffset))
			offset = matcher.end()
		}

		resultString.append(input.substring(offset))
		return new FilteringResult(resultString.toString, filters)
	}
} 
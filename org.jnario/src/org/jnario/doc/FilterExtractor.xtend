/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import java.util.regex.Pattern

import static org.jnario.doc.FilterExtractor.*
import static org.jnario.doc.FilteringResult.*
import java.util.List
import java.util.Map
import org.eclipse.xtext.xbase.lib.Functions$Function1

class FilterExtractor {

	private static String TAG = "(^|\\W)@(\\w+)(\\((.*?)\\))"
	private static Pattern TAG_PATTERN = Pattern::compile(TAG, Pattern::DOTALL)
	
	private Map<String, Function1<String,Filter>> filterRegistry = newHashMap(
			"filter" -> [String s | RegexFilter::create(s)],
			"lang" -> [String s | LangFilter::create(s)]
	)
	
	def FilteringResult apply(String input){
		if(input == null){
			return EMPTY_RESULT
		}
		val resultString = new StringBuilder()
		val List<Filter> filters = newArrayList()
		
		val matcher = TAG_PATTERN.matcher(input);
		var offset = 0
		while (matcher.find()) {
			val key = matcher.group(2)
			val candidate = filterRegistry.get(key)
			if(candidate != null){
				filters += candidate.apply(matcher.group(4))
			}
			
			val nextOffset = matcher.start()
			resultString.append(input.substring(offset, nextOffset))
			offset = matcher.end()
		}

		resultString.append(input.substring(offset))
		return new FilteringResult(resultString.toString, filters)
	}
} 
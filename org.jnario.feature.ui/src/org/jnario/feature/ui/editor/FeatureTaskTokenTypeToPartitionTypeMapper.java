/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import java.util.HashSet;

import org.eclipse.xtend.ide.autoedit.TokenTypeToPartitionMapper;

import com.google.common.collect.Sets;
import com.google.inject.Singleton;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Singleton
public class FeatureTaskTokenTypeToPartitionTypeMapper extends TokenTypeToPartitionMapper{

	public static final String NONE_CODE_PARTITION = "__no_code";

	protected static final String[] SUPPORTED_PARTITIONS = new String[]{
		NONE_CODE_PARTITION
	};

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		HashSet<String> noCodeTokens = Sets.newHashSet(
				"RULE_SCENARIO_TEXT", 
				"RULE_FEATURE_TEXT",
				"RULE_IN_ORDER_TEXT",
				"RULE_AS_A_TEXT",
				"RULE_I_WANT_TEXT",
				"RULE_GIVEN_TEXT",
				"RULE_WHEN_TEXT",
				"RULE_THEN_TEXT",
				"RULE_AND_TEXT",
				"RULE_BACKGROUND_TEXT",
				"RULE_EXAMPLE_TEXT",
				"RULE_ANY_OTHER",
				"RULE_EXAMPLE_ROW_END");
		if(noCodeTokens.contains(tokenName)){
			return NONE_CODE_PARTITION;
		}
		return super.calculateId(tokenName, tokenType);
	}

	@Override
	public String[] getSupportedPartitionTypes() {
		String[] supportedPartitionTypes = super.getSupportedPartitionTypes();
		String[] types = new String[supportedPartitionTypes.length + SUPPORTED_PARTITIONS.length];
		int offset = 0;
		for(String part: SUPPORTED_PARTITIONS){
			types[offset] = part;
			offset++;
		}
		for(String part: supportedPartitionTypes){
			types[offset] = part;
			offset++;
		}
		return types;
	}
}
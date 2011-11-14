package de.bmw.carit.jnario.ui.editor;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

import com.google.common.collect.Sets;
import com.google.inject.Singleton;

@Singleton
public class TaskTokenTypeToPartitionTypeMapper extends TerminalsTokenTypeToPartitionMapper{

	public static final String NONE_CODE_PARTITION = "__no_code";

	protected static final String[] SUPPORTED_PARTITIONS = new String[]{
		NONE_CODE_PARTITION
	};

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		HashSet<String> noCodeTokens = Sets.newHashSet(
				"RULE_SCENARIO_TEXT", 
				"RULE_FEATURE_TEXT",
				"RULE_GIVEN_TEXT",
				"RULE_WHEN_TEXT",
				"RULE_THEN_TEXT",
				"RULE_AND_TEXT",
				"RULE_BACKGROUND_TEXT",
				"RULE_EXAMPLE_TEXT",
				"RULE_ANY_OTHER");
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
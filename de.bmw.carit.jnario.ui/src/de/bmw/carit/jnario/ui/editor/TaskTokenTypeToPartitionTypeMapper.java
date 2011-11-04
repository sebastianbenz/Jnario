package de.bmw.carit.jnario.ui.editor;

import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

import com.google.inject.Singleton;

@Singleton
public class TaskTokenTypeToPartitionTypeMapper extends TerminalsTokenTypeToPartitionMapper{

	public static final String CODE_PARTITION = "__code";

	protected static final String[] SUPPORTED_PARTITIONS = new String[]{
		CODE_PARTITION
	};

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_CODE".equals(tokenName)) {
			return CODE_PARTITION;
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
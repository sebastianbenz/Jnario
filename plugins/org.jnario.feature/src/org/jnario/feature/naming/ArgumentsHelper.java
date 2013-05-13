package org.jnario.feature.naming;

import static java.lang.Character.UNASSIGNED;
import static java.lang.Character.isWhitespace;

public class ArgumentsHelper {

	public static String removeArgumentValues(String name){
		char block = UNASSIGNED;
		boolean inBlock = false;
		boolean prevIsWhiteSpace = false;
		StringBuilder result = new StringBuilder(name.length());
		for(int i = 0; i < name.length(); i++){
			char c = name.charAt(i);
			if(c == '\t'){
				c = ' ';
			}
			if((block == '"' && c == '"') || (block == '\'' && c == '\'')){
				inBlock = false;
				block = UNASSIGNED;
			}else if(block == UNASSIGNED && (c == '"' || c == '\'')){
				inBlock = true;
				block = c;
				result.append(c);
			}
			boolean currentIsWhiteSpace = isWhitespace(c);
			if(!inBlock && !(prevIsWhiteSpace && currentIsWhiteSpace)){
				result.append(c);
			}
			prevIsWhiteSpace = currentIsWhiteSpace;
		}
		return result.toString();
	}
	
}

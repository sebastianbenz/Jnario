package de.bmw.carit.jnario.spec.util;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toUpperCase;

public class Strings {

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

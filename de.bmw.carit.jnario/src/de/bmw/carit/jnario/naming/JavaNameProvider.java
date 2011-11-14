package de.bmw.carit.jnario.naming;

import org.eclipse.xtext.util.Strings;

public class JavaNameProvider {
	
	public String getJavaClassName(String originalName){
		return Strings.toFirstUpper(getValidName(originalName));
	}
	
	public String getJavaMethodName(String originalName){
		return Strings.toFirstLower(getValidName(originalName));
	}
	
	private String getValidName(String originalName){
		String name = "";
		originalName = originalName.trim();
		String[] words = originalName.split(" ");
		for(String word: words){
			if(!word.isEmpty()){
				name = name + Strings.toFirstUpper(word);
			}
		}
		return name.replaceAll("[^A-Za-z0-9]","");
	}

}

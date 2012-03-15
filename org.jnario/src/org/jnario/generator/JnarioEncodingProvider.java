package org.jnario.generator;


public class JnarioEncodingProvider{

	public String getEncoding(String fileExtension, String defaultEncoding) {
		if("html".equals(fileExtension)){
			return "UTF8";
		}
		return defaultEncoding;
	}

}

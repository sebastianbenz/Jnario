package org.jnario.jnario.test.util;

public class Strings {
	public static String platformIndependent(CharSequence s){
		return s.toString().replace("\r", "");
	}
}

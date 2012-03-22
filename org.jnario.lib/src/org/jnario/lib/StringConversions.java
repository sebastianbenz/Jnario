package org.jnario.lib;

import java.math.BigDecimal;

public class StringConversions {

	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
	
	public static long toLong(String s) {
		return Long.parseLong(s);
	}
	
	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}
	
	public static Boolean toBool(String s) {
		return Boolean.valueOf(s);
	}
	
	public static BigDecimal toBigDecimal(String s) {
		if("0".equals(s)){
			return BigDecimal.ZERO;
		}
		if("1".equals(s)){
			return BigDecimal.ONE;
		}
		if("10".equals(s)){
			return BigDecimal.TEN;
		}
		return new BigDecimal(s);
	}
}

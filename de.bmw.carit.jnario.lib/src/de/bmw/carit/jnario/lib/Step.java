package de.bmw.carit.jnario.lib;

public interface Step {
	
	public class Inverse implements Step{

		@Override
		public boolean apply(boolean input) {
			return !input;
		}
		
	}

	public static final Step NOT = new Inverse();

	
	boolean apply(boolean input);
	
}

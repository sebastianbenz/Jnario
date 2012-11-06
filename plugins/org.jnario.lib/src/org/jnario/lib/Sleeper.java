package org.jnario.lib;

public interface Sleeper {
	
	public static final Sleeper SYSTEM_SLEEPER = new Sleeper(){
		public void sleep(long milis) throws InterruptedException {
			Thread.sleep(milis);
		}
	};
	
	public void sleep(long milis) throws InterruptedException;
}

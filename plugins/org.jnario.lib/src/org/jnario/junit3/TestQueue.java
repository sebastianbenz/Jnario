package org.jnario.junit3;

import static java.util.Arrays.asList;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	
	private final Queue<String> names;
	private int initialSize;;
	
	public TestQueue(String...names) {
		this.names = new LinkedList<String>(asList(names));
		initialSize = names.length;
	}
	
	public String next(){
		return names.remove();
	}
	
	public String peek(){
		return names.peek();
	}
	
	public boolean isRunning(){
		return names.size() < initialSize-1;
	}
	
	public boolean isDone(){
		return names.size() < 1;
	}

}

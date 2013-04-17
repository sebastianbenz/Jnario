package org.jnario.report;

import java.util.Arrays;
import java.util.Collections;

import com.google.common.collect.ImmutableList;

public class Failed extends SpecExecution{
	public static Failed failingSpec(String className, String name, double executionTimeInSeconds, SpecFailure... failures){
		return new Failed(className, name, executionTimeInSeconds, Arrays.asList(failures));
	}
	public Failed(String className, String name, double executionTimeInSeconds, Iterable<SpecFailure> failures) {
		super(className, name, executionTimeInSeconds, ImmutableList.copyOf(failures));
	}
}
 


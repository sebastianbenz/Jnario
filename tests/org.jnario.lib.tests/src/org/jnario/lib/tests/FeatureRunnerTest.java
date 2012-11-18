/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.tests;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import java.util.List;

import org.jnario.runner.Contains;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class FeatureRunnerTest {

	public static class MyRule implements TestRule{

		public Statement apply(final Statement base, Description description) {
			return new Statement() {
				
				@Override
				public void evaluate() throws Throwable {
					LOG.add("before");
					base.evaluate();
					LOG.add("after");
				}
			}; 
		}
		
	}
	
	@RunWith(FeatureRunner.class)
	@Contains({Scenario1.class, Scenario2.class})
	public static class Feature{
	}
	
	@RunWith(FeatureRunner.class)
	public static class Scenario1{
		
		@Rule public static MyRule rule = new MyRule();
		
		private static Object fieldCheck = null;
		private Object field = new Object();
		
		@Order(1)
		@Test public void step1(){
			LOG.add("step1");
			fieldCheck = field;
		}
		
		@Order(2)
		@Test public void step2(){
			LOG.add("step2");
			assertSameState(); 
		}

		@Order(3)
		@Test public void step3(){
			LOG.add("step3");
			assertSameState(); 
		}

		private void assertSameState() {
			assertSame("object state was reset between steps", fieldCheck, field);
		}
	}
	
	@RunWith(FeatureRunner.class)
	public static class Scenario2{
		
		@Rule public static MyRule rule = new MyRule();
		
		@Order(1)
		@Test public void step4(){
			LOG.add("step4");
		}
		
		@Order(2)
		@Test public void step5(){
			LOG.add("step5");
		}
		
		@Order(3)
		@Test public void step6(){
			LOG.add("step6");
		}
	}
	
	@RunWith(FeatureRunner.class)
	public static class FeatureWithExtension{
		
		@Extension public static MyRule rule = new MyRule();
		
		@Order(1)
		@Test public void step4(){
			LOG.add("step4");
		}
		
		@Order(2)
		@Test public void step5(){
			LOG.add("step5");
		}
		
		@Order(3)
		@Test public void step6(){
			LOG.add("step6");
		}
	}
	
	private static List<String> LOG = newArrayList();
	
	@Test
	public void rulesAreExecutedBeforeAndAfterAScenario() throws InitializationError {
		assertThat(testResult(Feature.class), isSuccessful());
		assertEquals(
				newArrayList(	"before", "step1", "step2", "step3", "after", 
								"before", "step4", "step5", "step6", "after" ), LOG);
	}
	
	@Before public void clearLog(){
		LOG.clear();
	}
	

}

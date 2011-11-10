package de.bmw.carit.jnario.spec.tests;

import static de.bmw.carit.jnario.spec.tests.SpecExecutor.execute;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import org.junit.Test;

public class SpecExecutorTest {
	
	@Test
	public void shouldGenerateAndRunTestCase() {
		assertThat(execute("Example.spec"), is(isSuccessful()));
	}

}

package de.bmw.carit.jnario.spec.tests.util;

import static de.bmw.carit.jnario.tests.util.ClassPathUriProvider.startingFrom;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.experimental.results.PrintableResult;
import org.junit.runner.RunWith;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.SpecInjectorProvider;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.tests.util.ModelStore;

@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
public class SpecExecutorTest {

	@Inject
	private SpecExecutor specExecutor;
	
	@Inject
	private ModelStore modelStore;
	
	@Test
	public void shouldGenerateAndRunTestCase() {
		List<Resource> resources = modelStore.load(startingFrom(this).in("examples").select("Example.spec"));
		
		for (Resource resource : resources) {
			for (SpecFile spec : Iterables.filter(resource.getContents(), SpecFile.class)) {
				List<PrintableResult> results = specExecutor.execute(spec);
				assertThat(results.size(), is(spec.getElements().size()));
				for (PrintableResult result : results) {
					assertThat(result, isSuccessful());
				}
			}
		}
	}

}

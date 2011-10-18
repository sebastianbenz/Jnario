package de.bmw.carit.jnario.tests.parsing;

import static com.google.common.base.Joiner.on;
import static de.bmw.carit.jnario.tests.util.ClassPathUriProvider.startingFrom;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import com.google.inject.Inject;

import de.bmw.carit.jnario.tests.util.ModelStore;
import de.bmw.carit.jnario.tests.util.RuntimeTest;

public class ParseTest extends RuntimeTest{
	
	@Inject
	ModelStore modelStore;
	
	@Test
	public void shouldParseAllModelsWithoutError(){
		List<Resource> resources = modelStore.load(startingFrom(this).in("model").selectAll());
		
		for (Resource resource : resources) {
			assertTrue("Parse error in: " + resource.getURI().lastSegment() + "\n" + on("\n").join(resource.getErrors()), resource.getErrors().isEmpty());
		}
	}
}

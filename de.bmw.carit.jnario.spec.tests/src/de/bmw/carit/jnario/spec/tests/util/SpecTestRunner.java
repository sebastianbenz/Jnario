package de.bmw.carit.jnario.spec.tests.util;

import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Files;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.SpecStandaloneSetup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.tests.util.ClassPathUriProvider;
import de.bmw.carit.jnario.tests.util.IUriProvider;

public class SpecTestRunner extends Runner {

	private static final String MODEL_EXTENSION = "spec";

	private Map<Description, URI> descriptions;

	protected final Class<?> klass;

	protected ResourceSet resourceSet = new XtextResourceSet();
	private Description rootDescription;

	private GlobalStateMemento state;
	
	@Inject
	private SpecExecutor specExecutor;

	public SpecTestRunner(Class<?> klass) {
		super();
		this.klass = klass;
	}

	protected void initializeRegistries() {
		state = GlobalRegistries.makeCopyOfGlobalState();
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration().injectMembers(this);
	}

	@Override
	public Description getDescription() {
		if (rootDescription == null) {
			rootDescription = Description.createSuiteDescription(klass
					.getName());
			rootDescription.getChildren().addAll(testDescriptions());
		}
		return rootDescription;
	}

	private Collection<? extends Description> testDescriptions() {
		if (descriptions == null) {
			descriptions = Maps.newHashMap();
			IUriProvider uris = ClassPathUriProvider.startingFrom(klass).select(
					new Predicate<URI>() {

						public boolean apply(URI uri) {
							return uri.fileExtension().toLowerCase()
									.equals(MODEL_EXTENSION);
						}

					});
			for (URI input : uris.allUris()) {
				descriptions
						.put(Description.createTestDescription(klass,
								stripFileExtension(input.lastSegment())), input);
			}

		}
		return descriptions.keySet();
	}



	private String stripFileExtension(String name) {
		return name.substring(0, name.length() - MODEL_EXTENSION.length() - 1);
	}

	@Override
	public void run(RunNotifier notifier) {
		initializeRegistries();
		try {
			for (Entry<Description, URI> entry : descriptions.entrySet()) {
				Description description = entry.getKey();
				notifier.fireTestStarted(description);
				try {
					run(entry.getValue());
				} catch (Throwable e) {
					notifier.fireTestFailure(new Failure(description, e));
				}
				resourceSet.getResources().clear();
				notifier.fireTestFinished(description);
			}
		} finally {
			state.restoreGlobalState();
		}
	}

	private void run(URI uri) {
		assertThat(specExecutor.run(load(uri)), isSuccessful());
		
	}

	protected SpecFile load(URI input) {
		Resource resource = resourceSet.getResource(input, true);
		return (SpecFile) resource.getContents().get(0);
	}

	protected String toString(URI outputPath) throws IOException {
		return Files.readStreamIntoString(URIConverter.INSTANCE
				.createInputStream(outputPath));
	}

	
}

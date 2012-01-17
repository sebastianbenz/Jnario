/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;

import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Files;
import org.junit.experimental.results.PrintableResult;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

public abstract class BehaviorTestRunner extends Runner {

	private Map<Description, URI> descriptions;

	protected final Class<?> klass;

	protected ResourceSet resourceSet = new XtextResourceSet();
	private Description rootDescription;

	private GlobalStateMemento state;
	
	@Inject
	private BehaviorExecutor behaviorExecutor;

	public BehaviorTestRunner(Class<?> klass) {
		super();
		this.klass = klass;
	}

	protected void initializeRegistries() {
		state = GlobalRegistries.makeCopyOfGlobalState();
		injectMembers();
	}
	
	protected abstract void injectMembers();

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
							return uri.fileExtension().toLowerCase().equals(getModelExtension());
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
		return name.substring(0, name.length() - getModelExtension().length() - 1);
	}

	@Override
	public void run(RunNotifier notifier) {
		initializeRegistries();
		try {
			for (Entry<Description, URI> entry : allDescriptions()) {
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

	public Set<Entry<Description, URI>> allDescriptions() {
		getDescription();
		return descriptions.entrySet();
	}

	private void run(URI uri) {
		EObject object = load(uri);
		if(object != null){
			Result result = behaviorExecutor.run(load(uri));
			PrintableResult printableResult = new PrintableResult(result.getFailures());
			assertThat(printableResult, isSuccessful());
		}
	}

	protected EObject load(URI input) {
		Resource resource = resourceSet.getResource(input, true);
		if(!resource.getContents().isEmpty()){
			return resource.getContents().get(0);
		}
		return null;		
	}

	protected String toString(URI outputPath) throws IOException {
		return Files.readStreamIntoString(URIConverter.INSTANCE
				.createInputStream(outputPath));
	}

	protected abstract String getModelExtension();
}

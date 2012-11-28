/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Assert;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterators;


/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ModelStore implements Iterable<EObject> {

	
	private XtextResourceSet resourceSet = new XtextResourceSet();

	public ModelStore() {
		resourceSet.setClasspathURIContext(getClass());
	}
	
	public Resource load(URI uri) {
		return resourceSet.getResource(uri, true);
	}
	
	public List<Resource> load(IUriProvider uriProvider) {
		for (URI uri : uriProvider.allUris()) {
			resourceSet.getResource(uri, true);
		}
		return resourceSet.getResources();
	}

	public void add(Resource... resources) {
		resourceSet.getResources().addAll(asList(resources));
	}

	public Resource parse(String name, String... lines) {
		Resource resource = createResource(name);
		String inputString = Joiner.on("\n").join(lines);
		StringInputStream inputStream = new StringInputStream(inputString);
		try {
			resource.load(inputStream, emptyMap());
		} catch (IOException ex) {
			ex.printStackTrace();
			Assert.fail(ex.getMessage());
		}
		if(!resource.getErrors().isEmpty()){
			System.err.println(Joiner.on("\n").join(resource.getErrors()));
		}
		return resource;
	}

	private Resource createResource(String name) {
		URI uri = URI.createURI(name);
		Resource resource = resourceSet.getResource(uri, false);
		if (resource != null) {
			resource.unload();
		} else {
			resource = resourceSet.createResource(uri);
		}
		return resource;
	}
	
	public void clear(){
		resourceSet.getResources().clear();
	}

	public Iterator<EObject> iterator() {
		return Iterators.filter(resourceSet.getAllContents(), EObject.class);
	}

	public List<Resource> resources(){
		return resourceSet.getResources();
	}
	
	public static ModelStore create() {
		return new ModelStore();
	}

	public Resource parseScenario(String...strings) {
		return parse("Scenario" + resourceCount() + ".feature", strings);
	}
	
	public Resource parseSpec(String...strings) {
		return parse("Spec" + resourceCount() + ".spec", strings);
	}
	
	public Resource parseScenario(CharSequence input) {
		return parse("Scenario" + resourceCount() + ".feature", input.toString());
	}
	
	public Resource parseXtend(CharSequence input) {
		return parse("Xtend" + resourceCount() + ".xtend", input.toString());
	}
	
	public Resource parseSpec(CharSequence input) {
		return parse("Spec" + resourceCount() + ".spec", input.toString());
	}

	private int resourceCount() {
		return resourceSet.getResources().size();
	}
	
	public Resource parseSuite(CharSequence input) {
		return parse("Suite" + resourceCount() + ".suite", input.toString());
	}
	
	public Query query(){
		return Query.query(this);
	}
	
	public Suite firstSuite(){
		return query().first(Suite.class);
	}
	
	public <T> T first(Class<? extends T> type){
		return query().first(type);
	}
	
	public <T> T second(Class<? extends T> type){
		return query().second(type);
	}
	
	public ExampleGroup exampleGroup(String name){
		Iterable<ExampleGroup> exampleGroups = query().all(ExampleGroup.class);
		ExampleNameProvider nameProvider = new ExampleNameProvider();
		for (ExampleGroup exampleGroup : exampleGroups) {
			if(name.equals(nameProvider.describe(exampleGroup))){
				return exampleGroup;
			}
		}
		throw new NoSuchElementException();
	}
	
	public Example example(String name){
		Iterable<Example> exampleGroups = query().all(Example.class);
		for (Example exampleGroup : exampleGroups) {
			if(name.equals(exampleGroup.getName())){
				return exampleGroup;
			}
		}
		throw new NoSuchElementException();
	}
	
	public Feature feature(){
		return first(Feature.class);
	}
	
	@SuppressWarnings("restriction")
	public Scenario scenario(String name){
		Iterable<Scenario> scenarios = query().all(Scenario.class);
		for (Scenario scenario : scenarios) {
			if(name.equals(scenario.getName().trim())){
				return scenario;
			}
		}
		throw new NoSuchElementException();
	}
	
	public Step step(String name){
		Iterable<Step> steps = query().all(Step.class);
		StepNameProvider nameProvider = new StepNameProvider();
		for (Step step : steps) {
			if(name.equals(nameProvider.nameOf(step))){
				return step;
			}
		}
		throw new NoSuchElementException();
	}
	
	public Suite suite(String name){
		Iterable<Suite> suites = query().all(Suite.class);
		SuiteClassNameProvider nameProvider = new SuiteClassNameProvider(null, null);
		for (Suite suite : suites) {
			if(name.equals(nameProvider.describe(suite))){
				return suite;
			}
		}
		throw new NoSuchElementException();
	}
	
	public ExampleGroup firstSpec(){
		return query().first(ExampleGroup.class);
	}
	
	public Scenario firstScenario(){
		return query().first(Scenario.class);
	}
	
	public XtextResourceSet getResourceSet() {
		return resourceSet;
	}

}
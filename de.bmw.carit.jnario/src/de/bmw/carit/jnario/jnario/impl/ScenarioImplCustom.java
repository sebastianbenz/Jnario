package de.bmw.carit.jnario.jnario.impl;

import static com.google.common.collect.Iterators.filter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xtend2.xtend2.Xtend2Factory;
import org.eclipse.xtext.xtend2.xtend2.XtendField;

import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Step;

public class ScenarioImplCustom extends ScenarioImpl {
	
	private static String IDENTIFIER_PATTERN = "<([a-zA-Z0-9_]+)>";
	
	@Override
	public EList<XtendField> getFields() {
		if (fields == null)
		{
			fields = new EObjectContainmentEList<XtendField>(XtendField.class, this, JnarioPackage.SCENARIO__FIELDS);
			generateFields();
		}
		return fields;
	}
	
	private void generateFields(){
		Iterator<Step> steps = filter(this.eAllContents(), Step.class);
		Set<String> fieldNames = retrieveFieldsFromSteps(steps);
		Feature feature = EcoreUtil2.getContainerOfType(this, Feature.class);
		Set<String> backgroundFields = retrieveFieldsFromBackground(feature);
		fieldNames.addAll(backgroundFields);		
		addFields(fieldNames);
	}

	private Set<String> retrieveFieldsFromSteps(Iterator<Step> steps){
		Pattern pattern = Pattern.compile(IDENTIFIER_PATTERN);
		Set<String> fieldNames = new HashSet<String>();
		while(steps.hasNext()){
			Step step = steps.next();
			if(step.getName() != null){
				Matcher m = pattern.matcher(step.getName());
				while (m.find()) {
					fieldNames.add(m.group(1));
				} 
			}
		}
		return fieldNames;
	}
	
	private Set<String> retrieveFieldsFromBackground(Feature feature){
		if(feature.getBackground() != null){
			return retrieveFieldsFromSteps(feature.getBackground().getSteps().iterator());
		}
		return new HashSet<String>();
	}

	private void addFields(Set<String> fieldNames){
		EList<XtendField> listOfFields = this.getFields();
		for(String name: fieldNames){
			XtendField xtendField = Xtend2Factory.eINSTANCE.createXtendField();
			xtendField.setName(name);
			listOfFields.add(xtendField);
		}
	}
}

package de.bmw.carit.jnario.tests.unit.impl

import com.google.inject.Inject
import de.bmw.carit.jnario.jnario.Scenario
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import java.util.ArrayList

import static com.google.common.collect.Iterators.*

import static extension de.bmw.carit.jnario.lib.Should.*

@InstantiateWith(typeof(SpecTestInstantiator))
describe "ScenarioImplCustom"{
	
	@Inject
	ModelStore modelStore
	
	String jnarioFile = '
		Feature: FieldTest
				Scenario: A scenario with fields
	'
	
	it "should retrieve fields from steps that are within <>"{
		val fieldName = "someFieldName"
		val jnarioFileWithFields = jnarioFile + '
			Given a <' + fieldName + '>
				var x = 3
		'
		val scenario = parseFileAndRetrieveScenario(jnarioFileWithFields)
		scenario.fields.size.should.be(1)
		scenario.fields.get(0).name.should.be(fieldName)
	}
	
	it "should ignore fields from not found referenced steps"{
		val jnarioFileWithFields = jnarioFile + '
			Given a <something>
		'
		val scenario = parseFileAndRetrieveScenario(jnarioFileWithFields)
		scenario.fields.size.should.be(0)
	}
	
	it "should find multiple fields"{
		val jnarioFileWithFields = jnarioFile + '
			Given a <someVariable>
				someVariable = 1
			When I add <someOtherVariable>
				sum = someVariable + someOtherVariable
		'
		val scenario = parseFileAndRetrieveScenario(jnarioFileWithFields)
		scenario.fields.size.should.be(2)
		scenario.fieldNames.should.contain("someVariable","someOtherVariable")
	}
	
	it "should contain a duplicate field only once"{
		val jnarioFileWithFields = jnarioFile + '
			Given a <someVariable>
				someVariable = 1
			When I use <someVariable>
				someVariable = someVariable + 1
		'
		val scenario = parseFileAndRetrieveScenario(jnarioFileWithFields)
		scenario.fields.size.should.be(1)
	}
	
	it "should find fields defined in background steps"{
		val jnarioFileWithFields = '
			Feature: Some Feature
				Background:
					Given <someVariable>
						someVariable = 1
					Scenario: Some Scenario
						When I get <anotherVariable>
							anotherVariable = someVariable - 1
		'
		val scenario = parseFileAndRetrieveScenario(jnarioFileWithFields)
		scenario.fields.size.should.be(2)
		scenario.fieldNames.should.contain("someVariable","anotherVariable")
	}
	
	def parseFileAndRetrieveScenario(String jnarioFileWithFields){
		val resource = modelStore.parseScenario(jnarioFileWithFields)
		val scenarios = filter(resource.allContents, typeof(Scenario))
		scenarios.next
	}
	
	def fieldNames(Scenario scenario){
		val names = new ArrayList<String>()
		for(field: scenario.fields){
			names.add(field.name)
		}
		return names
	}
}
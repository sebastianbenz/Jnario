package org.jnario.report

import java.io.InputStream
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.helpers.DefaultHandler
import org.xml.sax.Attributes
import org.xml.sax.SAXException
import java.util.List

class SpecResultParser extends DefaultHandler{
	double currentExecutionTime
	String currentClassName
	String currentName
	
	SpecExecutionAcceptor acceptor
	
	String currentFailureType
	String currentFailureMessage
	String currentFailureStacktrace
	
	List<SpecFailure> failures
	
	def parse(InputStream stream, SpecExecutionAcceptor acceptor){
		this.acceptor = acceptor
		val factory = SAXParserFactory::newInstance
		val saxParser = factory.newSAXParser();
		saxParser.parse(stream, this)
	}
	
	override startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName){
			case SpecResultTags::NODE_TESTCASE:{
				currentClassName = attributes.getValue(SpecResultTags::ATTR_CLASSNAME)
				currentName = attributes.getValue(SpecResultTags::ATTR_NAME)
				currentExecutionTime = attributes.readTime
				failures = newArrayList
			}		
			case SpecResultTags::NODE_ERROR: {
				saveFailureAttributes(attributes)
			}
			case SpecResultTags::NODE_FAILURE: {
				saveFailureAttributes(attributes)
			}
		}
	}
	
	def saveFailureAttributes(Attributes attributes){
		currentFailureMessage = attributes.getValue(SpecResultTags::ATTR_MESSAGE)
				currentFailureType = attributes.getValue(SpecResultTags::ATTR_TYPE)
	}
	
	override endElement(String uri, String localName, String qName) throws SAXException {
		switch(qName){
			case SpecResultTags::NODE_TESTCASE:{
				acceptor.accept(newSpecExecution())
				currentClassName = null
				currentName = null
				currentExecutionTime = 0.0
			}	
			case SpecResultTags::NODE_ERROR: {
				addFailure
			}
			case SpecResultTags::NODE_FAILURE: {
				addFailure
			}
		}
	}
	
	def addFailure(){
		failures += new SpecFailure(
			currentFailureMessage,
			currentFailureType,
			currentFailureStacktrace
		)
		currentFailureMessage = null
		currentFailureType = null
		currentFailureStacktrace = null
	}
	
	
	override characters(char[] ch, int start, int length) throws SAXException {
		currentFailureStacktrace = String::valueOf(ch, start, length)
	}
	
	def SpecExecution newSpecExecution() {
		if(failures.empty){
			new Passed(currentClassName, currentName, currentExecutionTime)
		}else{
			new Failed(currentClassName, currentName, currentExecutionTime, failures)
		}
	}
	
	def private readTime(Attributes attributes) {
		val timeString= attributes.getValue(SpecResultTags::ATTR_TIME);
		if (timeString != null) {
			try {
				return Double::parseDouble(timeString)
			} catch (NumberFormatException e) {
			}
		}
		return 0.0
	}
	
}
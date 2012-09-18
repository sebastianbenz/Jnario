package org.jnario.report

import java.io.InputStream
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.helpers.DefaultHandler
import org.xml.sax.Attributes
import org.xml.sax.SAXException

class SpecResultParser extends DefaultHandler{
	
	SpecExecutionAcceptor acceptor
	SpecExecution currentExecution
	
	String currentFailureType
	String currentFailureMessage
	String currentFailureStacktrace
		
	def parse(InputStream stream, SpecExecutionAcceptor acceptor){
		this.acceptor = acceptor
		val factory = SAXParserFactory::newInstance
		val saxParser = factory.newSAXParser();
		saxParser.parse(stream, this)
	}
	
	override startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName){
			case SpecResultTags::NODE_TESTCASE:{
				acceptor.accept(newSpecExecution(attributes))
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
			case SpecResultTags::NODE_ERROR: {
				addFailure
			}
			case SpecResultTags::NODE_FAILURE: {
				addFailure
			}
		}
	}
	
	def addFailure(){
		currentExecution.failures += new SpecFailure(
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
	
	def SpecExecution newSpecExecution(Attributes attributes) {
		currentExecution = new SpecExecution(
			attributes.getValue(SpecResultTags::ATTR_CLASSNAME),
			attributes.getValue(SpecResultTags::ATTR_NAME),
			attributes.readTime, newArrayList
		)
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
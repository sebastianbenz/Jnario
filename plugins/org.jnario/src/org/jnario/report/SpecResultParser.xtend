package org.jnario.report

import java.io.InputStream
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.helpers.DefaultHandler
import org.xml.sax.Attributes
import org.xml.sax.SAXException
import java.util.List
import static extension org.apache.commons.lang.StringEscapeUtils.*

class SpecResultParser extends DefaultHandler{
	double currentExecutionTime
	String currentClassName
	String currentName
	
	SpecExecutionAcceptor acceptor

	String currentFailureType
	StringBuilder currentFailureStacktrace = new StringBuilder
	
	boolean isPending = false
	
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
				currentClassName = attributes.convertValue(SpecResultTags::ATTR_CLASSNAME)
				currentName = attributes.convertValue(SpecResultTags::ATTR_NAME)
				currentExecutionTime = attributes.readTime
				failures = newArrayList
			}		
			case SpecResultTags::NODE_ERROR: {
				saveFailureAttributes(attributes)
			}
			case SpecResultTags::NODE_FAILURE: {
				saveFailureAttributes(attributes)
				currentFailureStacktrace = new StringBuilder
			}
			case SpecResultTags::NODE_SKIPPED: {
				isPending = true
			}
		}
	}
	
	def saveFailureAttributes(Attributes attributes){
		currentFailureType = attributes.convertValue(SpecResultTags::ATTR_TYPE)
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
		val stacktrace = currentFailureStacktrace.toString
		val errorMessage = extractMessage(stacktrace)
		failures += new SpecFailure(
			errorMessage.key,
			currentFailureType,
			errorMessage.value
		)
		currentFailureType = null
		currentFailureStacktrace = new StringBuilder
	}
	
	def private extractMessage(String messageAndStacktrace){
		val end = messageAndStacktrace.indexOf("	at ")
		var message = ""
		var stacktrace = ""
		if(end > -1){
			message = messageAndStacktrace.substring(0, end-1) 
			stacktrace = messageAndStacktrace.substring(end, messageAndStacktrace.length)
		}
		message = message.trim.cleanUp
		message -> stacktrace.cleanUp
	}
	
	def private cleanUp(String s){
		s.replaceAll("\n\t", "\n")
	}
	
	override characters(char[] ch, int start, int length) throws SAXException {
		currentFailureStacktrace.append(String::valueOf(ch, start, length))
	}

	def newSpecExecution() {
		if(isPending){
			new Pending(currentClassName, currentName, currentExecutionTime)
		}else if(failures.empty){
			new Passed(currentClassName, currentName, currentExecutionTime)
		}else{
			new Failed(currentClassName, currentName, currentExecutionTime, failures)
		}
	}
	
	def private readTime(Attributes attributes) {
		val timeString= attributes.convertValue(SpecResultTags::ATTR_TIME);
		if (timeString != null) {
			try {
				return Double::parseDouble(timeString)
			} catch (NumberFormatException e) {
			}
		}
		return 0.0
	}
	
	def convertValue(Attributes attributes, String key) {
		attributes.getValue(key)
	}
	
}
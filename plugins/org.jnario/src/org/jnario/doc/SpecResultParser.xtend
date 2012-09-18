package org.jnario.doc

import java.io.InputStream
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.helpers.DefaultHandler
import org.xml.sax.Attributes
import org.xml.sax.SAXException

class SpecResultParser extends DefaultHandler{
	
	ParseResultAcceptor acceptor
		
	def parse(InputStream stream, ParseResultAcceptor acceptor){
		this.acceptor = acceptor
		val factory = SAXParserFactory::newInstance
		val saxParser = factory.newSAXParser();
		saxParser.parse(stream, this)
	}
	
	override startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName){
			case SpecResultTags::NODE_TESTCASE:{
				acceptor.accept(new SpecExecution(
					attributes.getValue(SpecResultTags::ATTR_CLASSNAME),
					attributes.getValue(SpecResultTags::ATTR_NAME),
					attributes.readTime, <Failure>emptyList))
			}		
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
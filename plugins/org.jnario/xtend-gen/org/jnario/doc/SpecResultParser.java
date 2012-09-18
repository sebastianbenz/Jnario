package org.jnario.doc;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.doc.Failure;
import org.jnario.doc.ParseResultAcceptor;
import org.jnario.doc.SpecExecution;
import org.jnario.doc.SpecResultTags;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("all")
public class SpecResultParser extends DefaultHandler {
  private ParseResultAcceptor acceptor;
  
  public void parse(final InputStream stream, final ParseResultAcceptor acceptor) {
    try {
      this.acceptor = acceptor;
      final SAXParserFactory factory = SAXParserFactory.newInstance();
      final SAXParser saxParser = factory.newSAXParser();
      saxParser.parse(stream, this);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_TESTCASE)) {
        _matched=true;
        String _value = attributes.getValue(SpecResultTags.ATTR_CLASSNAME);
        String _value_1 = attributes.getValue(SpecResultTags.ATTR_NAME);
        double _readTime = this.readTime(attributes);
        List<Failure> _emptyList = CollectionLiterals.<Failure>emptyList();
        SpecExecution _specExecution = new SpecExecution(_value, _value_1, _readTime, _emptyList);
        this.acceptor.accept(_specExecution);
      }
    }
  }
  
  private double readTime(final Attributes attributes) {
    final String timeString = attributes.getValue(SpecResultTags.ATTR_TIME);
    boolean _notEquals = (!Objects.equal(timeString, null));
    if (_notEquals) {
      try {
        return Double.parseDouble(timeString);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return 0.0;
  }
}

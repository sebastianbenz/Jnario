package org.jnario.report;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultTags;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("all")
public class SpecResultParser extends DefaultHandler {
  private SpecExecutionAcceptor acceptor;
  
  private SpecExecution currentExecution;
  
  private String currentFailureType;
  
  private String currentFailureMessage;
  
  private String currentFailureStacktrace;
  
  public void parse(final InputStream stream, final SpecExecutionAcceptor acceptor) {
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
        SpecExecution _newSpecExecution = this.newSpecExecution(attributes);
        this.acceptor.accept(_newSpecExecution);
      }
    }
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_ERROR)) {
        _matched=true;
        this.saveFailureAttributes(attributes);
      }
    }
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_FAILURE)) {
        _matched=true;
        this.saveFailureAttributes(attributes);
      }
    }
  }
  
  public String saveFailureAttributes(final Attributes attributes) {
    String _xblockexpression = null;
    {
      String _value = attributes.getValue(SpecResultTags.ATTR_MESSAGE);
      this.currentFailureMessage = _value;
      String _value_1 = attributes.getValue(SpecResultTags.ATTR_TYPE);
      String _currentFailureType = this.currentFailureType = _value_1;
      _xblockexpression = (_currentFailureType);
    }
    return _xblockexpression;
  }
  
  public void endElement(final String uri, final String localName, final String qName) throws SAXException {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_ERROR)) {
        _matched=true;
        this.addFailure();
      }
    }
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_FAILURE)) {
        _matched=true;
        this.addFailure();
      }
    }
  }
  
  public String addFailure() {
    String _xblockexpression = null;
    {
      List<SpecFailure> _failures = this.currentExecution.getFailures();
      SpecFailure _specFailure = new SpecFailure(
        this.currentFailureMessage, 
        this.currentFailureType, 
        this.currentFailureStacktrace);
      _failures.add(_specFailure);
      this.currentFailureMessage = null;
      this.currentFailureType = null;
      String _currentFailureStacktrace = this.currentFailureStacktrace = null;
      _xblockexpression = (_currentFailureStacktrace);
    }
    return _xblockexpression;
  }
  
  public void characters(final char[] ch, final int start, final int length) throws SAXException {
    String _valueOf = String.valueOf(ch, start, length);
    this.currentFailureStacktrace = _valueOf;
  }
  
  public SpecExecution newSpecExecution(final Attributes attributes) {
    String _value = attributes.getValue(SpecResultTags.ATTR_CLASSNAME);
    String _value_1 = attributes.getValue(SpecResultTags.ATTR_NAME);
    double _readTime = this.readTime(attributes);
    ArrayList<SpecFailure> _newArrayList = CollectionLiterals.<SpecFailure>newArrayList();
    SpecExecution _specExecution = new SpecExecution(_value, _value_1, _readTime, _newArrayList);
    SpecExecution _currentExecution = this.currentExecution = _specExecution;
    return _currentExecution;
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

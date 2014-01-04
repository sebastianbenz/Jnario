package org.jnario.report;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultTags;
import org.jnario.util.Strings;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("all")
public class SpecResultParser extends DefaultHandler {
  private double currentExecutionTime;
  
  private String currentClassName;
  
  private String currentName;
  
  private SpecExecutionAcceptor acceptor;
  
  private String currentFailureType;
  
  private StringBuilder currentFailureStacktrace = new Function0<StringBuilder>() {
    public StringBuilder apply() {
      StringBuilder _stringBuilder = new StringBuilder();
      return _stringBuilder;
    }
  }.apply();
  
  private boolean isPending = false;
  
  private List<SpecFailure> failures;
  
  public void parse(final InputStream stream, final SpecExecutionAcceptor acceptor) {
    try {
      this.acceptor = acceptor;
      final SAXParserFactory factory = SAXParserFactory.newInstance();
      final SAXParser saxParser = factory.newSAXParser();
      saxParser.parse(stream, this);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_TESTCASE)) {
        _matched=true;
        String _convertValue = this.convertValue(attributes, SpecResultTags.ATTR_CLASSNAME);
        this.currentClassName = _convertValue;
        String _convertValue_1 = this.convertValue(attributes, SpecResultTags.ATTR_NAME);
        this.currentName = _convertValue_1;
        double _readTime = this.readTime(attributes);
        this.currentExecutionTime = _readTime;
        ArrayList<SpecFailure> _newArrayList = CollectionLiterals.<SpecFailure>newArrayList();
        this.failures = _newArrayList;
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
        StringBuilder _stringBuilder = new StringBuilder();
        this.currentFailureStacktrace = _stringBuilder;
      }
    }
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_SKIPPED)) {
        _matched=true;
        this.isPending = true;
      }
    }
  }
  
  public String saveFailureAttributes(final Attributes attributes) {
    String _convertValue = this.convertValue(attributes, SpecResultTags.ATTR_TYPE);
    String _currentFailureType = this.currentFailureType = _convertValue;
    return _currentFailureType;
  }
  
  public void endElement(final String uri, final String localName, final String qName) throws SAXException {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(qName,SpecResultTags.NODE_TESTCASE)) {
        _matched=true;
        SpecExecution _newSpecExecution = this.newSpecExecution();
        this.acceptor.accept(_newSpecExecution);
        this.currentClassName = null;
        this.currentName = null;
        this.currentExecutionTime = 0.0;
      }
    }
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
  
  public StringBuilder addFailure() {
    StringBuilder _xblockexpression = null;
    {
      final String stacktrace = this.currentFailureStacktrace.toString();
      final Pair<String,String> errorMessage = this.extractMessage(stacktrace);
      String _key = errorMessage.getKey();
      String _value = errorMessage.getValue();
      SpecFailure _specFailure = new SpecFailure(_key, 
        this.currentFailureType, _value);
      this.failures.add(_specFailure);
      this.currentFailureType = null;
      StringBuilder _stringBuilder = new StringBuilder();
      StringBuilder _currentFailureStacktrace = this.currentFailureStacktrace = _stringBuilder;
      _xblockexpression = (_currentFailureStacktrace);
    }
    return _xblockexpression;
  }
  
  private Pair<String,String> extractMessage(final String messageAndStacktrace) {
    Pair<String,String> _xblockexpression = null;
    {
      final int end = messageAndStacktrace.indexOf("\tat ");
      String message = "";
      String stacktrace = "";
      if ((end > (-1))) {
        String _substring = messageAndStacktrace.substring(0, (end - 1));
        message = _substring;
        int _length = messageAndStacktrace.length();
        String _substring_1 = messageAndStacktrace.substring(end, _length);
        stacktrace = _substring_1;
      }
      String _trim = message.trim();
      String _cleanUp = this.cleanUp(_trim);
      message = _cleanUp;
      String _cleanUp_1 = this.cleanUp(stacktrace);
      Pair<String,String> _mappedTo = Pair.<String, String>of(message, _cleanUp_1);
      _xblockexpression = (_mappedTo);
    }
    return _xblockexpression;
  }
  
  private String cleanUp(final String s) {
    String _replaceAll = s.replaceAll("\n\t", "\n");
    return _replaceAll;
  }
  
  public void characters(final char[] ch, final int start, final int length) throws SAXException {
    String _valueOf = String.valueOf(ch, start, length);
    this.currentFailureStacktrace.append(_valueOf);
  }
  
  public SpecExecution newSpecExecution() {
    SpecExecution _xifexpression = null;
    if (this.isPending) {
      Pending _pending = new Pending(this.currentClassName, this.currentName, this.currentExecutionTime);
      _xifexpression = _pending;
    } else {
      SpecExecution _xifexpression_1 = null;
      boolean _isEmpty = this.failures.isEmpty();
      if (_isEmpty) {
        Passed _passed = new Passed(this.currentClassName, this.currentName, this.currentExecutionTime);
        _xifexpression_1 = _passed;
      } else {
        Failed _failed = new Failed(this.currentClassName, this.currentName, this.currentExecutionTime, this.failures);
        _xifexpression_1 = _failed;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private double readTime(final Attributes attributes) {
    final String timeString = this.convertValue(attributes, SpecResultTags.ATTR_TIME);
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
  
  public String convertValue(final Attributes attributes, final String key) {
    String _value = attributes.getValue(key);
    String _convertFromJavaString = Strings.convertFromJavaString(_value, true);
    return _convertFromJavaString;
  }
}

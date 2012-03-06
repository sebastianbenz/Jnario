package org.jnario.spec.tests.unit.parsing;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.ClassPathUriProviderBuilder;
import org.jnario.jnario.test.util.IUriProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Resources;
import org.jnario.spec.SpecInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
public class ParserTest {
  @Inject
  private ModelStore _modelStore;
  
  @Test
  public void shouldParseAllFilesWithoutParseError() {
    ClassPathUriProviderBuilder _startingFrom = ClassPathUriProviderBuilder.startingFrom(ParserTest.class);
    final Function1<URI,Boolean> _function = new Function1<URI,Boolean>() {
        public Boolean apply(final URI it) {
          boolean _onlySpecFiles = ParserTest.this.onlySpecFiles(it);
          return _onlySpecFiles;
        }
      };
    IUriProvider _select = _startingFrom.select(new Predicate<URI>() {
        public boolean apply(URI arg0) {
          return _function.apply(arg0);
        }
    });
    this._modelStore.load(_select);
    List<Resource> _resources = this._modelStore.resources();
    final Function1<Resource,Boolean> _function_1 = new Function1<Resource,Boolean>() {
        public Boolean apply(final Resource it) {
          URI _uRI = it.getURI();
          boolean _onlySpecFiles = ParserTest.this.onlySpecFiles(_uRI);
          return Boolean.valueOf(_onlySpecFiles);
        }
      };
    Iterable<Resource> _filter = IterableExtensions.<Resource>filter(_resources, _function_1);
    ArrayList<Resource> _newArrayList = Lists.<Resource>newArrayList(_filter);
    final ArrayList<Resource> specs = _newArrayList;
    final Procedure1<Resource> _function_2 = new Procedure1<Resource>() {
        public void apply(final Resource resource) {
          Resources.checkForParseErrors(resource);
        }
      };
    IterableExtensions.<Resource>forEach(specs, _function_2);
  }
  
  public boolean onlySpecFiles(final URI uri) {
    boolean _and = false;
    String _fileExtension = uri.fileExtension();
    boolean _notEquals = ObjectExtensions.operator_notEquals(_fileExtension, null);
    if (!_notEquals) {
      _and = false;
    } else {
      String _fileExtension_1 = uri.fileExtension();
      boolean _equals = _fileExtension_1.equals("spec");
      _and = BooleanExtensions.operator_and(_notEquals, _equals);
    }
    return _and;
  }
  
  public String errorMessage(final Iterable<Issue> issues) {
    StringBuilder _stringBuilder = new StringBuilder();
    final StringBuilder result = _stringBuilder;
    for (final Issue issue : issues) {
      {
        StringBuilder _createIssueMessage = this.createIssueMessage(issue);
        final StringBuilder issueBuilder = _createIssueMessage;
        result.append(issueBuilder);
      }
    }
    String _string = result.toString();
    return _string;
  }
  
  public StringBuilder createIssueMessage(final Issue issue) {
    URI _uriToProblem = issue.getUriToProblem();
    URI _trimFragment = _uriToProblem.trimFragment();
    final URI resourceUri = _trimFragment;
    StringBuilder _stringBuilder = new StringBuilder("\n");
    final StringBuilder issueBuilder = _stringBuilder;
    Severity _severity = issue.getSeverity();
    StringBuilder _append = issueBuilder.append(_severity);
    _append.append(": \t");
    String _lastSegment = resourceUri.lastSegment();
    StringBuilder _append_1 = issueBuilder.append(_lastSegment);
    _append_1.append(" - ");
    boolean _isFile = resourceUri.isFile();
    if (_isFile) {
      String _fileString = resourceUri.toFileString();
      issueBuilder.append(_fileString);
    }
    StringBuilder _append_2 = issueBuilder.append("\n");
    Integer _lineNumber = issue.getLineNumber();
    StringBuilder _append_3 = _append_2.append(_lineNumber);
    StringBuilder _append_4 = _append_3.append(": ");
    String _message = issue.getMessage();
    _append_4.append(_message);
    return issueBuilder;
  }
}

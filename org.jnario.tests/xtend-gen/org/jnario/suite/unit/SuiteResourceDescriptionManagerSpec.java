package org.jnario.suite.unit;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.hamcrest.Matcher;
import org.jnario.Specification;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestInstantiator;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.jnario.suite.resource.SuiteResourceDescriptionManager;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.unit.SuiteResourceDescriptionManagerNoPatternSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;

@Contains(SuiteResourceDescriptionManagerNoPatternSpec.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteResourceDescriptionManager")
@InstantiateWith(value = SuiteTestInstantiator.class)
public class SuiteResourceDescriptionManagerSpec {
  @Subject
  public SuiteResourceDescriptionManager subject;
  
  @Inject
  @Extension
  public ModelStore m;
  
  Resource spec;
  
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"MySpec\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    Resource _parseSpec = this.m.parseSpec(_builder);
    this.spec = _parseSpec;
  }
  
  public Matcher<Resource> affected() {
    final Function1<Resource,Boolean> _function = new Function1<Resource,Boolean>() {
        public Boolean apply(final Resource suite) {
          boolean _xblockexpression = false;
          {
            TreeIterator<EObject> _allContents = suite.getAllContents();
            Iterator<SpecReference> _filter = Iterators.<SpecReference>filter(_allContents, SpecReference.class);
            final SpecReference ref = IteratorExtensions.<SpecReference>head(_filter);
            Specification _spec = ref.getSpec();
            boolean _eIsProxy = _spec.eIsProxy();
            boolean _not = (!_eIsProxy);
            Assert.assertTrue("\nExpected !ref.spec.eIsProxy but"
             + "\n     ref.spec.eIsProxy is " + _eIsProxy
             + "\n     ref.spec is " + _spec
             + "\n     ref is " + ref + "\n", _not);
            
            final IResourceDescription newDescription = SuiteResourceDescriptionManagerSpec.this.subject.getResourceDescription(SuiteResourceDescriptionManagerSpec.this.spec);
            final IResourceDescription candidate = SuiteResourceDescriptionManagerSpec.this.subject.getResourceDescription(suite);
            final Delta delta = SuiteResourceDescriptionManagerSpec.this.subject.createDelta(null, newDescription);
            boolean _isAffected = SuiteResourceDescriptionManagerSpec.this.subject.isAffected(delta, candidate);
            _xblockexpression = (_isAffected);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
    Matcher<Resource> _matches = Should.<Resource>matches("affected", _function);
    return _matches;
  }
}

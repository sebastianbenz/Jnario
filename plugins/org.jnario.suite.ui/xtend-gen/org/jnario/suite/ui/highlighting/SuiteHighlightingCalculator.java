/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.highlighting;

import java.util.Arrays;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;
import org.jnario.suite.ui.highlighting.SuiteHighlightingConfiguration;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class SuiteHighlightingCalculator extends XbaseHighlightingCalculator {
  public void searchAndHighlightElements(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject it) {
          SuiteHighlightingCalculator.this.highlight(it, acceptor);
        }
      };
    IteratorExtensions.<EObject>forEach(_allContents, _function);
  }
  
  protected void _highlight(final SpecReference ref, final IHighlightedPositionAcceptor acceptor) {
    EReference _specReference_Spec = SuitePackage.eINSTANCE.getSpecReference_Spec();
    this.highlightObjectAtFeature(acceptor, ref, _specReference_Spec, SuiteHighlightingConfiguration.LINK_ID);
  }
  
  protected void _highlight(final PatternReference ref, final IHighlightedPositionAcceptor acceptor) {
    EAttribute _patternReference_Pattern = SuitePackage.eINSTANCE.getPatternReference_Pattern();
    this.highlightObjectAtFeature(acceptor, ref, _patternReference_Pattern, SuiteHighlightingConfiguration.PATTERN_ID);
  }
  
  protected void _highlight(final Suite suite, final IHighlightedPositionAcceptor acceptor) {
    final ICompositeNode node = NodeModelUtils.getNode(suite);
    String _name = suite.getName();
    int lineEnd = Strings.indexOfNewLine(_name);
    int _minus = (-1);
    boolean _equals = (lineEnd == _minus);
    if (_equals) {
      String _name_1 = suite.getName();
      int _length = _name_1.length();
      lineEnd = _length;
    }
    int _offset = node.getOffset();
    acceptor.addPosition(_offset, lineEnd, SuiteHighlightingConfiguration.SUITE_ID);
  }
  
  protected void _highlight(final EObject ref, final IHighlightedPositionAcceptor acceptor) {
  }
  
  public void highlight(final EObject suite, final IHighlightedPositionAcceptor acceptor) {
    if (suite instanceof Suite) {
      _highlight((Suite)suite, acceptor);
      return;
    } else if (suite instanceof PatternReference) {
      _highlight((PatternReference)suite, acceptor);
      return;
    } else if (suite instanceof SpecReference) {
      _highlight((SpecReference)suite, acceptor);
      return;
    } else if (suite != null) {
      _highlight(suite, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite, acceptor).toString());
    }
  }
}

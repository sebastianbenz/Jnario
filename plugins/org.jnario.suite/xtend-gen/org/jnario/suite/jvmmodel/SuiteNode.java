/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.Specification;
import org.jnario.suite.suite.Suite;

@Data
@SuppressWarnings("all")
public class SuiteNode {
  private final Suite _suite;
  
  public Suite getSuite() {
    return this._suite;
  }
  
  private final List<SuiteNode> _children = CollectionLiterals.<SuiteNode>newArrayList();
  
  public List<SuiteNode> getChildren() {
    return this._children;
  }
  
  private final Iterable<Specification> _specs;
  
  public Iterable<Specification> getSpecs() {
    return this._specs;
  }
  
  public void setParent(final SuiteNode parent) {
    boolean _equals = Objects.equal(parent, null);
    if (_equals) {
      return;
    }
    List<SuiteNode> _children = parent.getChildren();
    _children.add(this);
  }
  
  public SuiteNode(final Suite suite, final Iterable<Specification> specs) {
    super();
    this._suite = suite;
    this._specs = specs;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_suite== null) ? 0 : _suite.hashCode());
    result = prime * result + ((_children== null) ? 0 : _children.hashCode());
    result = prime * result + ((_specs== null) ? 0 : _specs.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SuiteNode other = (SuiteNode) obj;
    if (_suite == null) {
      if (other._suite != null)
        return false;
    } else if (!_suite.equals(other._suite))
      return false;
    if (_children == null) {
      if (other._children != null)
        return false;
    } else if (!_children.equals(other._children))
      return false;
    if (_specs == null) {
      if (other._specs != null)
        return false;
    } else if (!_specs.equals(other._specs))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

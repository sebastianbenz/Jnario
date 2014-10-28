/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameBackgroundSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameFeatureSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureClassNameProviderGetClassNameFeatureSpec.class, FeatureClassNameProviderGetClassNameBackgroundSpec.class })
@CreateWith(SpecTestCreator.class)
@Named("FeatureClassNameProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureClassNameProviderSpec {
  @Subject
  public FeatureClassNameProvider subject;
  
  static FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  public String className(final EObject obj) {
    return this.subject.toJavaClassName(obj);
  }
  
  public Background background(final String backgroundName, final String featureName) {
    final Background result = FeatureClassNameProviderSpec.factory.createBackground();
    result.setName(("Background: " + backgroundName));
    final Feature feature = Features.feature(featureName);
    EList<XtendMember> _members = feature.getMembers();
    _members.add(result);
    return result;
  }
}

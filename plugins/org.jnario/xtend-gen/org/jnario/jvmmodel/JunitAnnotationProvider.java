/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.FeatureRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JunitAnnotationProvider {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public JvmAnnotationReference getExampleGroupRunnerAnnotation(final EObject context) {
    return this._extendedJvmTypesBuilder.toAnnotation(context, RunWith.class, ExampleGroupRunner.class);
  }
  
  public JvmAnnotationReference getFeatureRunner(final EObject context) {
    return this._extendedJvmTypesBuilder.toAnnotation(context, RunWith.class, FeatureRunner.class);
  }
  
  public ArrayList<JvmAnnotationReference> getTestAnnotations(final EObject context, final boolean isPending) {
    final ArrayList<JvmAnnotationReference> annotations = CollectionLiterals.<JvmAnnotationReference>newArrayList();
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, Test.class);
    annotations.add(_annotation);
    if (isPending) {
      JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(context, Ignore.class);
      annotations.add(_annotation_1);
    }
    return annotations;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context, final boolean isBeforeAll) {
    JvmAnnotationReference _xifexpression = null;
    if (isBeforeAll) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, BeforeClass.class);
      _xifexpression = _annotation;
    } else {
      JvmAnnotationReference _beforeAnnotation = this.getBeforeAnnotation(context);
      _xifexpression = _beforeAnnotation;
    }
    return _xifexpression;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context) {
    return this._extendedJvmTypesBuilder.toAnnotation(context, Before.class);
  }
  
  public JvmAnnotationReference getAfterAnnotation(final EObject context, final boolean isAfterAll) {
    if (isAfterAll) {
      return this._extendedJvmTypesBuilder.toAnnotation(context, AfterClass.class);
    } else {
      return this._extendedJvmTypesBuilder.toAnnotation(context, After.class);
    }
  }
}

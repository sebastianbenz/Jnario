package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderDescribeExampleGroupSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderDescribeExampleSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToFieldNameExampleTableSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToJavaClassNameExampleGroupSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToJavaClassNameExampleTableSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameAfterSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameBeforeSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameExampleSpec;
import org.junit.runner.RunWith;

@Contains({ ExampleNameProviderToJavaClassNameExampleGroupSpec.class, ExampleNameProviderToJavaClassNameExampleTableSpec.class, ExampleNameProviderToMethodNameExampleSpec.class, ExampleNameProviderToMethodNameBeforeSpec.class, ExampleNameProviderToMethodNameAfterSpec.class, ExampleNameProviderToFieldNameExampleTableSpec.class, ExampleNameProviderDescribeExampleGroupSpec.class, ExampleNameProviderDescribeExampleSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("ExampleNameProvider")
@InstantiateWith(value = SpecTestInstantiator.class)
public class ExampleNameProviderSpec {
  public Query parse(final CharSequence content) {
    final String contentWithPackage = StringExtensions.operator_plus("package test\n", content);
    final ModelStore modelStore = ModelStore.create();
    modelStore.parseSpec(contentWithPackage);
    return Query.query(modelStore);
  }
}
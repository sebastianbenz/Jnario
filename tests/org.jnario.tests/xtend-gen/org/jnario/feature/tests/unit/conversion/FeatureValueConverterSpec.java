package org.jnario.feature.tests.unit.conversion;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.feature.conversion.FeatureValueConverter;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterToStringSpec;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterToValueSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ FeatureValueConverterToValueSpec.class, FeatureValueConverterToStringSpec.class })
@SuppressWarnings("all")
@Named("FeatureValueConverter")
@RunWith(ExampleGroupRunner.class)
public class FeatureValueConverterSpec {
  FeatureValueConverter subject = new Function0<FeatureValueConverter>() {
    public FeatureValueConverter apply() {
      FeatureValueConverter _create = FeatureValueConverter.create("Prefix:");
      return _create;
    }
  }.apply();
}

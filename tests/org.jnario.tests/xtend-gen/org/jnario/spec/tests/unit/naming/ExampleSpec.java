package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameSpec;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpec;
import org.junit.runner.RunWith;

@Contains({ ExampleNameSpec.class, ExampleImplementationSpec.class, ExamplePendingSpec.class })
@SuppressWarnings("all")
@Named("Example")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class ExampleSpec {
  public Example parse(final String content) {
    ModelStore _modelStore = new ModelStore();
    final ModelStore modelStore = _modelStore;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(content, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    modelStore.parseSpec(_builder);
    Query _query = Query.query(modelStore);
    return _query.<Example>first(Example.class);
  }
  
  public boolean pendingStateOf(final String string) {
    Example _parse = this.parse(string);
    return _parse.isPending();
  }
}

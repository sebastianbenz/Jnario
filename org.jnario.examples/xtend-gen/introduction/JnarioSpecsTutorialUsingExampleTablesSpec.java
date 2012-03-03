package introduction;

import introduction.JnarioSpecsTutorialSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Using Example Tables")
public class JnarioSpecsTutorialUsingExampleTablesSpec extends JnarioSpecsTutorialSpec {
  @Test
  @Ignore
  @Named("Writing Assertions [PENDING]")
  @Order(0)
  public void writingAssertions() throws Exception {
    throw new UnsupportedOperationException("writingAssertionsis not implemented");
  }
  
  @Test
  @Ignore
  @Named("Specifying the Column Type [PENDING]")
  @Order(1)
  public void specifyingTheColumnType() throws Exception {
    throw new UnsupportedOperationException("specifyingTheColumnTypeis not implemented");
  }
}

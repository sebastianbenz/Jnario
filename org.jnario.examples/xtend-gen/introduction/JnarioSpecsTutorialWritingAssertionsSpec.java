package introduction;

import introduction.JnarioSpecsTutorialSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Writing Assertions")
public class JnarioSpecsTutorialWritingAssertionsSpec extends JnarioSpecsTutorialSpec {
  @Test
  @Ignore
  @Named("Should [PENDING]")
  @Order(0)
  public void should() throws Exception {
    throw new UnsupportedOperationException("shouldis not implemented");
  }
  
  @Test
  @Ignore
  @Named("Using Assert [PENDING]")
  @Order(1)
  public void usingAssert() throws Exception {
    throw new UnsupportedOperationException("usingAssertis not implemented");
  }
  
  @Test
  @Ignore
  @Named("Expecting Exceptions [PENDING]")
  @Order(2)
  public void expectingExceptions() throws Exception {
    throw new UnsupportedOperationException("expectingExceptionsis not implemented");
  }
}

package introduction;

import introduction.JnarioSpecsTutorialSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Type-safe specifications")
public class JnarioSpecsTutorialTypeSafeSpecificationsSpec extends JnarioSpecsTutorialSpec {
  @Test
  @Ignore
  @Named("Describing Java Classes [PENDING]")
  @Order(0)
  public void describingJavaClasses() throws Exception {
    throw new UnsupportedOperationException("describingJavaClassesis not implemented");
  }
  
  @Test
  @Ignore
  @Named("Describing Java Methods [PENDING]")
  @Order(1)
  public void describingJavaMethods() throws Exception {
    throw new UnsupportedOperationException("describingJavaMethodsis not implemented");
  }
  
  @Test
  @Ignore
  @Named("Implicit Subject Creation [PENDING]")
  @Order(2)
  public void implicitSubjectCreation() throws Exception {
    throw new UnsupportedOperationException("implicitSubjectCreationis not implemented");
  }
}

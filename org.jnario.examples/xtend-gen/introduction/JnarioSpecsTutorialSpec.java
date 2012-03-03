package introduction;

import introduction.JnarioSpecsTutorialHowToWriteASpecificationSpec;
import introduction.JnarioSpecsTutorialSpecExtensionsSpec;
import introduction.JnarioSpecsTutorialTypeSafeSpecificationsSpec;
import introduction.JnarioSpecsTutorialUsingExampleTablesSpec;
import introduction.JnarioSpecsTutorialWritingAssertionsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Jnario Specs - Tutorial")
@Contains({ JnarioSpecsTutorialHowToWriteASpecificationSpec.class, JnarioSpecsTutorialWritingAssertionsSpec.class, JnarioSpecsTutorialUsingExampleTablesSpec.class, JnarioSpecsTutorialTypeSafeSpecificationsSpec.class, JnarioSpecsTutorialSpecExtensionsSpec.class })
public class JnarioSpecsTutorialSpec {
}

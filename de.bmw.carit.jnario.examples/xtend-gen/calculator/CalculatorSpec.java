package calculator;

import calculator.CalculatorAddIntIntSpec;
import calculator.CalculatorDivideIntIntSpec;
import de.bmw.carit.jnario.runner.Contains;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
@Contains({CalculatorAddIntIntSpec.class,CalculatorDivideIntIntSpec.class})
public class CalculatorSpec {
}

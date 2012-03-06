package calculator;

import calculator.CalculatorAddIntIntSpec;
import calculator.CalculatorDivideIntIntSpec;
import calculator.CalculatorSubstractIntIntSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
@Contains({ CalculatorAddIntIntSpec.class, CalculatorDivideIntIntSpec.class, CalculatorSubstractIntIntSpec.class })
public class CalculatorSpec {
}

package calculator;

import calculator.CalculatorAddIntIntSpec;
import calculator.CalculatorDivideIntIntSpec;
import calculator.CalculatorSubstractSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CalculatorAddIntIntSpec.class, CalculatorDivideIntIntSpec.class, CalculatorSubstractSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
public class CalculatorSpec {
}

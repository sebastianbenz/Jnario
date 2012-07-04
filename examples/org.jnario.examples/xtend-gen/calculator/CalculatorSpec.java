package calculator;

import calculator.CalculatorAddIntIntSpec;
import calculator.CalculatorDivideIntIntSpec;
import calculator.CalculatorSubstractIntIntSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CalculatorAddIntIntSpec.class, CalculatorDivideIntIntSpec.class, CalculatorSubstractIntIntSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
public class CalculatorSpec {
}

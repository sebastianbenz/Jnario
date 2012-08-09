package gameoflife;

import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Unit Specifications")
@Contains(GameOfLifeSpec.class)
@SuppressWarnings("all")
public class UnitSpecificationsSuite {
}

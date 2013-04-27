package gameoflife;

import gameoflife.FeaturesSuite;
import gameoflife.UnitSpecificationsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Game of Life with Jnario & Xtend")
@Contains({ FeaturesSuite.class, UnitSpecificationsSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class GameOfLifeWithJnarioXtendSuite {
}

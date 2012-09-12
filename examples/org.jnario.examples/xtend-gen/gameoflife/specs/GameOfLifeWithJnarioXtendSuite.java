package gameoflife.specs;

import gameoflife.specs.FeaturesSuite;
import gameoflife.specs.UnitSpecificationsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Game of Life with Jnario & Xtend")
@Contains({ FeaturesSuite.class, UnitSpecificationsSuite.class })
@SuppressWarnings("all")
public class GameOfLifeWithJnarioXtendSuite {
}

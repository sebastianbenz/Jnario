package gameoflife.specs;

import demo.SelectMultipleSpecsSuite;
import gameoflife.specs.CellLocationSpec;
import gameoflife.specs.EvolutionSpec;
import gameoflife.specs.RulesSpec;
import gameoflife.specs.WorldSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Unit Specifications")
@Contains({ CellLocationSpec.class, EvolutionSpec.class, RulesSpec.class, SelectMultipleSpecsSuite.class, WorldSpec.class })
@SuppressWarnings("all")
public class UnitSpecificationsSuite {
}

package gameoflife.specs;

import gameoflife.specs.RulesEvolveDeadCellsSpec;
import gameoflife.specs.RulesEvolveLiveCellsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ RulesEvolveLiveCellsSpec.class, RulesEvolveDeadCellsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Rules")
public class RulesSpec {
}

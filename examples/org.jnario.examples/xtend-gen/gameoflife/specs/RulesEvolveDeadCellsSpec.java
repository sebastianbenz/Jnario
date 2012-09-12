package gameoflife.specs;

import gameoflife.EvolveDeadCells;
import gameoflife.specs.RulesEvolveDeadCellsSpecDeadcells;
import gameoflife.specs.RulesSpec;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("EvolveDeadCells")
public class RulesEvolveDeadCellsSpec extends RulesSpec {
  @Subject
  public EvolveDeadCells subject;
  
  @Before
  public void _initRulesEvolveDeadCellsSpecDeadcells() {
    deadcells = ExampleTable.create("deadcells", 
      java.util.Arrays.asList("liveNeighbourCount", "result"), 
      new RulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("2", "false"), 2, false),
      new RulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("3", "true"), 3, true),
      new RulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<RulesEvolveDeadCellsSpecDeadcells> deadcells;
  
  @Test
  @Named("deadcells.forEach[ subject.becomesAlive[liveNeighbourCount] => result ]")
  @Order(99)
  public void _deadcellsForEachSubjectBecomesAliveLiveNeighbourCountResult() throws Exception {
    final Procedure1<RulesEvolveDeadCellsSpecDeadcells> _function = new Procedure1<RulesEvolveDeadCellsSpecDeadcells>() {
        public void apply(final RulesEvolveDeadCellsSpecDeadcells it) {
          boolean _becomesAlive = RulesEvolveDeadCellsSpec.this.subject.becomesAlive(it.liveNeighbourCount);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.result));
          Assert.assertTrue("\nExpected subject.becomesAlive(liveNeighbourCount) => result but"
           + "\n     subject.becomesAlive(liveNeighbourCount) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(RulesEvolveDeadCellsSpec.this.subject).toString()
           + "\n     liveNeighbourCount is " + new StringDescription().appendValue(it.liveNeighbourCount).toString()
           + "\n     result is " + new StringDescription().appendValue(Boolean.valueOf(it.result)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<RulesEvolveDeadCellsSpecDeadcells>forEach(this.deadcells, _function);
  }
}

package gameoflife.specs;

import gameoflife.EvolveLiveCells;
import gameoflife.specs.RulesEvolveLiveCellsSpecLiveCells;
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
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("EvolveLiveCells")
public class RulesEvolveLiveCellsSpec extends RulesSpec {
  @Subject
  public EvolveLiveCells subject;
  
  public ExampleTable<RulesEvolveLiveCellsSpecLiveCells> _initRulesEvolveLiveCellsSpecLiveCells() {
    return ExampleTable.create("liveCells", 
      java.util.Arrays.asList("liveNeighbourCount", "result"), 
      new RulesEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("1", "false"), 1, false),
      new RulesEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("2", "true"), 2, true),
      new RulesEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("3", "true"), 3, true),
      new RulesEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<RulesEvolveLiveCellsSpecLiveCells> liveCells = _initRulesEvolveLiveCellsSpecLiveCells();
  
  @Test
  @Named("liveCells.forEach[ subject.becomesAlive[liveNeighbourCount] => result ]")
  @Order(1)
  public void _liveCellsForEachSubjectBecomesAliveLiveNeighbourCountResult() throws Exception {
    final Procedure1<RulesEvolveLiveCellsSpecLiveCells> _function = new Procedure1<RulesEvolveLiveCellsSpecLiveCells>() {
        public void apply(final RulesEvolveLiveCellsSpecLiveCells it) {
          boolean _becomesAlive = RulesEvolveLiveCellsSpec.this.subject.becomesAlive(it.liveNeighbourCount);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.result));
          Assert.assertTrue("\nExpected subject.becomesAlive(liveNeighbourCount) => result but"
           + "\n     subject.becomesAlive(liveNeighbourCount) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(RulesEvolveLiveCellsSpec.this.subject).toString()
           + "\n     liveNeighbourCount is " + new StringDescription().appendValue(it.liveNeighbourCount).toString()
           + "\n     result is " + new StringDescription().appendValue(Boolean.valueOf(it.result)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<RulesEvolveLiveCellsSpecLiveCells>forEach(this.liveCells, _function);
  }
}

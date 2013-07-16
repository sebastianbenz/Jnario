package gameoflife.specs;

import gameoflife.EvolveDeadCells;
import gameoflife.specs.RulesEvolveDeadCellsSpecDeadcells;
import gameoflife.specs.RulesSpec;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("EvolveDeadCells")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RulesEvolveDeadCellsSpec extends RulesSpec {
  @Subject
  public EvolveDeadCells subject;
  
  public ExampleTable<RulesEvolveDeadCellsSpecDeadcells> _initRulesEvolveDeadCellsSpecDeadcells() {
    return ExampleTable.create("deadcells", 
      Arrays.asList("liveNeighbourCount", "result"), 
      new RulesEvolveDeadCellsSpecDeadcells(  Arrays.asList("2", "false"), _initRulesEvolveDeadCellsSpecDeadcellsCell0(), _initRulesEvolveDeadCellsSpecDeadcellsCell1()),
      new RulesEvolveDeadCellsSpecDeadcells(  Arrays.asList("3", "true"), _initRulesEvolveDeadCellsSpecDeadcellsCell2(), _initRulesEvolveDeadCellsSpecDeadcellsCell3()),
      new RulesEvolveDeadCellsSpecDeadcells(  Arrays.asList("4", "false"), _initRulesEvolveDeadCellsSpecDeadcellsCell4(), _initRulesEvolveDeadCellsSpecDeadcellsCell5())
    );
  }
  
  protected ExampleTable<RulesEvolveDeadCellsSpecDeadcells> deadcells = _initRulesEvolveDeadCellsSpecDeadcells();
  
  public int _initRulesEvolveDeadCellsSpecDeadcellsCell0() {
    return 2;
  }
  
  public boolean _initRulesEvolveDeadCellsSpecDeadcellsCell1() {
    return false;
  }
  
  public int _initRulesEvolveDeadCellsSpecDeadcellsCell2() {
    return 3;
  }
  
  public boolean _initRulesEvolveDeadCellsSpecDeadcellsCell3() {
    return true;
  }
  
  public int _initRulesEvolveDeadCellsSpecDeadcellsCell4() {
    return 4;
  }
  
  public boolean _initRulesEvolveDeadCellsSpecDeadcellsCell5() {
    return false;
  }
  
  @Test
  @Named("deadcells.forEach[ subject.becomesAlive[liveNeighbourCount] => result ]")
  @Order(1)
  public void _deadcellsForEachSubjectBecomesAliveLiveNeighbourCountResult() throws Exception {
    final Procedure1<RulesEvolveDeadCellsSpecDeadcells> _function = new Procedure1<RulesEvolveDeadCellsSpecDeadcells>() {
        public void apply(final RulesEvolveDeadCellsSpecDeadcells it) {
          int _liveNeighbourCount = it.getLiveNeighbourCount();
          boolean _becomesAlive = RulesEvolveDeadCellsSpec.this.subject.becomesAlive(_liveNeighbourCount);
          boolean _result = it.getResult();
          boolean _doubleArrow = Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_becomesAlive), _result);
          Assert.assertTrue("\nExpected subject.becomesAlive(liveNeighbourCount) => result but"
           + "\n     subject.becomesAlive(liveNeighbourCount) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(RulesEvolveDeadCellsSpec.this.subject).toString()
           + "\n     liveNeighbourCount is " + new org.hamcrest.StringDescription().appendValue(_liveNeighbourCount).toString()
           + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<RulesEvolveDeadCellsSpecDeadcells>forEach(this.deadcells, _function);
  }
}

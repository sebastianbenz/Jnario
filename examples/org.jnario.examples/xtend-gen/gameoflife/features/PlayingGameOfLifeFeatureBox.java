package gameoflife.features;

import gameoflife.Evolution;
import gameoflife.World;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Box")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeatureBox {
  @Test
  @Order(0)
  @Named("Given a world")
  public void givenAWorld() {
    StepArguments _stepArguments = new StepArguments("------\n--XX--\n--XX--\n------ \n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    this.world = _parseWorld;
  }
  
  @Test
  @Order(1)
  @Named("Then the world evolves into")
  public void thenTheWorldEvolvesInto() {
    StepArguments _stepArguments = new StepArguments("------\n--XX--\n--XX--\n------\n\t\t\t");
    final StepArguments args = _stepArguments;
    Evolution _gameOfLife = Evolution.gameOfLife();
    World _evolve = _gameOfLife.evolve(this.world);
    this.world = _evolve;
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    boolean _doubleArrow = Should.operator_doubleArrow(
      this.world, _parseWorld);
    Assert.assertTrue("\nExpected world => parseWorld(args.first) but"
     + "\n     world is " + new StringDescription().appendValue(this.world).toString()
     + "\n     parseWorld(args.first) is " + new StringDescription().appendValue(_parseWorld).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
  
  World world;
}

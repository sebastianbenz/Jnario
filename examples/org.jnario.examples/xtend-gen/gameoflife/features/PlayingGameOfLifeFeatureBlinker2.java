package gameoflife.features;

import gameoflife.Evolution;
import gameoflife.World;
import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Blinker 2")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeatureBlinker2 extends PlayingGameOfLifeFeature {
  World world;
  
  @Test
  @Order(0)
  @Named("Given a world")
  public void _givenAWorld() {
    final StepArguments args = new StepArguments("-----\n-----\n-XXX-\n-----\n-----\n");
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    this.world = _parseWorld;
  }
  
  @Test
  @Order(1)
  @Named("Then the world evolves into")
  public void _thenTheWorldEvolvesInto() {
    final StepArguments args = new StepArguments("-----\n--X--\n--X--\n--X--\n-----\n");
    Evolution _gameOfLife = Evolution.gameOfLife();
    World _evolve = _gameOfLife.evolve(this.world);
    this.world = _evolve;
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    Should.<World>operator_doubleArrow(this.world, _parseWorld);
  }
}

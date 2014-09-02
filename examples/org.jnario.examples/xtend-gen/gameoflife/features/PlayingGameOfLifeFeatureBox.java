package gameoflife.features;

import gameoflife.World;
import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Box")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeatureBox extends PlayingGameOfLifeFeature {
  World world;
  
  @Test
  @Order(0)
  @Named("Given a world")
  public void _givenAWorld() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Box\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("Then the world evolves into")
  public void _thenTheWorldEvolvesInto() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Box\n"
      + "\nfirst cannot be resolved");
  }
}

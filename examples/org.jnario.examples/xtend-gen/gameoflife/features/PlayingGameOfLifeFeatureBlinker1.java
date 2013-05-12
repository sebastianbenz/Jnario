package gameoflife.features;

import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Blinker 1")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeatureBlinker1 extends PlayingGameOfLifeFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given a world")
  public void givenAWorld() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then the world evolves into")
  public void thenTheWorldEvolvesInto() {
    
  }
}

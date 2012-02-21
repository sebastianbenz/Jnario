package introduction

import static extension de.bmw.carit.jnario.common.test.util.Helpers.*
import static extension de.bmw.carit.jnario.lib.Each.*
import static extension de.bmw.carit.jnario.lib.Should.*
import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*

describe "Tutorial"{

	/*
	 *
	 * @filter('''.executesSuccessfully) 
	 */
	 it "Implicit subject creation" {
      '''
      package bootstrap
      
      import java.util.ArrayList
      
      describe ArrayList{

        it "should automatically create an instance of ArrayList called subject"{
          subject.should.be(typeof(ArrayList))
        }

      }
      '''.executesSuccessfully
  }
	 
}
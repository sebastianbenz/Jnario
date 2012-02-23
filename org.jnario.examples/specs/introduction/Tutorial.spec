/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package introduction

import static extension org.jnario.jnario.test.util.Helpers.*
import static extension org.jnario.lib.Each.*
import static extension org.jnario.lib.Should.*
import static extension org.jnario.tests.util.SpecExecutor.*

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
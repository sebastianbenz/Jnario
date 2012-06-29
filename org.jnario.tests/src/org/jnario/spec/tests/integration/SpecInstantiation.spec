/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static extension org.jnario.jnario.test.util.SpecExecutor.*

/*
 * It is possible to customize the instantiation of tests and subjects.
 * 
 * <pre class="prettyprint">
 * package org.jnario.lib;
 *   
 * import com.google.inject.Guice;
 * import com.google.inject.util.Modules;
 * 
 * public class GuiceBasedTestInstantiator extends AbstractTestInstantiator {
 *   public Object createTest(Class<?> klass) throws Exception {
 *     return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
 *   }
 * }
 * </pre>
 * 
 */
describe "Spec Instantiation" {

  /*
   *  @filter('''|.executesSuccessfully)  
   */
  fact "how to use a custom spec creator"{
    '''
      package bootstrap
      
      import org.jnario.runner.CreateWith
      import org.jnario.jnario.test.util.GuiceSpecCreator
      import com.google.inject.Inject
      
      @CreateWith(typeof(GuiceSpecCreator))
      describe GuiceBasedTestInstantiator {
        
        @Inject String toInject
        
        fact toInject should not be null
            
      }
    '''.executesSuccessfully
  }
  
}
   
	
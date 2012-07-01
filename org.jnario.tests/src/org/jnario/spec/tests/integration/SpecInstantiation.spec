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
 * It is possible to customize the instantiation of features, specs and subjects.
 * This can be useful when a dependency injection container or a mocking
 * framework should be used for creating specs. To do so, create a custom `SpecCreator` and 
 * annotate your spec with `CreateWith` and pass as a value the type of the custom `SpecCreator`.
 * Here is an example for a custom `SpecCreator` that uses Google Guice to create the specification:
 * 
 * <pre class="prettyprint">
 * package org.jnario.lib;
 *   
 * import com.google.inject.Guice;
 * import com.google.inject.util.Modules;
 * 
 * public class GuiceSpecCreator extends AbstractSpecCreator {
 *   public Object create(Class<?> klass) throws Exception {
 *     return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
 *   }
 * }
 * </pre>
 * 
 * [Here](https://gist.github.com/2869959) is another example that demonstrates 
 * how to create a custom **SpecCreator** for [Mockito](http://code.google.com/p/mockito/).
 */
describe "Customizing the Spec Creation" {

  /*
   * This example uses the Google Guice to instantiate the specification.
   *  @filter('''|.executesSuccessfully)  
   */
  fact "Example"{
    '''
      package bootstrap
      
      import org.jnario.runner.CreateWith
      import org.jnario.jnario.test.util.GuiceSpecCreator
      import com.google.inject.Inject
      
      @CreateWith(typeof(GuiceSpecCreator))
      describe "Something" {
        
        @Inject String toInject
        
        fact toInject should not be null
            
      }
    '''.executesSuccessfully
  }
  
}
   
	
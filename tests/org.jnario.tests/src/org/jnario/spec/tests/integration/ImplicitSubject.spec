/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration


import static org.junit.Assert.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject

/*
 * If your spec describes a specific type, Jnario 
 * will automatically create an instance variable 
 * ```subject``` of this type. By default it will 
 * use the no arg constructor to instantiate the subject
 * field, but it is possible to use Guice or other tools
 * to instantiate the subject by providing a custom 
 * **SpecCreator**.
 */
@CreateWith(typeof(SpecTestCreator))
describe "Implicit Subject"{
  @Inject extension BehaviorExecutor
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "spec creates instance of target type"{
    '''
      package bootstrap
      
      describe String {
      
        fact subject should not be null
        fact subject should be typeof(String)

      }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subject can be overridden within example group"{
    '''
      package bootstrap

      describe String {
        
        String subject = "overridden"
      
        fact "subject should be overridden"{
          subject should be "overridden"
        } 
            
      }
    '''.executesSuccessfully
  }
    /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subjects can be instantiated manually"{
    '''
      package bootstrap

      describe Integer {
        
        before subject = new Integer(42)
      
        fact "subject should be overridden"{
          subject should be 42
        } 
            
      }
    '''.executesSuccessfully
  }
  
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subjects will be only created if used"{
    '''
      package bootstrap

      describe String {
        
        fact "throws NoSuchFieldException because subject will not be created"{
          typeof(StringSpec).getField("subject") throws NoSuchFieldException
        } 
            
      }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subjects can be accessed from nested ExampleGroups"{
    '''
      package bootstrap

      describe String {
      
        describe "Nested ExampleGroup"{
          fact "should inherit the subject"{
          subject should be ""
        }
      }
          
      }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subjects can be overridden from nested ExampleGroups"{
    '''
    package bootstrap

    describe String {
      
      describe java.util.ArrayList "Nested ExampleGroup with different target type"{
        fact "can override the subject"{
          assert subject.empty
        }
      }
    }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subject will be only created in the subexample if is not used in the parent example group"{
    '''
      package bootstrap

      describe Integer{
        
        describe Integer {
          
          Integer subject = 0
          
          fact "can be manually assigned from within sub specification"{
            subject should be 0
          } 
        }
        
      }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "subject will not be created in a sub example if is used in the parent example group"{
    '''
      package bootstrap

      describe String {
        describe String{
          fact "should generate subject for superclass"{
            assert typeof(StringSpec).getDeclaredField("subject") != null
          }
          fact "should not generate subject for subclass"{
            typeof(StringStringSpec).getDeclaredField("subject") throws NoSuchFieldException
          }
          fact "uses subject"{
          subject.toString
        }
        }
        
        fact "uses subject"{
          subject.toString
        }
      }
    '''.executesSuccessfully
  }
}
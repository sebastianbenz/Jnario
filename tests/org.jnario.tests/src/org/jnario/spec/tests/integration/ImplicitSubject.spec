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

describe "Implicit Subject"{
  
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "should create instance of target type"{
    '''
      package bootstrap
      
      describe String {
      
        fact subject should not be null
            
      }
    '''.executesSuccessfully
  }
  /*
   * @filter('''|.executesSuccessfully)  
   */
  fact "can be overridden within example group"{
    '''
      package bootstrap

      import static org.hamcrest.CoreMatchers.*
      
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
  fact "will be only created if is used"{
    '''
      package bootstrap

      import static org.hamcrest.CoreMatchers.*
      
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
  fact "can be accessed from nested ExampleGroups"{
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
  fact "can be overridden from nested ExampleGroups"{
    '''
    package bootstrap

    import static org.hamcrest.CoreMatchers.*
    
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
  fact "will be only created in the subexample if is not used in the parent example group"{
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
  fact "will not be created in a sub example if is used in the parent example group"{
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
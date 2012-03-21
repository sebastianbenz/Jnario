/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.junit.Assert.*
import static org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*

describe "ImplicitSubject"{
	
	fact "should create instance of target type"{
		val spec = '
			package bootstrap
			
			describe String {
			
				fact subject should not be null
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "can be overridden within example group"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				String subject = "overridden"
			
				fact "subject should be overridden"{
					subject should be "overridden"
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "will be only created if is used"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				fact "throws NoSuchFieldException because subject will not be created"{
					typeof(StringSpec).getField("subject") throws NoSuchFieldException
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "can be accessed from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe "Nested ExampleGroup"{
				fact "should inherthe subject"{
					subject should be ""
				}
			}
					
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "can be overridden from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe java.util.ArrayList "Nested ExampleGroup with different target type"{
				fact "can override the subject"{
					assert subject.empty
				}
			}
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "will be only created in the subexample if is not used in the parent example group"{
		val spec = '
			package bootstrap

			describe Integer{
				
				describe Integer {
					
					Integer subject = 0
					
					fact "can be manually assigned from within sub specification"{
						subject should be 0
					} 
				}
				
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	fact "will not be created in a sub example if is used in the parent example group"{
		val spec = '
			package bootstrap
	
			import static org.hamcrest.CoreMatchers.*
						
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
	'
		assertThat(execute(spec), is(successful))
	}
}
package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*

describe "ImplicitSubject"{
	
	"should create instance of target type"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
			
				"subject should not be null"{
					subject.should.not.be(nullValue)
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"can be overridden within example group"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				String subject = "overridden"
			
				"subject should be overridden"{
					subject.should.be("overridden")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"will be only created if is used"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				throws NoSuchFieldException "because subject will not be created"{
					getClass().getField("subject")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"can be accessed from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe "Nested ExampleGroup"{
				"should inherthe subject"{
					subject.should.be("")
				}
			}
					
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"can be overridden from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe java.util.ArrayList "Nested ExampleGroup with different target type"{
				"can override the subject"{
					subject.empty.should.be(true)
				}
			}
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"will be only created in the subexample if is not used in the parent example group"{
		val spec = '
			package bootstrap

			describe Integer{
				
				describe Integer {
					
					Integer subject = 0
					
					"can be manually assigned from within sub specification"{
						subject.should.be(0)
					} 
				}
				
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	"will not be created in a sub example if is used in the parent example group"{
		val spec = '
			package bootstrap
	
			import static org.hamcrest.CoreMatchers.*
						
			describe String {
				describe String{
					"should generate subject for superclass"{
						assert typeof(StringSpec).getDeclaredField("subject") != null
					}
					throws NoSuchFieldException "should not generate subject for subclass"{
						typeof(StringStringSpec).getDeclaredField("subject")
					}
					"uses subject"{
					subject.toString
				}
				}
				
				"uses subject"{
					subject.toString
				}
			}
	'
		assertThat(execute(spec), is(successful))
	}
}
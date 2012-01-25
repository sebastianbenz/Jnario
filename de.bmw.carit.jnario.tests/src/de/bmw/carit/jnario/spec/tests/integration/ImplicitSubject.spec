package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*

describe "ImplicitSubject"{
	
	it "should create instance of target type"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
			
				it "subject should not be null"{
					subject.should.not.be(nullValue)
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "can be overridden within example group"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				String subject = "overridden"
			
				it "subject should be overridden"{
					subject.should.be("overridden")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "will be only created if it is used"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe String {
				
				it throws NoSuchFieldException "because subject will not be created"{
					getClass().getField("subject")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "can be accessed from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe "Nested ExampleGroup"{
				it "should inherit the subject"{
					subject.should.be("")
				}
			}
					
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "can be overridden from nested ExampleGroups"{
		val spec = '
			package bootstrap

		import static org.hamcrest.CoreMatchers.*
		
		describe String {
			
			describe java.util.ArrayList "Nested ExampleGroup with different target type"{
				it "can override the subject"{
					subject.empty.should.be(true)
				}
			}
		}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "will be only created in the subexample if it is not used in the parent example group"{
		val spec = '
			package bootstrap

			describe Integer{
				
				describe Integer {
					
					Integer subject = 0
					
					it "can be manually assigned from within sub specification"{
						subject.should.be(0)
					} 
				}
				
			}
		'
		assertThat(execute(spec), is(successful))
	}
	
	it "will not be created in a sub example if it is used in the parent example group"{
		val spec = '
			package bootstrap
	
			import static org.hamcrest.CoreMatchers.*
						
			describe String {
				describe String{
					it "should generate subject for superclass"{
						assert typeof(StringSpec).getDeclaredField("subject") != null
					}
					it throws NoSuchFieldException "should not generate subject for subclass"{
						typeof(StringStringSpec).getDeclaredField("subject")
					}
					it "uses subject"{
					subject.toString
				}
				}
				
				it "uses subject"{
					subject.toString
				}
			}
	'
		assertThat(execute(spec), is(successful))
	}
}
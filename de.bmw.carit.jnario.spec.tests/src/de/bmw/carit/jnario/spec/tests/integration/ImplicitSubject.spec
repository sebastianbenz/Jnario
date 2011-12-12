package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.experimental.results.ResultMatchers.*
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
	
	
}
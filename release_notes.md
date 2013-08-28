#Release Notes

##Jnario 0.6.0

* Compatible with Xtend 2.4.3
* Fix: encoding problems in generated reports
* Fix: CompilerMain & ReportGeneratorMain return error code if compilation fails.

##Jnario 0.5.1

* Fix unresolved features in suites when building with maven.
* Maven report generator has now an explicit parameter **sourceDirectory**.
* Fix invalid Jnario dependency in maven archetype.

##Jnario 0.5.0

* Compatible to Xtend 2.4.2.
* Greatly reduced compile times
* Remove dependencies to JUnit und Hamcrest from Jnario Plugins, which could lead to problems when compiling Jnario specs in some Eclipse environments.
* Fixed compile error when referencing steps that used static methods with multiple arguments.
* Fixed debug support when using maven.
* Fixed sporadic invalid validation errors when referencing steps.
* Static members can now be accessed via '.' instead of '::':

        // both are valid
        findElement(By.name("btnG")).click() 
        findElement(By::name("btnG")).click() 

* Define should matchers using lambdas

        fact "Example"{
          personOfAgeFour should be underAge
          personOfAgeFour should be olderThan(personOfAgeFive)
          
          /*  Fails with:
            java.lang.AssertionError: 
            Expected personOfAgeFour should be olderThan(personOfAgeFive) but
                personOfAgeFour is <A(4)>
                personOfAgeFive is <B(5)>
           */
        }
        
        def olderThan(Person p){
          [Person other | other.age > p.age]
        }
        
        def underAge() {
          [Person p | p.age < 18]
        }

##Jnario 0.4.3

- Fixed NPE when opening Jnario preferences

##Jnario 0.4.2

- Improved error messages for failed asssertions (closures will be filtered)
- Improved code completion for feature steps

##Jnario 0.4.1

- fixed organize imports for features definitions in combination with StepArguments
- fixed occasional "duplicate local variable args" validation error in feature definitions 
- fixed create method quick fix for xtend files

##Jnario 0.4.0

* Runs with Xtend 2.4.0
* Improved type inference and faster build times
* Access extension fields from in nested example groups:

         describe "Extension in nested example groups" {
           extension Shouter = new Shouter
           describe "nested example group"{
             fact "Hello".shout => "HELLO"
           }
         }

* Access extension fields in Background scenarios:

         Feature: Extension fields in Backgrounds
 
         Background:
             extension Shouter = new Shouter
           Given a background with extension  
             "Hello".shout => "HELLO"

         Scenario: Using the background extension
           Then we can use the extension 
             "Hello".shout => "HELLO"

* Generate HTML reports which includes a spec's outcome 
including possible failures.
![Example report](http://jnario.org/img/report_error.png)

* Define super classes in features and specs using the @Extends annotation:

        @Extends(typeof(MySuperClass))
        describe "defining super classes"{
             ...
        }

* New wait helper:

        fact "Wait for something"{
          // define wait condition using lambdas 
          waitUntil[1 > 0]
          // configuration options
          waitUntil[
            message = "Custom error message"
            duration = 100
            pollingInterval = 10
            1 > 0
          ]
        }
* Validation error for duplicate step implementations in features.
* New maven archetype for creating a basic Jnario project:

         mvn archetype:generate                                  \
         -DarchetypeGroupId=org.jnario                           \
         -DarchetypeArtifactId=jnario-archetype                  \
         -DarchetypeVersion=0.4.0                                \
         -DgroupId=org.example                                   \
         -DartifactId=myproject

* Better maven support in Eclipse via M2E.
* **Oldie but goldie:** You can define your own should matchers by defining a method with the prefix should_XXXX in the current scope. The method needs to return a boolean value. For example, when we define a method should_eat:
         
         fact "Define your own matchers"{
           "Monkey" should eat "Banana"
           "Monkey" should eat "Rocks" throws AssertionError
         }
     
    ...then we can use "eat" in our should expressions:

         def should_eat(String animal, String food){
           animal == "Monkey" && food == "Banana"
         }



package org.jnario.jnario.documentation

describe "Installing Jnario"{

	/*
	 * Xtend requires Eclipse 3.5 or higher and a Java SDK 5 or higher. Use one of the update sites 
	 * from above to install the full SDK into your running Eclipse. If you do not yet have an Eclipse 
	 * on your machine, you can download one of the pre-packaged distributions on the right. 
	 * Standalone compilation is supported as well, the simplest way to do that is using the Maven plug-in.
	 */
	describe "Eclipse Tooling"{
		
		/*
		 * Latest Release
		 * Latest Milestone
		 */
		
	}
	
	describe "Maven"{
		
		/*
		 * The runtime library as well as a plug-in to run the compiler in a 
		 * Maven build can be be obtained from the following Maven repository: 
		 * http://build.eclipse.org/common/xtend/maven/.
		 * 
		 *     	<repositories>
		 *      	  <repository>
		 *     	    <id>xtend</id>
		 *     	    <url>http://build.eclipse.org/common/xtend/maven/</url>
		 *     	  </repository>
		 *     	</repositories>
		 *     	<pluginRepositories>
		 *     	  <pluginRepository>
		 *     	    <id>xtend</id>
		 *     	    <url>http://build.eclipse.org/common/xtend/maven/</url>
		 *     	  </pluginRepository>
		 *     	</pluginRepositories>
		 * 
		 */
		fact "Jnario Dependencies"{
			
		}
		
		/*
		 * The XML for the dependency is:
		 * 
		 *     <dependency>
		 *       <groupId>org.eclipse.xtend</groupId>
		 *       <artifactId>org.eclipse.xtend.lib</artifactId>
		 *       <version>2.3.0</version>
		 *     </dependency>
		 */
		fact "Jnario Runtime"{
			
		}
		
		/*
		 * The runtime library as well as a plug-in to run the compiler in a 
		 * Maven build can be be obtained from the following Maven repository: 
		 * http://build.eclipse.org/common/xtend/maven/.
		 *
		 *		<plugins>
		 *	      <plugin>
		 *         <groupId>org.jnario</groupId>
		 *	        <artifactId>jnario-maven-plugin</artifactId>
		 *	        <version>0.1.0-SNAPSHOT</version>
		 *	        <executions>
		 *	          <execution>
		 *	            <goals>
		 *	              <goal>testCompile</goal>
		 *	            </goals>
		 *	          </execution>
		 *	        </executions>
		 *	      </plugin>
		 *	      <plugin>
		 *	        <groupId>org.apache.maven.plugins</groupId>
		 *	        <artifactId>maven-surefire-plugin</artifactId>
		 *	        <version>2.12</version>
		 *	        <configuration>
		 *	          <includes>
		 *	            <include>**\/*Spec*.java</include>
		 *	            <include>**\/*Feature.java</include>
		 *	            <include>**\/*Test.java</include>
		 *	            <include>**\/*TestCase.java</include>
		 *	          </includes>
		 *	        </configuration>
		 *	      </plugin>
		 *	    </plugins>
		 * 
		 */
		fact "Jnario Compiler"{
			
		}
		
		/*
		 * As you see the outputDirectory can be specified to match the default of 
		 * the Eclipse plug-in (xtend-gen). Of course you can also change the 
		 * configuration in Eclipse to match the Maven default (generated-sources). 
		 * To do so right-click on the project and select Properties or if you prefer 
		 * a global setting choose Eclipse->Preferences. In the category Xtend/Compiler 
		 * enter the directory name (see screenshot). It is interpreted as a relative 
		 * path to the parent of the source folder, which includes the to-be-compiled Xtend file.
		 */
		fact "Configuring Eclipse"{
			
		}
		
	}

}
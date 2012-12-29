/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.documentation

/*
 * Jnario is fully integrated into [Eclipse](http://www.eclipse.org). There are editors with syntax highlighting, 
 * code completion, validation and debugger for each of Jnario's languages together with 
 * an incremental compiler. However, Jnario is **not** restricted to Eclipse. Specs can 
 *  be compiled and executed standalone, for example, using [Maven](http://maven.apache.org/).
 */
describe "Installing Jnario"{

	/*
	 * Jnario requires Eclipse 3.5 or higher and a Java SDK 5 or higher. You can install Jnario runtime and tooling
	 * via the [Eclipse Marketplace](http://marketplace.eclipse.org/content/jnario)
	 * or using the following update sites: 
	 * 
	 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**For official releases:** <code>http://www.jnario.org/updates/releases/</code>
	 * 
	 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**For the latest stable snapshot:** <code>http://www.jnario.org/updates/snapshot/</code>
	 * 
	 *  If you do not yet have an Eclipse on your machine, you can download one of the pre-packaged 
	 * [Xtend distributions](http://www.eclipse.org/xtend/download.html). 
	 */
	describe "Installing the Eclipse Tooling"{
		
	}
	
	/*
	 * The runtime library as well as a plug-in to run the compiler in a 
	 * Maven build can be be installed from [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cjnario).
	 * There is also an [example project](https://github.com/bmwcarit/Jnario/tree/master/examples/org.jnario.maven.example) 
	 * demonstrating the usage of Jnario with Maven.
	 */
	describe "Using Jnario with Maven"{
		
		/*
		 * The XML for the Jnario runtime library is:
		 * 
		 *     <dependency>
		 *       <groupId>org.jnario</groupId>
		 *       <artifactId>org.jnario.lib.maven</artifactId>
		 *       <version>0.3.0</version>
		 *       <scope>test</scope>
		 *     </dependency>
		 * 
		 *  @filter(.*)
		 */
		fact "Jnario Runtime"{
			"not yet implemented"
		}
		
		/* You should also configure Surefire to execute specs and features:
		 * 
		 *     <plugin>
		 *       <groupId>org.apache.maven.plugins</groupId>
		 *         <artifactId>maven-surefire-plugin</artifactId>
		 *         <version>2.12</version>
		 *         <configuration>
		 *           <includes>
		 *             <include>**\/*Spec*.java</include>
		 *             <include>**\/*Feature.java</include>
		 *             <include>**\/*Test.java</include>
		 *             <include>**\/*TestCase.java</include>
		 *           </includes>
		 *         </configuration>
		 *       </plugin>
		 *     </plugins>
		 * 
		 *  @filter(.*)
		 */
		fact "Executing specs"{
			"not yet implemented"
		}
		
		/*
		 * You can use the Jnario plugin to compile specs from Maven:
		 *
		 *     <plugin>
		 *       <groupId>org.jnario</groupId>
		 *       <artifactId>jnario-maven-plugin</artifactId>
		 *       <version>0.3.0</version>
		 *       <executions>
		 *         <execution>
		 *           <goals>
		 *             <goal>testCompile</goal>
		 *           </goals>
		 *         </execution>
		 *       </executions>
		 *     </plugin>
		 * 
		 * @filter(.*)
		 * 
		 */
		fact "Jnario Compiler"{
			"not yet implemented"
		}
		
		/*
		 * The outputDirectory can be specified to match the default of 
		 * the Eclipse plug-in (xtend-gen). You can also change the 
		 * configuration in Eclipse to match the Maven default (generated-sources). 
		 * To do so right-click on the project and select Properties or if you prefer 
		 * a global setting choose **Eclipse->Preferences**. In the category **Jnario/Compiler** enter
		 *  the directory name (see screenshot). It is interpreted as a relative 
		 * path to the parent of the source folder, which includes the to-be-compiled Xtend file.
		 * 
		 * <p align="center"><img width="500px" src="/img/tutorial/project_compiler_settings.png" alt="Configuring project specific compiler settings."/></p>
		 * 
		 * @filter(.*)
		 */
		fact "Configuring Eclipse"{
			"not yet implemented"
		}
		
	}

}
/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import org.jnario.jnario.documentation.InstallingJnarioSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * The runtime library as well as a plug-in to run the compiler in a
 * Maven build can be be installed from [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cjnario).
 * The easiest way to get started is to use the Jnario maven archetype:
 * 
 *     mvn archetype:generate                                  \
 *     -DarchetypeGroupId=org.jnario                           \
 *     -DarchetypeArtifactId=jnario-archetype                  \
 *     -DarchetypeVersion=1.0.0                                \
 *     -DgroupId=org.example                                   \
 *     -DartifactId=myproject
 * 
 * There is also an [example project](https://github.com/sebastianbenz/Jnario/tree/master/examples/org.jnario.maven.example)
 * demonstrating the usage of Jnario with Maven.
 */
@Named("Using Jnario with Maven")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class InstallingJnarioUsingJnarioWithMavenSpec extends InstallingJnarioSpec {
  /**
   * The XML for the Jnario runtime library is:
   * 
   *     <dependency>
   *       <groupId>org.jnario</groupId>
   *       <artifactId>org.jnario.lib.maven</artifactId>
   *       <version>1.0.0</version>
   *       <scope>test</scope>
   *     </dependency>
   * 
   *  @filter(.*)
   */
  @Test
  @Named("Jnario Runtime")
  @Order(1)
  public void _jnarioRuntime() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
   * You should also configure Surefire to execute specs and features:
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
  @Test
  @Named("Executing specs")
  @Order(2)
  public void _executingSpecs() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
   * You can use the Jnario plugin to compile specs from Maven:
   * 
   *     <plugin>
   *       <groupId>org.jnario</groupId>
   *       <artifactId>jnario-maven-plugin</artifactId>
   *       <version>1.0.0</version>
   *       <executions>
   *         <execution>
   *           <goals>
   *             <goal>testCompile</goal>
   *             <goal>xtend-test-install-debug-info</goal>
   *           </goals>
   *         </execution>
   *       </executions>
   *     </plugin>
   * 
   * <span class="label label-important">Important</span> For
   * performance reasons, the Jnario compiler also includes the Xtend compiler. Make sure
   * not register the Xtend compiler for the *testCompile* phase, as this would execute the
   * Xtend compiler twice.
   * 
   * @filter(.*)
   */
  @Test
  @Named("Jnario Compiler")
  @Order(3)
  public void _jnarioCompiler() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
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
  @Test
  @Named("Configuring Eclipse")
  @Order(4)
  public void _configuringEclipse() throws Exception {
    /* "not yet implemented" */
  }
}

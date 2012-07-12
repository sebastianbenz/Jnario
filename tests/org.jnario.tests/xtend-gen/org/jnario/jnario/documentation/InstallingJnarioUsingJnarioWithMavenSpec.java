/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.documentation;

import org.jnario.jnario.documentation.InstallingJnarioSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Using Jnario with Maven")
public class InstallingJnarioUsingJnarioWithMavenSpec extends InstallingJnarioSpec {
  /**
   * The runtime library as well as a plug-in to run the compiler in a
   * Maven build can be be obtained from the following Maven repository:
   * http://build.eclipse.org/common/xtend/maven/.
   * 
   *     <repositories>
   *       <repository>
   *         <id>xtend</id>
   *           <url>http://build.eclipse.org/common/xtend/maven/</url>
   *      	</repository>
   *     </repositories>
   *     <pluginRepositories>
   *       <pluginRepository>
   *         <id>xtend</id>
   *         <url>http://build.eclipse.org/common/xtend/maven/</url>
   *       </pluginRepository>
   *     </pluginRepositories>
   * 
   * @filter(.*)
   */
  @Test
  @Named("Jnario Dependencies")
  @Order(99)
  public void jnarioDependencies() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
   * The XML for the dependency is:
   * 
   *     <dependency>
   *       <groupId>org.jnario</groupId>
   *       <artifactId>org.jnario.lib</artifactId>
   *       <version>0.1.0</version>
   *     </dependency>
   * 
   *  @filter(.*)
   */
  @Test
  @Named("Jnario Runtime")
  @Order(99)
  public void jnarioRuntime() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
   * You should also configure Surefire to execute specs and features:
   * 
   * 	      <plugin>
   * 	        <groupId>org.apache.maven.plugins</groupId>
   * 	        <artifactId>maven-surefire-plugin</artifactId>
   * 	        <version>2.12</version>
   * 	        <configuration>
   * 	          <includes>
   * 	            <include>**\/*Spec*.java</include>
   * 	            <include>**\/*Feature.java</include>
   * 	            <include>**\/*Test.java</include>
   * 	            <include>**\/*TestCase.java</include>
   * 	          </includes>
   * 	        </configuration>
   * 	      </plugin>
   * 	    </plugins>
   * 
   *  @filter(.*)
   */
  @Test
  @Named("Executing specs")
  @Order(99)
  public void executingSpecs() throws Exception {
    /* "not yet implemented" */
  }
  
  /**
   * You can use the Jnario plugin to compile specs from Maven:
   * 
   * 		<plugins>
   * 	      <plugin>
   *         <groupId>org.jnario</groupId>
   * 	        <artifactId>jnario-maven-plugin</artifactId>
   * 	        <version>0.1.0</version>
   * 	        <executions>
   * 	          <execution>
   * 	            <goals>
   * 	              <goal>testCompile</goal>
   * 	            </goals>
   *              <!-- optionally you can configure a different target folder -->
   *              <!--
   *              <configuration>
   *                <outputDirectory>xtend-gen</outputDirectory>
   *              </configuration>
   *              -->
   * 	          </execution>
   * 	        </executions>
   * 	      </plugin>
   * 
   * @filter(.*)
   */
  @Test
  @Named("Jnario Compiler")
  @Order(99)
  public void jnarioCompiler() throws Exception {
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
  @Order(99)
  public void configuringEclipse() throws Exception {
    /* "not yet implemented" */
  }
}

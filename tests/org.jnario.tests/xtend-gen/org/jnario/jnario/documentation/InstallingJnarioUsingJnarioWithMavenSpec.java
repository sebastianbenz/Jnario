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
 * There is also an [example project](https://github.com/bmwcarit/Jnario/tree/master/examples/org.jnario.maven.example)
 * demonstrating the usage of Jnario with Maven.
 */
@SuppressWarnings("all")
@Named("Using Jnario with Maven")
@RunWith(ExampleGroupRunner.class)
public class InstallingJnarioUsingJnarioWithMavenSpec extends InstallingJnarioSpec {
  /**
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

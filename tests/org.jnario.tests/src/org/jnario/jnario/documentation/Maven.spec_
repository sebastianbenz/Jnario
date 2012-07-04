package org.jnario.jnario.documentation

import org.junit.Rule
import org.junit.rules.TemporaryFolder
import java.io.File
import java.io.BufferedReader
import java.io.InputStreamReader
import static org.junit.Assume.*
import java.net.URL
import java.io.IOException
import org.junit.Ignore

@Ignore
describe "Maven"{

	@Rule public val tempFolder = new TemporaryFolder
	
	before "check for internet connectivity"{
		var hasInternetConnection = true
		try {
		    val myURL = new URL("http://example.com/");
		    val myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		} 
		catch (IOException e) {  
			println("No Internet connection") 
			hasInternetConnection = false
		}
		assumeTrue(hasInternetConnection)
	}
	
	/*
	 * The first step is to create a new maven project.
	 * @filter('''\..*exists|'''\s) 
	 */
	 fact "Create a new maven project"{
	 	'''
		 	mvn archetype:generate \
		 	  -DgroupId=com.mycompany.app \
		 	  -DartifactId=my-app \
		 	  -DarchetypeArtifactId=maven-archetype-quickstart \
		 	  -DinteractiveMode=false
	 	'''.execute
	 	assert file("my-app/pom.xml").exists
	 }
	 
	 /*
	  * @lang(xml)
	  * @filter(''')
	  */
	 fact "Add the Jnario dependencies"{
	 '''
	    <repositories>
	      <repository>
	        <id>Jnario Snapshots</id>
	        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
	      </repository>
	    </repositories>
	    
	    <pluginRepositories>
	      <pluginRepository>
	        <id>Jnario Snapshots</id>
	        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
	      </pluginRepository>
	    </pluginRepositories>
	    
	    <dependencies>
	      <dependency>
	        <groupId>org.jnario</groupId>
	        <artifactId>org.jnario.lib.maven</artifactId>
	        <version>0.1.0-SNAPSHOT</version>
	        <scope>test</scope>
	      </dependency>
	    </dependencies>
	 '''
	 }
	 
	 /*
	  * @lang(xml)
	  * @filter(''')
	  */
	 fact "Configure the Jnario plugins"{
	 	'''
      <build>
        <plugins>
          <plugin>
            <groupId>org.jnario</groupId>
            <artifactId>jnario-maven-plugin</artifactId>
            <version>0.1.0-SNAPSHOT</version>
            <executions>
              <execution>
                <goals>
                  <goal>testCompile</goal>
                </goals>
              </execution>
            </executions>
          </plugin>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.12</version>
            <configuration>
              <includes>
                <include>**/*Spec*.java</include>
                <include>**/*Feature.java</include>
                <include>**/*Test.java</include>
                <include>**/*TestCase.java</include>
              </includes>
            </configuration>
          </plugin>
        </plugins>
      </build>
	 	'''
	 }
	 
	 
	 def execute(CharSequence cmd){
	 	val process = Runtime::getRuntime().exec(cmd.toString.replace("\\", ""), null, tempFolder.root);
	 	val input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		var String line=input.readLine()
 
		while(line != null){
			println(line)
			line = input.readLine()
		}
		val exitVal = process.waitFor()
        println("Exited with error code "+exitVal)
	 }
	 
	 def file(String file){
	 	new File(tempFolder.root.path + "/" + file)
	 }

}
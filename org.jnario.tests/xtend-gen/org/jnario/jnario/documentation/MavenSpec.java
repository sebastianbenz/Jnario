package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Maven")
public class MavenSpec {
  @Rule
  public final TemporaryFolder tempFolder = new Function0<TemporaryFolder>() {
    public TemporaryFolder apply() {
      TemporaryFolder _temporaryFolder = new TemporaryFolder();
      return _temporaryFolder;
    }
  }.apply();
  
  @Before
  public void checkForInternetConnectivity() throws Exception {
    boolean hasInternetConnection = true;
    try {
      URL _uRL = new URL("http://example.com/");
      final URL myURL = _uRL;
      final URLConnection myURLConnection = myURL.openConnection();
      myURLConnection.connect();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        InputOutput.<String>println("No Internet connection");
        hasInternetConnection = false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    Assume.assumeTrue(hasInternetConnection);
  }
  
  /**
   * The first step is to create a new maven project.
   * @filter('''\..*exists|'''\s)
   */
  @Test
  @Named("Create a new maven project")
  @Order(99)
  public void createANewMavenProject() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mvn archetype:generate \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DgroupId=com.mycompany.app \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DartifactId=my-app \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DarchetypeArtifactId=maven-archetype-quickstart \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DinteractiveMode=false");
    _builder.newLine();
    this.execute(_builder);
    File _file = this.file("my-app/pom.xml");
    boolean _exists = _file.exists();
    Assert.assertTrue("\nExpected file(\"my-app/pom.xml\").exists but"
     + "\n     file(\"my-app/pom.xml\") is " + _file + "\n", _exists);
    
  }
  
  /**
   * @lang(xml)
   * @filter(''')
   */
  @Test
  @Named("Add the Jnario dependencies")
  @Order(99)
  public void addTheJnarioDependencies() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<repositories>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<repository>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<id>Jnario Snapshots</id>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<url>https://oss.sonatype.org/content/repositories/snapshots</url>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</repository>");
    _builder.newLine();
    _builder.append("</repositories>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<pluginRepositories>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<pluginRepository>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<id>Jnario Snapshots</id>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<url>https://oss.sonatype.org/content/repositories/snapshots</url>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</pluginRepository>");
    _builder.newLine();
    _builder.append("</pluginRepositories>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<groupId>org.jnario</groupId>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<artifactId>org.jnario.lib.maven</artifactId>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<version>0.1.0-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("</dependencies>");
    _builder.newLine();
  }
  
  /**
   * @lang(xml)
   * @filter(''')
   */
  @Test
  @Named("Configure the Jnario plugins")
  @Order(99)
  public void configureTheJnarioPlugins() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<groupId>org.jnario</groupId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<artifactId>jnario-maven-plugin</artifactId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<version>0.1.0-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<executions>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<execution>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<goals>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<goal>testCompile</goal>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</goals>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</execution>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</executions>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<groupId>org.apache.maven.plugins</groupId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<artifactId>maven-surefire-plugin</artifactId>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<version>2.12</version>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<includes>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<include>**/*Spec*.java</include>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<include>**/*Feature.java</include>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<include>**/*Test.java</include>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<include>**/*TestCase.java</include>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</includes>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("</build>");
    _builder.newLine();
  }
  
  public String execute(final CharSequence cmd) {
    try {
      String _xblockexpression = null;
      {
        Runtime _runtime = Runtime.getRuntime();
        String _string = cmd.toString();
        String _replace = _string.replace("\\", "");
        File _root = this.tempFolder.getRoot();
        final Process process = _runtime.exec(_replace, null, _root);
        InputStream _inputStream = process.getInputStream();
        InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
        final BufferedReader input = _bufferedReader;
        String line = input.readLine();
        boolean _notEquals = (!Objects.equal(line, null));
        boolean _while = _notEquals;
        while (_while) {
          {
            InputOutput.<String>println(line);
            String _readLine = input.readLine();
            line = _readLine;
          }
          boolean _notEquals_1 = (!Objects.equal(line, null));
          _while = _notEquals_1;
        }
        final int exitVal = process.waitFor();
        String _plus = ("Exited with error code " + Integer.valueOf(exitVal));
        String _println = InputOutput.<String>println(_plus);
        _xblockexpression = (_println);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public File file(final String file) {
    File _root = this.tempFolder.getRoot();
    String _path = _root.getPath();
    String _plus = (_path + "/");
    String _plus_1 = (_plus + file);
    File _file = new File(_plus_1);
    return _file;
  }
}

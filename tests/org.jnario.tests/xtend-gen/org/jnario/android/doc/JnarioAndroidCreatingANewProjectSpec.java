package org.jnario.android.doc;

import org.jnario.android.doc.JnarioAndroidSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Use the following maven archetype:
 * 
 *     mvn archetype:generate \
 *      -DarchetypeArtifactId=android-release \
 *      -DarchetypeGroupId=de.akquinet.android.archetypes \
 *      -DarchetypeVersion=1.0.11 \
 *      -DgroupId=org.jnario.android \
 *      -DartifactId=android-jnario \
 *      -Dpackage=org.jnario.android
 */
@Named("Creating a new project")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioAndroidCreatingANewProjectSpec extends JnarioAndroidSpec {
}

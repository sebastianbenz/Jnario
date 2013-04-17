/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import org.jnario.jnario.documentation.InstallingJnarioInstallingTheEclipseToolingSpec;
import org.jnario.jnario.documentation.InstallingJnarioUsingJnarioWithMavenSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Jnario is fully integrated into [Eclipse](http://www.eclipse.org). There are editors with syntax highlighting,
 * code completion, validation and debugger for each of Jnario's languages together with
 * an incremental compiler. However, Jnario is **not** restricted to Eclipse. Specs can
 *  be compiled and executed standalone, for example, using [Maven](http://maven.apache.org/).
 */
@Contains({ InstallingJnarioInstallingTheEclipseToolingSpec.class, InstallingJnarioUsingJnarioWithMavenSpec.class })
@Named("Installing Jnario")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class InstallingJnarioSpec {
}

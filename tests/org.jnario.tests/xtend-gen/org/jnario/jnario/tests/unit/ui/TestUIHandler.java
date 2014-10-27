package org.jnario.jnario.tests.unit.ui;

import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.part.ViewPart;
import org.jnario.ui.handler.AbstractJnarioRunnerUIHandler;

@SuppressWarnings("all")
public class TestUIHandler extends AbstractJnarioRunnerUIHandler {
  public Action getAction(final ViewPart part, final ITestElement element) {
    return null;
  }
}

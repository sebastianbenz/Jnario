/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.wizards;

import org.eclipse.osgi.util.NLS;

public final class WizardMessages extends NLS {

	private static final String BUNDLE_NAME= "org.jnario.feature.ui.wizards.WizardMessages";//$NON-NLS-1$

	private WizardMessages() {
		// Do not instantiate
	}

	public static String NewTestCaseWizardPageOne__error_junit4NotOnbuildpath;
	public static String NewTestCaseWizardPageOne_error_java5required;
	public static String NewTestCaseWizardPageOne_linkedtext_java5required;
	public static String NewTestCaseWizardPageOne_not_yet_implemented_string;
	public static String Wizard_title_new_testcase;
	public static String CheckedTableSelectionDialog_emptyListMessage;
	public static String CheckedTableSelectionDialog_selectAll;
	public static String CheckedTableSelectionDialog_deselectAll;
	public static String NewTestCaseWizardPageOne_title;
	public static String NewTestCaseWizardPageOne_description;
	public static String NewTestCaseWizardPageOne_class_to_test_label;
	public static String NewTestCaseWizardPageOne_class_to_test_browse;
	public static String NewTestCaseWizardPageOne_class_to_test_dialog_title;
	public static String NewTestCaseWizardPageOne_class_to_test_dialog_message;
	public static String NewTestCaseWizardPageOne_error_class_to_test_not_valid;
	public static String NewTestCaseWizardPageOne_error_class_to_test_not_exist;
	public static String NewTestCaseWizardPageOne_warning_class_to_test_is_interface;
	public static String NewTestCaseCreationWizard_fix_selection_junit3_description;
	public static String NewTestCaseCreationWizard_fix_selection_junit4_description;
	public static String NewTestCaseCreationWizard_fix_selection_open_build_path_dialog;
	public static String NewTestCaseCreationWizard_fix_selection_invoke_fix;
	public static String NewTestCaseCreationWizard_create_progress;
	public static String NewTestCaseCreationWizard_fix_selection_not_now;
	public static String NewTestCaseWizardPageOne_warning_class_to_test_not_visible;
	public static String NewTestCaseWizardPageOne_comment_class_to_test;
	public static String NewTestCaseWizardPageOne_error_junitNotOnbuildpath;
	public static String NewTestCaseWizardPageTwo_selected_methods_label_one;
	public static String NewTestCaseWizardPageTwo_selected_methods_label_many;
	public static String NewTestCaseWizardPageTwo_methods_tree_label;
	public static String NewTestCaseWizardPageTwo_selectAll;
	public static String NewTestCaseWizardPageTwo_deselectAll;
	public static String NewTestClassWizPage_treeCaption_classSelected;
	public static String NewTestClassWizPage_treeCaption_classesSelected;
	public static String NewJUnitWizard_op_error_title;
	public static String NewJUnitWizard_op_error_message;
	public static String ExceptionDialog_seeErrorLogMessage;

	static {
		NLS.initializeMessages(BUNDLE_NAME, WizardMessages.class);
	}
}

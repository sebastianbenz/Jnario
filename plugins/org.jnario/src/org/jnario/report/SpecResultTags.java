package org.jnario.report;

public interface SpecResultTags {

	public static final String NODE_TESTRUN= "testrun"; 
	public static final String NODE_TESTSUITES= "testsuites"; 
	public static final String NODE_TESTSUITE= "testsuite"; 
	public static final String NODE_TESTCASE= "testcase"; 
	public static final String NODE_ERROR= "error"; 
	public static final String NODE_FAILURE= "failure"; 
	public static final String NODE_EXPECTED= "expected";  
	public static final String NODE_ACTUAL= "actual";  
	public static final String NODE_SYSTEM_OUT= "system-out"; 
	public static final String NODE_SYSTEM_ERR= "system-err"; 
	public static final String NODE_SKIPPED = "skipped"; 
	public static final String ATTR_NAME= "name"; 
	public static final String ATTR_MESSAGE= "message"; 
	public static final String ATTR_TYPE= "type";
	public static final String ATTR_FAILURES= "failures"; 
	public static final String ATTR_ERRORS= "errors"; 
	public static final String ATTR_PACKAGE= "package"; 
	public static final String ATTR_CLASSNAME= "classname"; 
	public static final String ATTR_TIME= "time"; 
}

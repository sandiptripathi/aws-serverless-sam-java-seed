package com.serverless.example;

        import junit.framework.Test;
        import junit.framework.TestCase;
        import junit.framework.TestSuite;

/**
 * Unit test for simple Hello World App.
 */
public class HelloWorldTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(com.serverless.example.HelloWorldTest. class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}

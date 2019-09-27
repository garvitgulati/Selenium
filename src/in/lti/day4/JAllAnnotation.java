package in.lti.day4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JAllAnnotation {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in beforeclass setupbefore");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in afterclass teardownafterclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("in before setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("in after teardown");
	}

	@Test
	public void test() {
	
	}

}

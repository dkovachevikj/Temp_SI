package test_package;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SomeClassTest {

	SomeClass someClass;
	
	@Before
	public void setUp() throws Exception {
		someClass = new SomeClass();
	}

	@Test
	public void testAdd() {
		assertEquals(10, someClass.add(5, 5));
	}

}

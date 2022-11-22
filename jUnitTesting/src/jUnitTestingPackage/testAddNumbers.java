package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.AddNumbers(100, 100);
		assertEquals(200, result);
	}

}

package jUnitTestPackage;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		int result = junit.addNumbers(69, 96);
		assertEquals(165,result);
	}

}
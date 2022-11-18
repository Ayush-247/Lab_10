package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addstring {

	@Test
	void test() {
		jUnitTestFunctions myObj1 = new jUnitTestFunctions();
		String result1 = myObj1.addStrings("Ayushman", "Chaturvedi");
		String result2 = myObj1.addStrings("Good","Boy");

		assertEquals("AyushmanChaturvedi",result1);
		assertEquals("GoodBoy",result2);
	}

}

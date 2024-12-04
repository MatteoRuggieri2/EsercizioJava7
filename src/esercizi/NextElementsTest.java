package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NextElementsTest {
	
	static int[] arrayFalse1 = new int[] {10, 10, 2, 4, 20, 20};
	static int[] arrayFalse2 = new int[] {0, 1, 2, 4, 0, 2};
	static int[] arrayTrue1 = new int[] {10, 10, 2, 4, 2, 20};
	static int[] arrayTrue2 = new int[] {1, 10, 2, 4, 20, 20};

	@Test
	void testIsArrayCorrectFalse() {
		assertEquals(false, NextElements.isArrayCorrect(arrayFalse1));
		assertEquals(false, NextElements.isArrayCorrect(arrayFalse2));
	}
	
	@Test
	void testIsArrayCorrectTrue() {
		assertEquals(true, NextElements.isArrayCorrect(arrayTrue1));
		assertEquals(true, NextElements.isArrayCorrect(arrayTrue2));
	}

}

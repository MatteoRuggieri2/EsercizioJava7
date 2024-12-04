package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NextElementsTest {
	
	static int[] arrayFalse1 = new int[] {10, 10, 2, 4, 20, 20};
	static int[] arrayFalse2 = new int[] {0, 1, 2, 4, 0, 2};
	static int[] arrayFalse3 = new int[] {10, 1, 2, 4, 0, 2};
	static int[] arrayFalse4 = new int[] {0, 1, 2, 4, 0, 20};
	static int[] arrayFalse5 = new int[] {10, 1, 2, 4, 0, 20};
	
	static int[] arrayTrue1 = new int[] {10, 10, 2, 4, 2, 20};
	static int[] arrayTrue2 = new int[] {1, 10, 2, 4, 20, 20};
	static int[] arrayTrue3 = new int[] {1, 10, 2, 20, 20, 20};
	static int[] arrayTrue4 = new int[] {10, 10, 10, 4, 0, 20};
	static int[] arrayTrue5 = new int[] {20, 20, 20, 20, 20, 20};

	@Test
	void testIsArrayCorrectFalse() {
		assertFalse(NextElements.isArrayCorrect(arrayFalse1));
		assertFalse(NextElements.isArrayCorrect(arrayFalse2));
		assertFalse(NextElements.isArrayCorrect(arrayFalse3));
		assertFalse(NextElements.isArrayCorrect(arrayFalse4));
		assertFalse(NextElements.isArrayCorrect(arrayFalse5));
	}
	
	@Test
	void testIsArrayCorrectTrue() {
		assertTrue(NextElements.isArrayCorrect(arrayTrue1));
		assertTrue(NextElements.isArrayCorrect(arrayTrue2));
		assertTrue(NextElements.isArrayCorrect(arrayTrue3));
		assertTrue(NextElements.isArrayCorrect(arrayTrue4));
		assertTrue(NextElements.isArrayCorrect(arrayTrue5));
	}

}

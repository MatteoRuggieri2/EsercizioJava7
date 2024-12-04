package esercizi;

public class NextElements {
	
	public NextElements(int[] numbersArray) {
		
		isArrayCorrect(numbersArray);
	}
	
	/* Questa funzione, dato un array in input:
	 * - torna TRUE se nell'array sono presenti SOLO due "10" consecutivi e non due 20
	 * - torna TRUE se nell'array sono presenti SOLO due "20" consecutivi e non due 10
	 * - torna FALSE negli altri casi */
	public static boolean isArrayCorrect(int[] inp) {
		int previousNumber = -1;
		boolean consecutiveTenCheck = false;
		boolean consecutiveTwentyCheck = false;
		
		// Consecutive numbers check (10, 20)
		for (int element : inp) {
			System.out.println("element: " + element);
			
			// Se l'elemento è uguale a 10 e a previousNumber
			if (element == 10 && element == previousNumber) {
				consecutiveTenCheck = true;
			}
			
			// Se l'elemento è uguale a 20 e a previousNumber
			if (element == 20 && element == previousNumber) {
				consecutiveTwentyCheck = true;
			}
						
			previousNumber = element;
		}
		
		System.out.println("consecutiveTenCheck: " + consecutiveTenCheck);
		System.out.println("consecutiveTwentyCheck: " + consecutiveTwentyCheck);
		
		/* Se sono tutti e 2 TRUE o tutti e 2 FALSE faccio return false */
		if (consecutiveTenCheck && consecutiveTwentyCheck || consecutiveTenCheck == false && consecutiveTwentyCheck == false) {
			System.out.println("Risultato: false");
			return false;
		} else {
			System.out.println("Risultato: true");
			return true;
		}
		
		
	}

}

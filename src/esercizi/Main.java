package esercizi;

public class Main {

	public static void main(String[] args) {
		
		int[] valoriFalse = new int[] {10, 10, 2, 4, 20, 20};
		int[] valoriTrue = new int[] {10, 10, 2, 4, 45, 20};
		
		NextElements nextElements1 = new NextElements(valoriFalse);
		
		System.out.println("\n--------------------------------------\n");
		
		NextElements nextElements2 = new NextElements(valoriTrue);

	}

}

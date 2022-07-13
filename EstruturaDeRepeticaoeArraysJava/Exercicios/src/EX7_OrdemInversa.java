
public class EX7_OrdemInversa {
	/*
	 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
	 * 
	 */
	public static void main(String[] args) {
		int[] vetor = {0, -5, 15, 50, 8, 4};
		
		System.out.println("Vetor: ");
		
		for (int i = (vetor.length - 1); i >= 0 ; i--) {
			System.out.print( vetor[i] + " " );
		}
		
	}
}

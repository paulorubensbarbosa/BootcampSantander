import java.util.Random;

/*
 * �a um programa que leia 20 n�metos inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
 * ao final mostre os n�meros e seus sucessores.
 */


public class EX9_NumerosAleatorios {
public static void main(String[] args) {
	Random random = new Random();
	
	int[] numerosAleatorios = new int[20];
	
	for(int i = 0 ; i < numerosAleatorios.length ; i++) {
		int numero = random.nextInt(100);
		numerosAleatorios[i] = numero;
		
	}
	
	System.out.println("N�meros aleat�rios: ");
	for (int numero : numerosAleatorios ) {
		System.out.print(numero + " ");
	}
	
	System.out.println("\nSucessores dos N�meros aleat�rios: ");
	for (int numero : numerosAleatorios) {
		System.out.print((numero + 1) + " ");
	}
	
}
}

import java.util.Random;

/*
 * ça um programa que leia 20 númetos inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * ao final mostre os números e seus sucessores.
 */


public class EX9_NumerosAleatorios {
public static void main(String[] args) {
	Random random = new Random();
	
	int[] numerosAleatorios = new int[20];
	
	for(int i = 0 ; i < numerosAleatorios.length ; i++) {
		int numero = random.nextInt(100);
		numerosAleatorios[i] = numero;
		
	}
	
	System.out.println("Números aleatórios: ");
	for (int numero : numerosAleatorios ) {
		System.out.print(numero + " ");
	}
	
	System.out.println("\nSucessores dos Números aleatórios: ");
	for (int numero : numerosAleatorios) {
		System.out.print((numero + 1) + " ");
	}
	
}
}

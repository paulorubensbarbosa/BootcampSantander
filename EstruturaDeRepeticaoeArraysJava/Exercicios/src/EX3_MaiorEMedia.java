import java.util.Scanner;

public class EX3_MaiorEMedia {
	/*
	 * Fa�a um programa que leia 5 numeros e informe o maior n�mero e a m�dia desses
	 * n�meros
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int d = 5;
		double numero;
		double soma = 0;
		double maior = 0;
		do {
			
			System.out.println("Digite "+ d +" n�meros");
			d--;
			
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			
			soma += numero;
			i++;
			
		} while (i < 5);

		System.out.println("Maior: " + maior);
		System.out.println("M�dia: " + soma/5);
	}

}

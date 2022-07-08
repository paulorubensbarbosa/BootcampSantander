import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares e a quantidade de números ímpares
 */
public class EX4_ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeNumeros;
		int count = 0;
		int numPar = 0;
		int numImpar = 0;
		System.out.println("Digite a quantidade de números");
		quantidadeNumeros = sc.nextInt();
		
		do {
			System.out.println("Digite um número: ");
			int numDigitado = sc.nextInt();
			
			if(numDigitado % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
			
			count++;
		} while (quantidadeNumeros > count);
		sc.close();
		System.out.println("Foram digitados " + numPar + " números pares");
		System.out.println("E " + numImpar + " números impares");
		
	}

}

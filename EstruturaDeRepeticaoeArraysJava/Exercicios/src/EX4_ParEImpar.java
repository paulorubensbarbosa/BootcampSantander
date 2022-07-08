import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros,
 * calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros �mpares
 */
public class EX4_ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeNumeros;
		int count = 0;
		int numPar = 0;
		int numImpar = 0;
		System.out.println("Digite a quantidade de n�meros");
		quantidadeNumeros = sc.nextInt();
		
		do {
			System.out.println("Digite um n�mero: ");
			int numDigitado = sc.nextInt();
			
			if(numDigitado % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
			
			count++;
		} while (quantidadeNumeros > count);
		sc.close();
		System.out.println("Foram digitados " + numPar + " n�meros pares");
		System.out.println("E " + numImpar + " n�meros impares");
		
	}

}

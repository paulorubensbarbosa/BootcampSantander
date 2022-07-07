import java.util.Scanner;

/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */

public class EX2_Nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;
		System.out.println("Nota");
		nota = sc.nextInt();
		
		while (nota<0 || nota >10) {
			System.out.println("Digite uma nota válida entre 0 e 10");
			nota = sc.nextInt();
			
		}
	}

}

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inv�lido
 * e continue pedindo at� que o usu�rio informe um valor v�lido.
 */

public class EX2_Nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;
		System.out.println("Nota");
		nota = sc.nextInt();
		
		while (nota<0 || nota >10) {
			System.out.println("Digite uma nota v�lida entre 0 e 10");
			nota = sc.nextInt();
			
		}
	}

}

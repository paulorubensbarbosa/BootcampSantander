import java.util.Scanner;

public class EX5_Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a tabuada que deseja: ");
		int opcao = sc.nextInt();
		
		System.out.println("Tabuada de " + opcao);
		
		for(int i = 0 ; i <= 10; i++) {
			System.out.println(opcao + " X " + i + " = " + opcao*i);
		}
				
	}
}

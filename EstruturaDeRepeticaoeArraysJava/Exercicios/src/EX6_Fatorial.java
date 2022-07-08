import java.util.Scanner;

public class EX6_Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resultado = 1;
		
		System.out.println("Digite o fatorial que deseja: ");
		int opcao = sc.nextInt();
		
		for(int i = opcao ; i > 0 ; i --) {
			resultado *= i;
		}
		
		System.out.println(opcao + "!= " + resultado);
		
	}

}

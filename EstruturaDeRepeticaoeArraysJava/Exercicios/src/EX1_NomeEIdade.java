import java.util.Scanner;

/*
	 * Faça um programa que leia confuntos de dois valores,
	 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
	 * (Pare inserindo o calor = no campo nome)
*/
public class EX1_NomeEIdade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		
		do {
		System.out.println("Digite o nome do aluno");
		nome = sc.next();
		
		if(nome.equals("0"))
			continue;
		
		
		System.out.println("Digite a idade do aluno " + nome );
		idade = sc.nextInt();
		
		System.out.println(nome);
		System.out.println(idade);
		
		} while(!nome.equals("0"));
		
		System.out.println("teste");
		
	}
	
	
}

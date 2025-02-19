package variaveis;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu Nome: ");
		nome = scan.next();//next - armazena valores tipo String
		System.out.println("Você digitou " + nome);
		
		System.out.println("Digite sua Idade: ");
		int idade = scan.nextInt();//nextInt - armazena valores tipo inteiro
		
		System.out.println("Digite sua Altura: ");
		double altura = scan.nextDouble();//nextDouble - armazzena valores tipo Double
		
		scan.close();
	}
}
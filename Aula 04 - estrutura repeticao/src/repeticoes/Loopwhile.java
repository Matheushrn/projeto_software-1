package repeticoes;

import java.util.Scanner;

public class Loopwhile {

	public static void main(String[] args) {
		//login e senha
		
		Scanner sc = new Scanner(System.in);
		String loginsalvo = "admin";
		String senhasalva = "admin";
		String login = "";
		String senha = "";
		int maxtentativa = 5;
		int tentativas = 1;
		
		while (true) {
			System.out.print("digite seu login: ");
			login = sc.nextLine();
			
			System.out.print("digite sua senha: ");
			senha = sc.nextLine();
			
			//.equals compara duas strings e ve se são verdadeiras(true/iguais)
			//.equals equivale a ==
			if (login.equals (loginsalvo) && senha.equals (senhasalva)) {
				System.out.println("Acesso libero");
				break;
			}
				else if (tentativas >= maxtentativa) {
					System.out.println("Número de tentativas excedido,Acesso bloqueado");
					break;
				}
			else {
				tentativas++;
				System.out.println("Acesso negado, tente novamente");
			}
		}
		
		
		sc.close();
	}

}

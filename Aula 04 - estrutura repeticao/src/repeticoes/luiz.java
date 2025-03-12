package repeticoes;

import java.util.Scanner;

public class luiz {

	public static void main(String[] args) {
		// Jogo de adivinhacao
		
		Scanner sc = new Scanner(System.in);
		
		//conversão de decimal para int
		int maquina =(int) (Math.random() * 10);
		//System.out.println(maquina);
		int usuario;
		
		do {
			System.out.println("Informe um número: ");
			usuario = sc.nextInt();
			if(usuario > maquina) {
				System.out.println("O número foi maior");
			}else if(usuario < maquina){
				System.out.println("O número foi menor");
			}
		}while(usuario != maquina);
		
		System.out.println("Acerto mizaravi");
		
		sc.close();
	}

}

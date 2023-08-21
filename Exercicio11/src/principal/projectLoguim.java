package principal;

import java.util.Scanner;

public class projectLoguim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loguim lg = new loguim();
		
		System.out.println("Qual seu nome");
		lg.nome = sc.nextLine();
		
		System.out.println("Qual seu email");
		lg.email = sc.nextLine();
		
		System.out.println("Qual sua senha(somente numeros)");
		lg.senha = sc.nextInt();
		
		System.out.println("Seu nome é: " + lg.nome + "email: " + lg.email + "é sua senha: " + "******");
	}

}

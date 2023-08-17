package principal;

import java.util.Scanner;

public class programaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nomeEAno ano = new nomeEAno();
		
		System.out.println("Entre com o nome");
		ano.nome = sc.nextLine();
		
		System.out.println("Entre com o ano de nasimento");
		ano.ano = sc.nextInt();
		
		System.out.println("O " + ano.nome + " tem " + (2023 - ano.ano) + " anos");
	}

}

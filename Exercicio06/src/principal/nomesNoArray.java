package principal;

import java.util.Scanner;

public class nomesNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0 ;
		
		System.out.println("Quantos nomes na lista?");
		quantidade = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[quantidade];
		
		for (int cont = 0 ; cont <nomes.length;cont++) {
			System.out.println("Digite o nome");
			nomes[cont] = sc.nextLine();
		}
		for (String nome:nomes) {
			System.out.println(nomes);
		}
	}

}

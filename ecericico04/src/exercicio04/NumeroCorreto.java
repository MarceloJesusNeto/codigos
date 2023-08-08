package exercicio04;

import java.util.Scanner;

public class NumeroCorreto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		int valor = 9;
		int usuario;
		int contador =0;
		
		System.out.println("Ecolha um numero");
		usuario = leia.nextInt();
		
		do {
			System.out.println("Ecolha um numero");
			usuario = leia.nextInt();
			contador ++;
		}
		while(usuario != valor);
		System.out.println("numero correto");
		
	}

}

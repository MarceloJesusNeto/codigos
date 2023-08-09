package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		
		System.out.println("Entre com uma nota entre 1 a 10");
		nota = sc.nextDouble();
		
		while(nota <= 0 || nota >= 10) {
			
			System.out.println("Nota invalida");
			
			System.out.println("Entre com uma nota entre 1 a 10");
			nota = sc.nextDouble();
		}
		System.out.println("Nota valida! valor informado: " + nota);
	}

}

package principal;

import java.util.Scanner;

public class CalcularMetrosQuadrados {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba os valores 
		 * de largura e comprimento do terreno
		 * e informs quantos metros quadrados ele tem
		 * utilize função
		*/
		Scanner sc = new Scanner(System.in);
		int largura ;
		int comprimento;
		
		System.out.println("Qual a largura?");
		largura = sc.nextInt();
		
		System.out.println("Qual o comprimento?");
		comprimento = sc.nextInt();
		
		System.out.println("metros quadrados: " + mult (largura,comprimento));
		
	}
	
	static int mult(int x,int y) {
		return x * y;
	}

}

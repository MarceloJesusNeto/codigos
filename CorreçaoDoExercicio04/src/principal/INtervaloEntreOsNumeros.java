package principal;

import java.util.Scanner;

public class INtervaloEntreOsNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Entre com o primeiro numero");
		num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero");
		num2 = sc.nextInt();
		
		for (int contador = num1;contador <= num2;contador++) {
			System.out.println(contador);
		}
	}

}

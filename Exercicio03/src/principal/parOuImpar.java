package principal;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);	
		
		int numero = 0;
		
		System.out.println("Escolha um numero");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
	}

}

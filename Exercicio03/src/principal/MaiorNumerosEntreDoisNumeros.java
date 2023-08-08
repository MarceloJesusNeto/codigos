package principal;

import java.util.Scanner;

public class MaiorNumerosEntreDoisNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero01;
		int numero02;
		
		System.out.println("escolha seu primeiro nuero");
		numero01 = leia.nextInt();
		System.out.println("escolha seu segundo nuero");
		numero02 = leia.nextInt();
		
		if(numero01>numero02) {
			System.out.println("esse numero e o maior " + numero01);
		}
		else {
			System.out.println("esse numero e o maior " + numero02);
		}
		
	}

}

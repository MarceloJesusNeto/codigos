package principal;

import java.util.Scanner;

public class MaiorNUmeroEntreTrêsNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int ex4numero01;
		int ex4numero02;
		int ex4numero03;
		
		System.out.println("Escolha seu primeiro numero");
		ex4numero01 = leia.nextInt();
		
		System.out.println("Escolha seu segundo numero");
		ex4numero02 = leia.nextInt();
		
		System.out.println("Escolha seu terceiro numero");
		ex4numero03 = leia.nextInt();
		
		if(ex4numero01>ex4numero02) {
			System.out.println("esse numero e o maior " + ex4numero01);
		}
		else if (ex4numero02 > ex4numero03){
			System.out.println("esse numero e o maior " + ex4numero02);
		}
		else {
			System.out.println("esse numero é o maior " + ex4numero03);
		}
		
	}

}

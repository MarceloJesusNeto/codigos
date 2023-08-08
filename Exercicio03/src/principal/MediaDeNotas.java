package principal;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int bimestre01;
		int bimestre02;
		int bimestre03;
		int bimestre04;
		
		
		System.out.println("Qual sua nota do primeiro bimestre");
		bimestre01 = leia.nextInt();
		
		System.out.println("Qual sua nota do segundo bimestre");
		bimestre02 = leia.nextInt();
		
		System.out.println("Qual sua nota do terceiro bimestre");
		bimestre03 = leia.nextInt();
		
		System.out.println("Qual sua nota do quarto bimestre");
		bimestre04 = leia.nextInt();
		
		int media = (bimestre01 + bimestre02 + bimestre03 + bimestre04)/4;
		
		System.out.println("Sua media foi: " + media);
		
		System.out.println(" ");
		
		if ( media < 6) {
			System.out.println("reprovado");
		}
		else if(media == 6 || media == 7) {
			System.out.println("Recuperação");
		}
		else if(media > 7 ) {
			System.out.print("Aprovado");
		}
		
	}

}

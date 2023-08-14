package principal;

import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double altura =0;
		double media = 0;
		
		for(int contador = 1 ; contador<11;contador ++) {
			System.out.println("Digite a altura");
			altura = sc.nextDouble();
			media = media + altura;
			//media += altura;
		}
		System.out.println("Amedia das alturas é: " +(media /4));
	}

}

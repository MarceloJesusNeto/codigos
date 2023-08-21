package principal;

import java.util.Scanner;

public class projectCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		carro cr = new carro();
		
		System.out.println("Qual o modelo?");
		cr.modelo = sc.nextLine();
		
		System.out.println("Qual o ano?");
		cr.ano = sc.nextInt();
		
		System.out.println("Qual o cor?");
		cr.cor = sc.nextLine();
		
		cr.cor = sc.nextLine();
		
		System.out.println("Qual o motor?");
		cr.motor = sc.nextLine();
		
		System.out.println("Qual o cambio?");
		cr.cambio = sc.nextLine();
		
		System.out.println("Quais são os métodos para aumentar e diminuir a velocidade");
		
		cr.informações();
	}

}

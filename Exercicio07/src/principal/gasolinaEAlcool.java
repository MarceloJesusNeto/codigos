package principal;

import java.util.Scanner;

public class gasolinaEAlcool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//variaveis que ir�o guardar a quantidade de litros quiser
		int litrosA;
		int litrosG;
		//variaveis que est�o armazenadas os pre�os
		Double pre�oA = 3.90;
		double pre�oG = 5.80;
		// e a ops�o do usuario
		String opcao;
		int oi = 0;
	
		

		// sistema de repeti��o caso o usuario erre um digito
		do {
			//sitema q pergunta para o usuario se ele que gasolina ou alcool
			System.out.println("Voc� deseja usar Alcool ou Gasolina (a/g)");
			opcao = sc.nextLine();
			//identifica��o da resposta do usuario
			if(opcao.equals("g")||opcao.equals("G")) {
				// armazenando a resposta do usuario 
				System.out.println("Quanto litros voc� deseja?");
				litrosG = sc.nextInt();
				//identifica��o da promo��o
				if(litrosG>20) {
					//calculo do pre�o junto co,=m a promo��o
					System.out.println(litrosG*(pre�oG - (pre�oG*0.06)));
					oi++;
				}
				//identifica��o da promo��o
				else if(litrosG<=20) {
					//calculo do pre�o junto com a promo��o
					System.out.println(litrosG*(pre�oG - (pre�oG*0.04)));
					oi++;
				}
			//identifica��o da resposta do usuario
			}
			else if(opcao.equals("a")||opcao.equals("A")) {
				// armazenando a resposta do usuario 
				System.out.println("Quanto litros voc� deseja?");
				litrosA = sc.nextInt();
				//identifica��o da promo��o
				if(litrosA>20) {
					//calculo do pre�o junto co,=m a promo��o
					System.out.print(litrosA*(pre�oA - (pre�oA * 0.5)));
					oi++;
				}
				//identifica��o da promo��o
				else if(litrosA<=20) {
					//calculo do pre�o junto com a promo��o
					System.out.print(litrosA*(pre�oA - (pre�oA * 0.3)));
					oi++;
				}
			}
			//caso o usuario tiver errado ele irarepetir
			else {
				System.out.println("tente novamente");
			}
		}
		while (oi==0);
	}

}

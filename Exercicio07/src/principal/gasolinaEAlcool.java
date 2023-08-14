package principal;

import java.util.Scanner;

public class gasolinaEAlcool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//variaveis que irão guardar a quantidade de litros quiser
		int litrosA;
		int litrosG;
		//variaveis que estão armazenadas os preços
		Double preçoA = 3.90;
		double preçoG = 5.80;
		// e a opsão do usuario
		String opcao;
		int oi = 0;
	
		

		// sistema de repetição caso o usuario erre um digito
		do {
			//sitema q pergunta para o usuario se ele que gasolina ou alcool
			System.out.println("Você deseja usar Alcool ou Gasolina (a/g)");
			opcao = sc.nextLine();
			//identificação da resposta do usuario
			if(opcao.equals("g")||opcao.equals("G")) {
				// armazenando a resposta do usuario 
				System.out.println("Quanto litros você deseja?");
				litrosG = sc.nextInt();
				//identificação da promoção
				if(litrosG>20) {
					//calculo do preço junto co,=m a promoção
					System.out.println(litrosG*(preçoG - (preçoG*0.06)));
					oi++;
				}
				//identificação da promoção
				else if(litrosG<=20) {
					//calculo do preço junto com a promoção
					System.out.println(litrosG*(preçoG - (preçoG*0.04)));
					oi++;
				}
			//identificação da resposta do usuario
			}
			else if(opcao.equals("a")||opcao.equals("A")) {
				// armazenando a resposta do usuario 
				System.out.println("Quanto litros você deseja?");
				litrosA = sc.nextInt();
				//identificação da promoção
				if(litrosA>20) {
					//calculo do preço junto co,=m a promoção
					System.out.print(litrosA*(preçoA - (preçoA * 0.5)));
					oi++;
				}
				//identificação da promoção
				else if(litrosA<=20) {
					//calculo do preço junto com a promoção
					System.out.print(litrosA*(preçoA - (preçoA * 0.3)));
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

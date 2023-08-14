package principal;

import java.util.Scanner;

public class Placar {

	public static void main(String[] args) {
		// primeiro criar todas as variaveis q serão usadas
		Scanner sc = new Scanner(System.in);
		String time1;
		String time2;
		int gol1;
		int gol2;
		
		//agora um comando para perguntar o que o usuario escrever nas Strings
		System.out.println("Qual o primeiro time?");
		time1 = sc.nextLine();
		
		System.out.println("Qual o segundo time?");
		time2 = sc.nextLine();
		
		//comando q pergunta a resposta para o usuario e armazena a resposta na variavel int
		System.out.println("Quantos gols o " + time1 + " tem?");
		gol1 = sc.nextInt();
		
		System.out.println("Quantos gols o " + time2 + " tem?");
		gol2 = sc.nextInt();
	
		//um sistema de verificação que dara uma resposta para o usuario dependo da sua resposta
		//se a quantidade de gols for a mesma estara empatada
		if(gol1 == gol2) {
			System.out.println("O jogo esta empatado");
		}
		//se não se a quantidade de gols do segundo time for maior que a do primeiro, o segundo esta vensendo
		else if ( gol2 > gol1) {
			System.out.println("Quem esta ganhando e: " + time2);
		}
		//se não se a quantidade de gols do primeiro time for maior que a do segundo, o primeiro esta vensendo
		else if (gol1 > gol2) {
			System.out.println("Quem esta ganhando e: " + time1);
		}
	}

}

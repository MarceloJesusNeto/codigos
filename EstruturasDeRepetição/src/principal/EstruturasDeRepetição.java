package principal;

import java.util.Scanner;

public class EstruturasDeRepeti��o {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * Uma estrutura de repeti��o
		 * repete determinado ploco de codigos enquanto
		 * uma condi��o for satisfeito
		 */
		
		//for = at� utilizado quando a gente sabe quantas vezes que sera nessesario repetir o bloco
		
		
		for(int contador = 0; contador<=10;contador++) {
			System.out.println("Contador esta valendo " + contador);
		}
		
		
		/*while = enquanto
		 * geralmente usado quando n�o sabemos a quantidade de 
		 * veses que esta esecultando determinado comando 
		 s*/
		
		int contador = 0;
		char opcao;
		
		System.out.println("Deseja entrar no lup (s/n)");
		opcao = leia.next().charAt(0);
		
		if(opcao == 's') {
			while(opcao == 's');{
				System.out.println("Contador esta valendo " + contador);
				contador ++;
				System.out.println("Deseja continuar com o loop (s/n)");
				opcao = leia.next().charAt(0);
			}
		}
		
		/*do whit
		 * execulta pelomenos uma vez, temos a garantia de que sera
		 * ezecultado ao menos uma vez 
		 */
		
		do {
			System.out.println("contador valendo " + contador);
			contador ++;
			System.out.println("deseja continuar com o loop? (s/n)");
			opcao = leia.next().charAt(0);
		}while(opcao == 's');
		
		
		
		
	}

}

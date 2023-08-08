package principal;

import java.util.Scanner;

public class anoBisesto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano = 0;
		
		System.out.println("Entre com o ano para saber se é bisessto");
		ano = leia.nextInt();
		
		if(ano % 4 == 0 && ano % 100 1== 0{
			System.out.println("É um ano bisisesto");
		}
		else if (ano % 400 == 0) {
			System.out.println("Não é um ano bisesto");	
		}
		
		
		
	}

}

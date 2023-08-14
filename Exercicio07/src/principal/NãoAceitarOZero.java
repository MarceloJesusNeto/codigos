package principal;

import java.util.Scanner;

public class NãoAceitarOZero {

	public static void main(String[] args) {
		// primeiro tem que criar todas as variaveis que serão usadas
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		//coloquei um do whike dentro de um do while para ele fazer um loopn que so sera quebrado quando o usuario colocar um numero diferente de 0 
		do {
			do {
				
				//aqui ele faz uma pegunta aou usuario aonde ele pergunta um numero e armazena na variavel int num1  
				System.out.println("Digite seu primeri numero, seu numero não pode ser 0");
				num1 = sc.nextDouble();
		
				//se o primeiro numero for igual a zero ele ira fazer novamente as perguntas
			}while(num1 == 0);
			
			//aqui ele faz uma pegunta aou usuario aonde ele pergunta um numero e armazena na variavel int num2  
			System.out.println("Digite seu segundo numero, seu numero não pode ser 0");
			num2 = sc.nextDouble();
			
			//se o segundo numero for igual a zero ele ira fazer novamente as perguntas
		}while(num2 == 0);
		
		//depois ele de sair do loopn ele divide os dois numeros armazenados nas variaves num
		System.out.println((num1 / num2));
	}

}

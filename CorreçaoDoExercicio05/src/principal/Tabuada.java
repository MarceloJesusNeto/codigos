package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char operacao;
		int numero= 0;
		
		System.out.println("Qual o tipo de operação(+,-,*,/)");
		operacao = sc.next().charAt(0);
		
		System.out.println("Qual o numero que deseja realizar a tabuada");
		numero = sc.nextInt();
		switch (operacao){
			case '+':
				for (int contador = 1; contador <= 10; contador++) {
					System.out.println(numero + "+" + contador + "=" + (contador + numero));
				}
				break;
			case '-':
				int aux = numero;
				for (int contador = 1; contador <= 10; contador++) {
					System.out.println((aux + contador) + "-" + numero + "=" + ((aux + contador)-numero));
				}
				break;
			case '*':
				for (int contador = 1; contador <= 10; contador++) {
					System.out.println(numero + "*" + contador + "=" + (contador * numero));
				}	
				break;
			case '/':
				for (int contador = 1; contador <= 10; contador++) {
					System.out.println(numero + "/" + contador + "=" + (numero / contador));
				}
		}
		
		
	}

}

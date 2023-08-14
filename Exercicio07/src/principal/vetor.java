package principal;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] numero = new int [20];
		int soma = 0;
		
		for (int cont = 0; cont ==20;cont++) {
			System.out.println("Entre o numero: ");
			numero[cont] = sc.nextInt();
			while(numero[cont]<0) {
				System.out.println("Numero invalido.");
				System.out.println("Entre o numero: ");
				numero[cont]= sc.nextInt();
			}
			soma += numero[cont];
		}
		System.out.println("A soma dos numeros: " + soma);
		
		System.out.println("numeros digitados: ");
		for (int numeros:numero) {
			System.out.println(numero);
		}
	}

}

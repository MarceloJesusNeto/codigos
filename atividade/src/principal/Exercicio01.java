package principal;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		// Exercicio01

		Scanner leia = new Scanner(System.in);
		
		int numero;
		double total;
		double distancia;
		double consumo;
		
		System.out.println("Digite seu numero de telefone aqui:");
		numero = leia.nextInt();
		
		System.out.println("o numero digitado aqui foi: " + numero);
		
		System.out.println(" ");
		
		System.out.println("qual e a media de consumo do seu carro?");
		consumo = leia.nextDouble();
		
		System.out.println("qual a distanca a ser percorida?");
		distancia = leia.nextDouble();
		
		total = distancia / consumo ;
		
		System.out.print("você ira gasta " + total + " litros de gasolina");
		
		leia.close();
		
		
	}

}

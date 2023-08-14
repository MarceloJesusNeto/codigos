package principal;

import java.util.Scanner;

public class MediaComArrey {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double[] notas = new double[4];
		
		System.out.println("entre com o nome do aluno");
		String nome = sc.nextLine();
		
		for (int cont = 0 ; cont < notas.length;cont++) {
			System.out.println("Entre com a nota: ");
			notas[cont] = sc.nextDouble();
		}
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) /4;
		if(media < 7) {
			System.out.printf("Amedi do " + nome + " é: %2f " + media + "reprovado");
		}
		else {
			System.out.printf("Amedi do " + nome + " é: %2f " + media + "aprovado");
		}
		
	}

}

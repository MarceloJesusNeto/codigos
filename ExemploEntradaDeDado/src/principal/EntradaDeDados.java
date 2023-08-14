package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Por Favor Digite seu nome");
		//leitura de dados tipo String (Conjunto de caracteri)
		nome = leia.nextLine();
		
		System.out.println("digite a sua idade");
		idade = leia.nextInt();
		
		System.out.println("digite sua altura");
		altura = leia.nextDouble();
		
		System.out.println("qual o sexo (M/F)");
		sexo = leia.next().charAt(0);
		
		System.out.print("Nome digitado foi: "+nome);
		System.out.print(" A idade digitada foi: " + idade);
		System.out.print(" Altura digitada foi: " + altura);
		System.out.println(" O sexo digitado foi: " + sexo);
		
		
		leia.close();
		
	}

}

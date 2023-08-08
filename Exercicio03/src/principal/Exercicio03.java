package principal;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero;
		
		
		
		//Execicio 02
		
		System.out.println("ecolha um numero");
		numero = leia.nextInt();
		double resultado = numero / 2;
		
		System.out.println(resultado);
		
		//Exxecicio03
		
		int numero01;
		int numero02;
		
		System.out.println("escolha seu primeiro nuero");
		numero01 = leia.nextInt();
		System.out.println("escolha seu segundo nuero");
		numero02 = leia.nextInt();
		
		if(numero01>numero02) {
			System.out.println("esse numero e o maior " + numero01);
		}
		else {
			System.out.println("esse numero e o maior " + numero02);
		}
		
		//Exercicio04
		
		int ex4numero01;
		int ex4numero02;
		int ex4numero03;
		
		System.out.println("Escolha seu primeiro numero");
		ex4numero01 = leia.nextInt();
		
		System.out.println("Escolha seu segundo numero");
		ex4numero02 = leia.nextInt();
		
		System.out.println("Escolha seu terceiro numero");
		ex4numero03 = leia.nextInt();
		
		if(ex4numero01>ex4numero02) {
			System.out.println("esse numero e o maior " + ex4numero01);
		}
		else if (ex4numero02 > ex4numero03){
			System.out.println("esse numero e o maior " + ex4numero02);
		}
		else {
			System.out.println("esse numero é o maior " + ex4numero03);
		}
		
		/*
		//Execicio05
		
		int ex5numero01;
		int ex5numero02;
		int ex5numero03;
		int ex5numero04;
		
		System.out.println("escolha um numero");
		ex5numero01 = leia.nextInt();
		
		System.out.println("escolha um numero");
		ex5numero02 = leia.nextInt();
		
		System.out.println("escolha um numero");
		ex5numero03 = leia.nextInt();
		
		System.out.println("escolha um numero");
		ex5numero04 = leia.nextInt();
		
		if(ex5numero01>ex5numero02 && ex5numero03>ex5numero04) {
			System.out.println(ex5numero01 + ex5numero02 + ex5numero03 + ex5numero04);
		}
		else if(ex5numero04>ex5numero01 && ex5numero02>ex5numero03) {
			System.out.println(ex5numero01 + ex5numero02 + ex5numero04 + ex5numero03);
		}
		else if(ex5numero01<ex5numero02 && ex5numero03<ex5numero04) {
			System.out.println(ex5numero02 + ex5numero01 + ex5numero04 + ex5numero03)
		}
		else if(ex5numero03>ex5numero01 && ex5numero02<ex5numero04) {
			System.out.println(ex5numero03 + ex5numero01 + ex5numero04 + ex5numero02)
		}
		*/
		
		//Exercicio06
		
		String sexo;
		
		System.out.println("qual e o seu sexo");
		sexo = leia.next();
		
		if(sexo.equals("M")) {
			System.out.println("seu sexo e masculino");
		}
		else if(sexo.equals("F")) {
			System.out.println("seu sexo e Feminino");
		}
		else if(sexo.equals("m")) {
			System.out.println("seu sexo e masculino");
		}
		else if(sexo.equals("f")) {
			System.out.println("seu sexo e Feminino");
		}
		else {
			System.out.print("Não identificado, tente novamente");
		}
		
		//Exercicio07
		
		int bimestre01;
		int bimestre02;
		int bimestre03;
		int bimestre04;
		
		
		System.out.println("Qual sua nota do primeiro bimestre");
		bimestre01 = leia.nextInt();
		
		System.out.println("Qual sua nota do segundo bimestre");
		bimestre02 = leia.nextInt();
		
		System.out.println("Qual sua nota do terceiro bimestre");
		bimestre03 = leia.nextInt();
		
		System.out.println("Qual sua nota do quarto bimestre");
		bimestre04 = leia.nextInt();
		
		int media = (bimestre01 + bimestre02 + bimestre03 + bimestre04)/4;
		
		System.out.println("Sua media foi: " + media);
		
		System.out.println(" ");
		
		if ( media < 6) {
			System.out.println("reprovado");
		}
		else if(media == 6 || media == 7) {
			System.out.println("Recuperação");
		}
		else if(media > 7 ) {
			System.out.print("Aprovado");
		}
	}

}

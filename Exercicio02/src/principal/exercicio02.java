package principal;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*   Exercicio 02
		 * Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		   Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		   Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).
		   Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		 */
		Scanner leia = new Scanner(System.in);
		
		int bimestre01;
		int bimestre02;
		int bimestre03;
		int bimestre04;
		double ganhaPorHora;
		double trabalhoMes;
		int fahren;
		int number1;
		int number2;
		int soma;
		int Cfahren;
		int Ccelsius;
		
		System.out.println("Primeiro Exercicio");
		
		System.out.println("escolha seu primeiro numero");
		number1 = leia.nextInt();
		
		System.out.println("escolha seu segundo numero");
		number2 = leia.nextInt();
		
		soma = number1 + number2;
		
		System.out.println("a soma dos numeros e igual �:" + soma);
		
		System.out.println(" ");
		System.out.println("Segundo Exercicio");
		System.out.println(" ");
		
		System.out.println("Qual a sua nota do primeiro bimestre");
		bimestre01 = leia.nextInt();
		
		System.out.println("Qual a sua nota do primeiro bimestre");
		bimestre02 = leia.nextInt();
		
		System.out.println("Qual a sua nota do primeiro bimestre");
		bimestre03 = leia.nextInt();
		
		System.out.println("Qual a sua nota do primeiro bimestre");
		bimestre04 = leia.nextInt();
		
		int media = (bimestre01 + bimestre02 + bimestre03 + bimestre04) / 4; 
		
		System.out.println("Sua media �:" + media);
		
		System.out.println(" ");
		System.out.println("Terceiro Exercicio");
		System.out.println(" ");
		
		System.out.println("Quanto voc� ganha por hora?");
		ganhaPorHora = leia.nextInt();
		
		System.out.println("Quanto tempo voc� trabalha em um m�s?");
		trabalhoMes = leia.nextInt();
		//trabalhoMes = trabalhoMes * 30;
		
		double total = trabalhoMes * ganhaPorHora;
		
		System.out.println("Voc� ganha o total de:" + total);
		
		System.out.println(" ");
		System.out.println("Quarto exercicio");
		System.out.println(" ");
		
		System.out.println("quantos fahrenheit?");
		fahren = leia.nextInt();
		int celsius = (fahren - 32) * 5/9;
		
		System.out.println("Esta " + celsius + " graus celsius");
		
		System.out.println("quantos graus ceusius?");
		Ccelsius = leia.nextInt();
		Cfahren = (Ccelsius * 9/5) + 32;
		
		System.out.println("Esta " + Cfahren + " fahrenheits");
		
	}

}

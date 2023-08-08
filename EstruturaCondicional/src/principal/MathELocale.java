package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		final Locale ponto = new Locale("en" , "us");
		Scanner leia = new Scanner(System.in);
		
		
		double altura = 0;
		double divisao = 10.33333;
		
		System.out.println(Math.pow(2, 5));
		
		System.out.println(Math.max(2, 10));
		
		System.out.println(Math.round());
		
		System.out.println(Math.F1);
		
		//usar printf para definir quantos zeros teram depois da virgula 
		// eo %.2f   ,
		System.out.printf("Resultao: %.2f", divisao);
		
		System.out.println("Entre com sua altura: ");
		altura = leia.useLocale(ponto).nextDouble();
		
		System.out.println("A altura digitada foi: " + altura);
		
		leia.close();
		
	}

}

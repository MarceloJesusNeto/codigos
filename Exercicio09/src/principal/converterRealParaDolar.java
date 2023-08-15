package principal;

import java.util.Scanner;

public class converterRealParaDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double real;
		double dolar;
		String opcao;
		
		System.out.println("voce quer converter real para dolar? (y/n)");
		opcao = sc.nextLine();
		
		if(opcao.equals("y")) {
			System.out.println("converção de reais para dolar");
			System.out.println();
			
			System.out.println("quantos reais?");
			real = sc.nextDouble();
			
			System.out.println("quanto esta valendo o dolar?");
			dolar = sc.nextDouble();
			
			System.out.println(realdolar(real,dolar));
		}
		else if(opcao.equals("n")) {
			System.out.println("converção de dolar para reais");
			System.out.println();
			
			System.out.println("quantos dolares?");
			real = sc.nextDouble();
			
			System.out.println("quanto esta valendo o real?");
			dolar = sc.nextDouble();
			
			System.out.println(dolarreal(real,dolar));
		}
	}
	static double realdolar(double real,double dolar) {
		return (real*dolar);
	}
	static double dolarreal(double x , double y) {
		
		return (x/y);
	}
	
}

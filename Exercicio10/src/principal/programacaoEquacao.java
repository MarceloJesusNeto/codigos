package principal;

import java.util.Scanner;

public class programacaoEquacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EquacaoDoPrimeiroGrau equacao = new EquacaoDoPrimeiroGrau();
		
		System.out.println("Entre com o primeiro numero");
		equacao.a = sc.nextInt();
		System.out.println("Entre com o segundo numero");
		equacao.b = sc.nextInt();
		System.out.println("Entre com o terceiro numero");
		equacao.c = sc.nextInt();
		
		int a = (equacao.b*2)-4*equacao.a*equacao.c;
		int e =2*equacao.a;
		int o =(int) (((equacao.b - equacao.b - equacao.b) + Math.sqrt(a))/e);
		int u = (int) (((equacao.b - equacao.b - equacao.b) - Math.sqrt(a))/e);
		
		System.out.println("(" + o + ", " + u + ")");
	}

}

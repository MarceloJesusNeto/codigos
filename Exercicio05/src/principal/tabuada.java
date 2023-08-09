package principal;

import java.util.Scanner;
import java.util.regex.Pattern;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numeroUsuario = 0;
		char usuario;
		int so = 0;
		int sub = 11;
		int mul = 0;
		double div = 0;
		int oi = 0;
		
		
		
		do {
			System.out.println(" ");
			System.out.println("escolha um entre os operaores (+, -, /, *)");
			usuario = sc.next().charAt(0);
			
			System.out.println("escolha um numero para sua tabuada ");
			numeroUsuario = sc.nextInt();
			
			if (usuario == '+') {
				for( so = 1;so <=10;so++) {
					System.out.println(numeroUsuario + " + " + so + " = " + (so + numeroUsuario));
				}
			}
			else if(usuario == '-') {

				for(sub = 0;sub <=10;sub++) {
					System.out.println(numeroUsuario + " - " + sub + " = " + (numeroUsuario - sub));
				}
			}
			else if (usuario == '*') {
				for( mul = 1;mul <=10;mul++) {
					System.out.println(numeroUsuario+ " x " + mul + " = " + (mul * numeroUsuario));
				}
			}
			else if (usuario == '/') {
				for( div = 1;div <=10;div++) {
					System.out.println(numeroUsuario+ " % " + div + " = " + (numeroUsuario / div));
				}
			}
			else {
				System.out.println("temte novamente");
			}
		}while(oi == 0);
		
	}

}

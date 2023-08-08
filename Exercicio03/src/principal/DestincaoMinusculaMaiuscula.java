package principal;

import java.util.Scanner;

public class DestincaoMinusculaMaiuscula {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String sexo;
		
		System.out.println("qual e o seu sexo(M/F)");
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
		
		
		

	}

}

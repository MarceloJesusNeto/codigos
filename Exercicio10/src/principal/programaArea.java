package principal;

import java.util.Scanner;

public class programaArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		calcularArea area = new calcularArea();
		
		System.out.println("Entre com uma altura");
		area.altura = sc.nextInt();
		
		System.out.println("Entre com uma base");
		area.base = sc.nextInt();
		
		System.out.println( "(" + area.altura + "+" + area.base + ")"+"/"+"2" + " = " +(area.altura + area.base)+"/"+"2" + " = " + ((area.altura + area.base)/2) );
		
		;

	}

}

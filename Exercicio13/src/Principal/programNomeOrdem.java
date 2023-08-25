package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class programNomeOrdem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1;
		String nome2;
		String nome3;
		String nome4;
		String nome5;
		
		System.out.println("Entre com o primeiro nome");
		nome1 = sc.nextLine();
		
		System.out.println("Entre com o segundo nome");
		nome2 = sc.nextLine();
		
		System.out.println("Entre com o terceiro nome");
		nome3 = sc.nextLine();
		
		System.out.println("Entre com o quarto nome");
		nome4 = sc.nextLine();
		
		System.out.println("Entre com o quinto nome");
		nome5 = sc.nextLine();
		
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		nomes.add(nome4);
		nomes.add(nome5);
		
		Collections.sort(nomes);
		
		nomes.forEach(negoso -> System.out.println(negoso));
		
		
	}

}

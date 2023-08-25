package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		/*Listas trabalham com dadso do mesmo tipo
		 Uma lista e um tipo generico de ua collection
		 uma lisa de é uma coleção de dados 
		 */
		ArrayList<String> nomes = new ArrayList<>();
		
		String nomel = "Adicionar por ultimo";
		
		nomes.add("marcelo");
		nomes.add("julia");
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add(nomel);
		
		System.out.println(nomes);
		System.out.println(nomes.get(0));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		System.out.println("imprimir com forEach:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("imprimir com for:");
		for (int i = 0 ;i<nomes.size();i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("imprimir com expressão lambda:");
		
		//pesquisem sobre expressão lambda
		nomes.forEach(nome -> System.out.println(nome));
		
		
		System.out.println("Imprimir ordenadamente: ");
		
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
		
	}

}

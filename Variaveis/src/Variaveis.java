

public class Variaveis {

	public static void main(String[] args) {
		int numero;
		numero = 10;

		if (numero >= 10) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}

		System.out.println(numero);
		double decimal = 10.50;
		double testeNovoNumero = 10;
		int testeNumero = (int) 50.25;

		// IMPORTANTE
		// aspas duplas para string
		String nome = "Marcelo de Jesus";
		// aspas simples para char
		char sexo = 'M';
		// booleanos = valores verdadeiros ou falssos
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(decimal);
		System.out.println(testeNovoNumero);
		System.out.println(testeNumero);
		System.out.println(sexo);
		System.out.println(nome);
		System.out.print(verdadeiro);
		System.out.println(falso);
		System.out.print("nome:");
		System.out.println("Marcelo M");
		
		/*para oranizar o odigo usamos o
		 * crtl + shift + F
		 */

		int anos = 17;
		int peso = 100;
		
		System.out.println("*********************");
		
		System.out.print("Meu nome e:" + nome + "tenho" + " " + anos + " " + "anos");
		System.out.print(", peso " + peso + "kg");
		System.out.print(", sou do sexo " + sexo);
		
		
	}

}

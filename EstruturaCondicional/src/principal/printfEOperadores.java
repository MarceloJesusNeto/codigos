package principal;

public class printfEOperadores {

	public static void main(String[] args) {
		
		String nome = "Marcelo de Jesus";
		int idade = 17;
		double altura = 1.83;
		boolean falso = false;
		
		
		//para o tipo char usa %o, e /n pra ele quebrar uma linha
		System.out.printf("%s , tem %d, e sua altura é: %.2f", nome, idade, altura );
		
		/*operador de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * |= diferentw
		 * == igual
		 */
		
		/* operadores logicos
		 * && significa E
		 * || significa ou
		 * | significa negação
		 */
		
		//se em ingles e if
		/*
		if(verdadeiro || falso) {
			System.out.println(10);
		}
		else {
			System.out.println(20);
		}
		*/
		char opcao = 's';
		int idades = 18;
		String diaSemana = "sexta";
		
		if (opcao == 's' && idades >= 18) {
			System.out.println("Pode entrar na festa");
		}
		else {
			System.out.println("Proibido entrar");
		}
			
		
		if (diaSemana.equals ("segunda")) {
			System.out.println("Segunda-feira");
		}
		else if (diaSemana.equals("terça")) {
			System.out.println("Terça-feira");
		}
		else if (diaSemana.equals("sexta")) {
			System.out.println("Sexta-feira");
		}
		else {
			System.out.println("Não corresponde a um dia da semana");
		}
		
		switch(diaSemana) {
		case 1:
			System.out.print("domingo");
			break;
		case 2:
			System.out.print("segunda");
			break;	
		case 3:
			System.out.print("terça");
			break;
		case 4:
			System.out.print("quarta");
			break;
		case 5:
			System.out.print("quinta");
			break;
		case 6:
			System.out.print("sexta");
			break;
		case 7:
			System.out.print("sabado");
			break;
		default:
			System.out.print("Não corresponde a um dia da semana");
		}
	}

}

package principal;

import entities.pessoa;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoa pessoa = new pessoa();
		
		pessoa.setNome("Marcelo"); 
		pessoa.calcularIdade(2006);;
		
		pessoa.imprimeDados();
	}

}

package principal;

import entittes.funcionario;
import entittes.pessoa;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + shift + o
		pessoa pessoa = new pessoa();
		pessoa func = new funcionario(); 
		/*
		pessoa.setNome("Marcelo");
		pessoa.setAltura(1.83);
		pessoa.setCpf("486.684.351.12");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(17);
		
		System.out.println(pessoa);
		
		System.out.println("Dados pessoais empresa: ");
		
		func.setNome("Marcelo");
		func.setAltura(1.83);
		func.setCpf("486.684.351.12");
		func.setGenero("Masculino");
		func.setIdade(17);
		func.setSalario(15.000);
		func.setEmpresa("Minha preguiça minha vida");
		
		System.out.println(func);
		*/
		int[] numeros = new int [5];
		int cont = 10;
		for (int i = 0 ; i < 5;i++) {
			numeros[i] = cont++;
		}
		
		for (int n :numeros) {
			System.out.println(n);
		}
		
	}

}

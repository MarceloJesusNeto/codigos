package principal;

import entities.conta;

public class programConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conta conta = new conta();
		
		conta.setTitular("Marcelo");
		//System.out.println("nome do titular: " + conta.getTitular());
		conta.setAgencia("2561-x");
		conta.setConta(6610);
		conta.setSaldo(30.00);
		
		conta.depositar(300.00);
		
		conta.obterDadosBancoarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosBancoarios();
		
		//conta.saldo = 500.00;
		
		conta.obterDadosBancoarios();
		
	}

}

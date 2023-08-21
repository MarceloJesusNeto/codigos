package entities;

public class conta {

	
	private String titular;
	private String agencia;
	private int numeroConta;
	private double saldo;
	
	//get == obter
	public String getTitular() {
		return titular;
	}
	
	//set == atribui valor 
	//this identifica o atriuta da classe
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setConta(int numeConta) {
		this.numeroConta = numeConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//atalho = alt + shift
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	public  void sacar (double valorSaque) {
		saldo -= valorSaque;
	}
	
	public void obterDadosBancoarios() {
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
}

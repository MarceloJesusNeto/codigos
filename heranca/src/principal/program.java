package principal;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conta cc = new conta();
		conta conta = new conta();
		polpanca cp = new polpanca();
		
		conta.setTitular("Marcelo");
		conta.setAgencia(123456);
		conta.setNumeroConta(55522);
		conta.depositar(150.00);
		conta.sacar(50.00);
		
		conta.dadosBancarios();
		
		System.out.println("Conta corrente: ");
		
		cc.setTitular("Marcelo");
		cc.setAgencia(123456);
		cc.setNumeroConta(55522);
		cc.depositar(550.00);
		cc.sacar(250.00);
		
		
		
		
		
	}

}

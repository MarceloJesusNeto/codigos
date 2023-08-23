package principal;

public class ContaCorente extends conta{

	@Override
	public void sacar(double saque) {
		saldo -= saque + 2.00;
	}
	
}

package principal;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cadastroFuncionario fc = new cadastroFuncionario();
		cadastroFuncionario gerente = new gerencia();
		
		fc.setNome("Marcelo");
		fc.setIdade(17);
		fc.setSalarioB(1300.00);
		
		fc.dados();
		
		fc.setNome("Marcelo");
		fc.setIdade(17);
		fc.setSalarioB(5300.00);
		
		fc.dados();
	}

}

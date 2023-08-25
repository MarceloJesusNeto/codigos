package principal;

public class cadastroFuncionario {
	
	public String nome;
	public double salario;
	private int idade;
	private double bonus;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioB() {
		return salario;
	}
	public void setSalarioB(double salarioB) {
		this.salario = salarioB;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void dados() {
		System.out.print("nome: " + nome);
		System.out.print("Salario: " + salario);
		System.out.print("Idade: " + idade);
		System.out.print("Bonus: " + getBonus());
		System.out.print("Idade: " + (salario + getBonus));
	}
}

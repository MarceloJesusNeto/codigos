package entities;

public class pessoa {

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String setNome() {
		return nome;
	}


	private String nome;
	private int idade;
	
	
	
	public void calcularIdade(int anoNascimento) {
		idade = 2023 - anoNascimento;
	}
	public void imprimeDados() {
		System.out.printf("%s tem %d anos", nome, idade);
	}
	
}

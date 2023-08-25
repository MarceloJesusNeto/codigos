package Principal;

import java.util.Comparator;

public class produtosEQuantidade {

	private String produtos;
	private int quantidade;
	private double preco;
	 
	public produtosEQuantidade(String produtos, int quantidade) {
		super();
		this.produtos = produtos;
		this.quantidade = quantidade;
	}
	
	public produtosEQuantidade(String produtos, int quantidade, double preco) {
		super();
		this.produtos = produtos;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public produtosEQuantidade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getProdutos() {
		return produtos;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto :"+ produtos +"Quantidade: " + "Preço: "+ preco ;
	}
	/*
	public void CompareTo(Produto) {
		
	}
	*/
	
	
	
}

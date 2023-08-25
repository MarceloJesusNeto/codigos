package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//não ta funcionamdo ;-;
public class progranProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		nomeOrdemAlfabetica produtos;
		
		ArrayList<String> produto = new ArrayList<>();
		
		String produto1;
		/*String produto2;
		String produto3;
		int quantidade1;
		int quantidade2;
		int quantidade3;
		double preco1;
		double preco2;
		double preco3;*/
		
		new nomeOrdemAlfabetica();
		System.out.println("Entre com o primeiro nome");
		produto = setProdutos(sc.nextLine());
		
		System.out.println("Entre com a quantidade do produto");
		produto1 = setQuantidade(sc.nextLine());
		
		System.out.println("Entre com o preço do produto");
		produto1 = setPreco(sc.nextDouble());
		/*
		System.out.println("Entre com o segundo nome");
		produto1 = setProdutos(sc.nextLine());
		
		System.out.println("Entre com a quantidade do produto");
		produto1 = setQuantidade(sc.nextLine());
		
		System.out.println("Entre com o preço do produto");
		produto1 = setPreco(sc.nextDouble());
		
		System.out.println("Entre com o terceiro nome");
		produto1 = setProdutos(sc.nextLine());
		
		System.out.println("Entre com a quantidade do produto");
		produto1 = setQuantidade(sc.nextLine());
		
		System.out.println("Entre com o preço do produto");
		produto1 = setPreco(sc.nextDouble());*/
		
		produto.add(produto1);
		
		System.out.println(produto);
		/*
		ArrayList<String> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto1);
		produtos.add(produto1);
		
		Collections.sort(produtos);
		
		produtos.forEach(negoso -> System.out.println(negoso));*/
	}

	private static String setPreco(double nextDouble) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int setQuantidade(String nextLine) {
		// TODO Auto-generated method stub
		return;
	}

	private static ArrayList<String> setProdutos(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

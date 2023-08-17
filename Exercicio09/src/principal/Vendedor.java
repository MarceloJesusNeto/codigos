package principal;

import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0 ;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("nome do funcionaario");
		nome = sc.nextLine();
		
		System.out.println("qual o salario");
		salarioBruto = sc.nextDouble();
		
		calcularDes(salarioBruto, inss,irpf);
		CalcularComissao(totalVendas);
		
		double desconto = calcularDes(salarioBruto, inss,irpf);
		double comissao = CalcularComissao(totalVendas);
		double salarioLiquido = salarioBruto - desconto + comissao;
		System.out.println("********************");
		System.out.println("Funcionario: " + nome);
		System.out.println("Salario Bruto: "+salarioBruto);
		System.out.println("Totsl de vendas no mes: " + totalVendas);
		System.out.println("Desconto do mes: "+desconto);
		System.out.println("Comissao do mes: "+comissao);
		System.out.println("Salario Liquido: " + salarioLiquido);
		if (totalVendas < 10000) {
			System.out.println("não desista");
		}
		sc.close();
		
		
		
	}
	double inss;
	static double calcularDes(double salarioB, double inss , double irpf) {
		return ((salarioB * inss) + (salarioB*irpf));
	}
	static double CalcularComissao(double totalVe ) {
		double bonificacao = 0;
		
		if (totalVe > 20000) {
			bonificacao = totalVe * 0.05;
		}
		else if(totalVe >15000) {
			bonificacao = totalVe * 0.03;
		}
		else if (totalVe >10000) {
			bonificacao = totalVe * 0.01;
		}
		else {
			bonificacao = 0;
		}
		return bonificacao;
	}

}

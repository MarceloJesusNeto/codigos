package principal;

import java.util.Scanner;

public class programacaoVenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimulacaoDeVenda simu = new SimulacaoDeVenda();
		String produto;
		int quant;
		double x = 8.5;
		double y = 10.2;
		double u = ((x*4/2)+y);
		
		System.out.println(u);
		
		System.out.println("Você gostaria de comprar um computador, monitor, celular, teclado, mouse");
		produto = sc.nextLine();
		
		System.out.println("Qual a quantidade");
		quant = sc.nextInt();
		sc.nextLine();
		
		
		
		if (produto.equals("celular")) {
			String pagamento;
			
			System.out.println("você gostaria de pagar no pix, dinheiro, debito ou credito");
			pagamento = sc.nextLine();
			
			if (pagamento.equals("pix")) {
				int a = (int) (quant*(simu.precoCel - (simu.precoCel * 0.06)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("dinheiro")) {
				int a = (int) (quant*(simu.precoCel - (simu.precoCel * 0.08)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("debito")) {
				int a = (int) (quant*(simu.precoCel - (simu.precoCel * 0.05)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("credito")) {
				int a = quant * simu.precoCel;
				System.out.println("o valor total é: " + a);
			}
		}
		else if (produto.equals("computador")) {
			String pagamento;
			
			System.out.println("você gostaria de pagar no pix, dinheiro, debito ou credito");
			pagamento = sc.nextLine();
			
			if (pagamento.equals("pix")) {
				int a = (int) (quant*(simu.precoPc - (simu.precoPc * 0.06)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("dinheiro")) {
				int a = (int) (quant*(simu.precoPc - (simu.precoPc * 0.08)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("debito")) {
				int a = (int) (quant*(simu.precoPc - (simu.precoPc * 0.05)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("credito")) {
				int a = quant * simu.precoPc;
				System.out.println("o valor total é: " + a);
			}
		}
		else if (produto.equals("monitor")) {
			String pagamento;
			
			System.out.println("você gostaria de pagar no pix, dinheiro, debito ou credito");
			pagamento = sc.nextLine();
			
			if (pagamento.equals("pix")) {
				int a = (int) (quant*(simu.precoMon - (simu.precoMon * 0.06)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("dinheiro")) {
				int a = (int) (quant*(simu.precoMon - (simu.precoMon * 0.08)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("debito")) {
				int a = (int) (quant*(simu.precoMon - (simu.precoMon * 0.05)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("credito")) {
				int a = quant * simu.precoMon;
				System.out.println("o valor total é: " + a);
			}
		}
		else if (produto.equals("mouse")) {
			String pagamento;
			
			System.out.println("você gostaria de pagar no pix, dinheiro, debito ou credito");
			pagamento = sc.nextLine();
			
			if (pagamento.equals("pix")) {
				int a = (int) (quant*(simu.precoMou - (simu.precoMou * 0.06)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("dinheiro")) {
				int a = (int) (quant*(simu.precoMou - (simu.precoMou * 0.08)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("debito")) {
				int a = (int) (quant*(simu.precoMou - (simu.precoMou * 0.05)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("credito")) {
				int a = quant * simu.precoMou;
				System.out.println("o valor total é: " + a);
			}
		}
		else if (produto.equals("teclado")) {
			String pagamento;
			
			System.out.println("você gostaria de pagar no pix, dinheiro, debito ou credito");
			pagamento = sc.nextLine();
			
			if (pagamento.equals("pix")) {
				int a = (int) (quant*(simu.precoTec - (simu.precoTec * 0.06)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("dinheiro")) {
				int a = (int) (quant*(simu.precoTec - (simu.precoTec * 0.08)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("debito")) {
				int a = (int) (quant*(simu.precoTec - (simu.precoTec * 0.05)));
				System.out.println("o valor total é: " + a);
			}
			else if (pagamento.equals("credito")) {
				int a = quant * simu.precoTec;
				System.out.println("o valor total é: " + a);
			}
		}
		
		
	}

}

package principal;

import java.util.Scanner;

public class projectEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		estoque es = new estoque();
		int oi = 0;
		
		do {
		System.out.println("oque voc� gostaria de armazenar?");
		es.produto = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Qual � a quanditade do seu produto?");
		es.quantidade = sc.nextInt();
		
		es.soma();
		
		System.out.println("O total de itens armazenados s�o: " + es.total);
		}while(oi == 0);
	}

}

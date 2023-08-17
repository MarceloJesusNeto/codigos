package principal;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		//caracteristicas(atributos)
		//exemplos de comportamentos acelerar, freiar , acender, farois...
		//comportamentos(metodo/função)
		//classes tem muitos recursos como:
		//sobrecarga de metodos e construtores
		//4 pilares podem ser aplicadas
		//entidades (entidades do sistema) de acordo com a modelagem
		//de negocios:Carros, Pessoas, endereço...
		//serviços:Clientes, 
		//controlles
		//utiitarisa: Math
		//classe e um modelo
		Scanner sc = new Scanner(System.in);
		carro carro = new carro();
		carro carropopular = new carro();
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "exp-2023";
		carro.cor = "azul";
		
		carropopular.modelo = "gol";
		carropopular.cor = "vermelho";
		
		/*carropopular.ano = sc.nextLine();
		
		System.out.println(carro.ano);
		System.out.println(carropopular.ano);
		*/
		
		System.out.println(carro.acelerador);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerador);
		carro.acelerador = 10;
		
		System.out.println(carro.acelerador);
	}

}

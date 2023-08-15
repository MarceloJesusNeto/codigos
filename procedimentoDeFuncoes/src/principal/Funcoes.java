package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
			Funções representão um processamento
			ou processos
			o que identifica uma função os parentesses
			System.out.println() e um exemplo de funções/procedimento
		*/
		 mostrarMensagemComParametro(33);
		 mostrarMensagem();
		 System.out.println(calcular());
		 int cal = calcular();
		 
		 System.out.println("5 + 10 é : " + cal);
		 
		 System.out.println(calcular()+aoba());
		 
		 System.out.println("Resultado da soma: " + soma(10 ,20));
		 
		 int x = 20;
		 int y = 200;
		 
		 System.out.println("Nova soma: " + soma(x,y));
	}

	static void mostrarMensagem(){
		System.out.println("Minha função");
		
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("minha idade e: " + idade);
	}
	static int calcular( ) {
		int x = 10;
		int y = 5;
		return x+y;	
	}
	static int aoba() {
		int x = 38;
		int y = 12;
		return x-y;
	}
	
	static int soma(int x ,int y) {
		return x + y;
	}
}

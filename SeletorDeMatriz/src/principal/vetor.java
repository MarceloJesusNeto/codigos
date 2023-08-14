package principal;

public class vetor {

	public static void main(String[] args) {
		// Vetor é uma sequencia não moederada de dados do tipo 
		// a contagem do vetor e por indice a iniciante do indice 0
		//Vetor não pode conter dados de tipos diferemtes
		//vetor tbm é conhecido como Arrey
		//Vetor é unidimencional, uma direção
		//os dados do array são armazenados em um espaço de memoria
		
		/* (xpto123) = 10 , 20 , 30 , 40
		 * 
		 */
		
		int[] numeros = new int[5];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		//numeros[5] = 10;
		
		System.out.println(numeros[0]);
		/*
		for (int contador = 0; contador < numeros.length ;contador++) {
			System.out.println("Dentro do for: " + numeros[contador]);
		}
		*/
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}

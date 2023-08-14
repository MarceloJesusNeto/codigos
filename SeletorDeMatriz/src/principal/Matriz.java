package principal;

public class Matriz {

	public static void main(String[] args) {
		// Uma matriz e um vetor multidimensional
		//geralmente trabalhamos com 2 dimensões
		//linha e coluna, parece uma tabela 
		
		//os dois ulimos abree fecha coulchtes são 
		//par indicar linha e coluna
		//no exemplo abaixo temos uma matriz de 3 x 3
		int[][] numeros = new int[3][3];
		int i;
		int j;
		int contador = 10;
		
		for (i = 0;i < numeros.length;i++) {
			for (j =0; j < numeros.length;j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "/t");
				contador++;
			}
			System.out.println();
		}
		/*
		System.out.print((numeros[0][0] = 10) + "/t");
		System.out.print((numeros[0][1] = 11) + "/t");
		System.out.print((numeros[0][2] = 12) + "/t");
		System.out.println();
		System.out.print((numeros[1][0] = 10) + "/t");
		System.out.print((numeros[1][1] = 11) + "/t");
		System.out.print((numeros[1][2] = 12) + "/t");
		System.out.println();
		System.out.print((numeros[2][0] = 10) + "/t");
		System.out.print((numeros[2][1] = 11) + "/t");
		System.out.print((numeros[2][2] = 12) + "/t");
		System.out.println();
		*/
		/*
		 * 1) fazer uma matriz 3x3 ou 4x4 , imprimir os numeros 
		 * da diagonal dessa matriz;
		 * 2)fazer uma matriz 4x4 para inserir nome e as 4 notas 
		 * do aluno, não precisa mostrar a media. imprimir o nome e as 
		 * notas 
		 */
		/*
		numeros[0][0] = 10;
		numeros[0][1] = 11;
		numeros[0][2] = 12;
		numeros[1][0] = 10;
		numeros[1][1] = 11;
		numeros[1][2] = 12;
		numeros[2][0] = 10;
		numeros[2][1] = 11;
		numeros[2][2] = 12;
		
		System.out.println();
		*/
	}

}

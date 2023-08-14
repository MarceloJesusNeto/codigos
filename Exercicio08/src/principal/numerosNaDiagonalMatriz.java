package principal;

public class numerosNaDiagonalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] matriz = new String[3][3];
		int cont = 10;
		/*
		System.out.print(matriz[0][0] = " 10 ");
		System.out.print(matriz[0][1] = "    ");
		System.out.print(matriz[0][2] = "    ");
		System.out.println();
		System.out.print(matriz[1][0] = "    ");
		System.out.print(matriz[1][1] = " 14 ");
		System.out.print(matriz[1][2] = "    ");
		System.out.println();
		System.out.print(matriz[2][0] = "    ");
		System.out.print(matriz[2][0] = "    ");
		System.out.print(matriz[2][0] = " 18 ");
		*/
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0 ; j < matriz.length;j++) {
				if(i==j) {
					System.out.print(cont);
				}
				else {
					System.out.print("/t");
				}
				cont++;
			}
			System.out.println();
		}
		
	}

}

package principal;

import java.util.Scanner;

public class AlunoENotaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] alunos =new String[4][4];
		
		alunos[0][0] = "luan";
		alunos[0][1] = "10";
		alunos[0][2] = "5,6";
		alunos[0][3] = "7";
		alunos[0][4] = "2";
		
		alunos[1][0] = "luan";
		alunos[1][1] = "10";
		alunos[1][2] = "5,6";
		alunos[1][3] = "7";
		alunos[1][4] = "2";
		
		alunos[2][0] = "luan";
		alunos[2][1] = "10";
		alunos[2][2] = "5,6";
		alunos[2][3] = "7";
		alunos[2][4] = "2";
		
		alunos[3][0] = "luan";
		alunos[3][1] = "10";
		alunos[3][2] = "5,6";
		alunos[3][3] = "7";
		alunos[3][4] = "2";
		
		alunos[4][0] = "luan";
		alunos[4][1] = "10";
		alunos[4][2] = "5,6";
		alunos[4][3] = "7";
		alunos[4][4] = "2";
		
		for(int i = 0 ; i<alunos.length; i++) {
			for(int j = 0;j < alunos.length;j++ ) {
				System.out.print(alunos[i][j] + "/t");
			}
			System.out.println();
		}
	}

}

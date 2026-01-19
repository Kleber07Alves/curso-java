package secao10.exercicio.matrizes;

import java.util.Scanner;

public class PosicoesMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Numero de linhas: ");
		int l = scanner.nextInt();
		System.out.println("Numero de colunas: ");
		int c = scanner.nextInt();
		
		int [][] mat = new int [l][c];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length;j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("What value will be search:");
		int valueSearch = scanner.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length;j++) {
				if(mat[i][j] == valueSearch) {
					System.out.println("Position: " + i + ", " + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					} else {}
					if(j < c-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}else {}
					if(i >  0) {
						System.out.println("UP: " + mat[i-1][j]);
					}else {}
					if(i  < l-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}else {}
					
				}
			}
		}
		
		
		
		
		scanner.close();
	}

}

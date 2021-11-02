package application;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];         // instanciando matriz
		
		for (int i=0; i<mat.length; i++) {           //percorre e preenche as linhas
			for (int j=0; j<mat[i].length; j++) {       //percorre e preenche as colunas
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + "  ");  //imprimindo diagonal principal
		}
		System.out.println();
		
		int count = 0;
		
		for (int i=0; i<mat.length; i++) {            //percorre a matriz e conta numeros negativos
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0 ) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
	sc.close();	
	}

}

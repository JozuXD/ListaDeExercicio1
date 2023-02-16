package pacotes;

import java.util.Scanner;

public class arayMatriz {

	public static void main(String[] args) {
		
		int [][] valor = new int [3][3];
		int linha,coluna,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um valor: ");
				valor[linha][coluna] = leia.nextInt();
				somaValor += valor[linha][coluna];
			}
		}
		
		System.out.println("\nSomatorio dos valores da matriz foi de: +"+somaValor);
	}

}

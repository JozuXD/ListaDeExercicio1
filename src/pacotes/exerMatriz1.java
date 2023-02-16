package pacotes;

import java.util.Scanner;

public class exerMatriz1 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		int linha,coluna,soma1=0,soma2=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com o valor: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("\n diagonal principal:");
		for (linha = 0; linha <3;linha++) {
			System.out.print(matriz[linha][linha]+"  ");
			soma1 += matriz[linha][linha];
		}
		System.out.println("\n diagonal secundaria:");
		for (linha = 0; linha <3;linha++) {
			System.out.print(matriz[linha][3 - 1 - linha ]+"  ");
			soma2 += matriz[linha][3 - 1 - linha];
		}
		System.out.println("\n soma da diagonal principal: "+soma1);
		System.out.println("\n soma da diagonal principal: "+soma2);
	}

}

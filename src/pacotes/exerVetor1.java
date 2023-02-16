package pacotes;

import java.util.Scanner;

public class exerVetor1 {

	public static void main(String[] args) {
		int num [] = {2,5,1,3,4,9,7,8,10,6};
		int n1, count,indice = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o numero que voce deseja encontrar: ");
		n1 = read.nextInt();
		
		for(count=0;count < 10; count++) {
			if (n1 == num[count]) {
				
				System.out.println("\nO numero "+n1+" esta localizado na posição: "+count);
				indice = num[count];
			}		
			
		}
		if(indice != n1) {
			System.out.println("\nO numero "+n1+" não foi encontrado!");
		}

	}

}

package pacotes;

import java.util.Scanner;

public class exerFor {

	public static void main(String[] args) {
		int number, oddNum, evenNum, x;
		oddNum = 0;
		evenNum = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite um numero inteiro: ");
			number = read.nextInt();
			
			if(number % 2 == 0) {
				evenNum++;
			}
			else {
				oddNum++;
			}
			
			
			
		}
		System.out.println("\n Total de Numeros pares: "+evenNum);
		System.out.println("\n Total de numeros impares: "+oddNum);
	}
	
}

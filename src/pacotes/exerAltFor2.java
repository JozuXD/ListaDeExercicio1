package pacotes;

import java.util.Scanner;

public class exerAltFor2 {

	public static void main(String[] args) {
		int num, count, even, odd;
		even=0;
		odd=0;
		Scanner read = new Scanner(System.in);
		
		for(count=1;count<=10;count++) 
		{
			System.out.println("Digite um numero: ");
			num = read.nextInt();
			
			if (num % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Voce digitou "+even+" numeros pares.");
		System.out.println("Voce digitou "+odd+" numeros impares.");
	}

}

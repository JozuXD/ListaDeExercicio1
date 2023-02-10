package pacotes;

import java.util.Scanner;

public class exerFor2 {

	public static void main(String[] args) {
		int Num1, Num2, count;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite 2 numeros inteiro, sendo o primeiro menor que o segundo munero: ");
		
		System.out.println("\nDigite o primeiro numero: ");
		Num1 = read.nextInt();
		
		System.out.println("\nDigite o segundo numero: ");
		Num2 = read.nextInt();
		
		if (Num1 < Num2) {
			System.out.println("\nNo intervalo entre "+Num1+" e "+Num2);
			
			for(count=Num1;count<=Num2;count++) 
			
			{
				if(count % 3 == 0 && count % 5 ==0) {
					
					System.out.println("\n"+count+" é multiplo de 3 e 5");
					
				}
			}
		
		}
		else 
		{
			System.out.println("\nIntervalo invalido!");
		}
		
		

	}

}

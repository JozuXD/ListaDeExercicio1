package pacotes;

import java.util.Scanner;

public class exerIf {

	public static void main(String[] args) {
		
		int num1, num2, num3, soma;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero(A): ");
		num1 = read.nextInt();
		
		System.out.println("\nDigite o segundo numero(B): ");
		num2 = read.nextInt();
		
		System.out.println("\nDigite o terceiro numero(C): ");
		num3 = read.nextInt();
		
		soma = num1 + num2;
		
		if(soma > num3) {
			System.out.println("\n"+num1+" + "+num2+" = "+soma+" > "+num3);
			System.out.println("\nA soma de A + B é Maior do que C");
							
		}
		if(soma < num3) {
			System.out.println("\n"+num1+" + "+num2+" = "+soma+" < "+num3);
			System.out.println("\nA soma de A + B é Menor do que C");
							
		}
		
		if(soma == num3) {
			System.out.println("\n"+num1+" + "+num2+" = "+soma+" = "+num3);
			System.out.println("\nA soma de A + B é Igual a C");
							
		}
		
		
		

	}

}

package pacotes;

import java.util.Scanner;

public class exerDoWhile1 {

	public static void main(String[] args) {
		int num1, soma;
		soma = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o numero: ");
		num1 = read.nextInt();
		
		do {
			if (num1 > 0) {
				soma = soma + num1;
				}
			System.out.println("\nDigite o numero: ");
			num1 = read.nextInt();
		}while (num1 != 0);
		
		System.out.println("\nA soma dos numeros positivos é: "+soma);
	}

}

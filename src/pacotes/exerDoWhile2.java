package pacotes;

import java.util.Scanner;

public class exerDoWhile2 {

	public static void main(String[] args) {
		
		float num1, soma, media,count;
		soma = 0;
		count = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o numero: ");
		num1 = read.nextFloat();
		
		do {
			if (num1 % 3 ==0 ) {
				soma = soma + num1;
				count++;
				}
			System.out.println("\nDigite o numero: ");
			num1 = read.nextFloat();
		}while (num1 != 0);
		media = soma/count;
		
		System.out.println("\nA soma dos numeros positivos é: "+media);
	}

}

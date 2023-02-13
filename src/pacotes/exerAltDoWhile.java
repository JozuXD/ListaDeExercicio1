package pacotes;

import java.util.Scanner;

public class exerAltDoWhile {

	public static void main(String[] args) {
		int num, count;
		float average, total;
		total = 0;
		count = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nMedia dos numeros multiplos de 3 (para sair digite 0)");
		
		do {
			System.out.println("\nDigite um numero: ");
			num = read.nextInt();
			
			if(num % 3 == 0) {
				total = total + num;
				count++;
			}
				
		}while (num != 0);
		
		average = total/(count-1);
		
		System.out.println("\nA media dos multiplos de 3: "+average);
	}

}

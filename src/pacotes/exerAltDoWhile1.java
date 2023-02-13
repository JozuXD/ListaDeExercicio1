package pacotes;

import java.util.Scanner;

public class exerAltDoWhile1 {

	public static void main(String[] args) {
		int num, total;
		total=0;
		Scanner read = new Scanner(System.in);
		
		
		
		do{
			System.out.println("\nDigite o numero: ");
			num = read.nextInt();
			
			total += num;
		}while (num != 0);
		
		System.out.println("\nSoma dos numero é: "+total);

	}

}

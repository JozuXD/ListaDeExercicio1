package pacotes;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, cal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("\n Digite o quarto numero: ");
		n4 = leia.nextFloat();
		
		cal = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nA diferença é: %.2f",cal);
		

	}

}

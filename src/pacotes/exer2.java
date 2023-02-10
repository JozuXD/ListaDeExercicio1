package pacotes;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		float Nota1, Nota2, Nota3, Nota4, Media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		Nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		Nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		Nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		Nota4 = leia.nextFloat();
		
		Media = (Nota1 + Nota2 + Nota3 + Nota4)/4;
		
		System.out.printf("\n Sua media final é: %.2f",Media);

	}

}

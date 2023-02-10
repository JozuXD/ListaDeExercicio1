package pacotes;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float SalarioBruto, AdiNoturno, HorasExtras, Descontos, SalarioLiquido;
		
		System.out.println("\nDigite o Salário Bruto: ");
		SalarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o adicional Noturno: ");
		AdiNoturno = leia.nextFloat();
		
		System.out.println("\nDigite as horas extras: ");
		HorasExtras = leia.nextFloat();
		
		System.out.println("\nDigite os descontos: ");
		Descontos = leia.nextFloat();
		
		SalarioLiquido = SalarioBruto + AdiNoturno + (HorasExtras * 5) - Descontos;
		
		
		System.out.printf("\nSalario Liquido é: %.2f",SalarioLiquido);

	}

}

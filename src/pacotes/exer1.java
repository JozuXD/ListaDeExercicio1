package pacotes;

import java.util.Scanner;

public class exer1 {
	
	public static void main(String[] args) 
	{
		float salario, abono, NovoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o Salario: ");
		salario = leia.nextFloat();
		
		System.out.println("\nEntre com o aborno: ");
		abono = leia.nextFloat();
		
		NovoSalario = salario + abono;
		
		
	System.out.printf("\nO seu novo Salario é : %.2fR$", NovoSalario);
	}
}
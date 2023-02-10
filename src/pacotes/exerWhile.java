package pacotes;

import java.util.Scanner;

public class exerWhile {

	public static void main(String[] args) {
		int age,underAge,middleAge;
		
		underAge = 0;
		middleAge = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nColoque sua Idade: ");
		age = read.nextInt();
		
		while(age >= 0 ) {
			if (age < 21) {
				underAge++;
			}
			else if (age > 50){
				 
					middleAge++;
				
			}
			System.out.println("\nColoque sua Idade: ");
			age = read.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+underAge);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+middleAge);
	}

}

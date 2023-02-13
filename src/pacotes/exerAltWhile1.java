package pacotes;

import java.util.Scanner;

public class exerAltWhile1 {

	public static void main(String[] args) {
		int underAge, middleAge, age;
		
		underAge=0;
		middleAge=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite uma Idade: ");
		age = read.nextInt();
		
		while(age != -99){
			if (age < 21){
				underAge++;
			}
			if (age > 50){
				middleAge++;
			}
			
			System.out.println("Digite uma Idade: ");
			age = read.nextInt();
			
			}
		System.out.println("Total de pessoas acima de 50 anos: "+middleAge);
		System.out.println("Total de pessoas abaixo de 21 anos: "+underAge);
	}
	

}

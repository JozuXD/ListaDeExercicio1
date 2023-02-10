package pacotes;

import java.util.Scanner;

public class exerWhile2 {

	public static void main(String[] args) {
		int age,sex,categoria,manMob,womanFull,womanFront,back;
		String end = "s";
		back = 0;
		womanFront = 0;
		manMob = 0;
		womanFull = 0;
		Scanner read = new Scanner(System.in);
		
		
		while(end.equalsIgnoreCase("s")){
						
						
					
			System.out.println("\nDigite a Idade: ");
			age = read.nextInt();
			
			System.out.println("\nDigite o seu Sexo");
			System.out.println("\n o 1- Masculino");
			System.out.println("\n o 2- Feminino");
			System.out.println("\n o 3- Outros");
			sex = read.nextInt();
			
			System.out.println("\nCategoria: ");
			System.out.println("\n o 1- Backend");
			System.out.println("\n o 2- Frontend");
			System.out.println("\n o 3- Mobile");
			System.out.println("\n o 4- FullStack");
			categoria = read.nextInt();
			
			System.out.println("\nDeseja continuar: (S/N)");
			end = read.next();
			
			if (categoria == 1) {
				back++;
			}
			if (sex == 2 && categoria == 2) {
				womanFront++;
			}
			if (sex == 1 && age >= 40 && categoria == 3) {
				manMob++;
			}
			if (age <= 30 && sex == 2 && categoria == 4) {
				womanFull++;
			}
			
			
		}
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+back);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+womanFront);
		System.out.println("\nTotal de homens desenvolvedoras Mobile maiores de 40anos : "+manMob);
		System.out.println("\nTotal de Mulheres desenvolvedoras FullStack: "+womanFull);
		
	}

}

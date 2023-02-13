package pacotes;

import java.util.Scanner;

public class exerAltWhile2 {

	public static void main(String[] args) {
		int age, sex, kind, count;
		int calm, womanNerv, menAgg, lgbtqiaPlusCalm, middleAgeNerv, underAgeCalm;
		
		count = 1;
		calm = 0;
		womanNerv = 0;
		menAgg = 0;
		lgbtqiaPlusCalm = 0;
		middleAgeNerv = 0;
		underAgeCalm = 0;
		
		Scanner read = new Scanner(System.in);
		
		while (count<=150) {
			
			System.out.println("\nDigite a sua idade: ");
			age = read.nextInt();
			
			System.out.println("\nQual seu genero: ");
			System.out.println("\n1- Feminino");
			System.out.println("\n2- Masculino");
			System.out.println("\n3- LGBTQIA+");
			sex = read.nextInt();
			
			System.out.println("\nQue tipo de pessoa é voce: ");
			System.out.println("\n1- Calma");
			System.out.println("\n2- Nervosa");
			System.out.println("\n3- Agressiva");
			kind = read.nextInt();
			
			if (kind == 1) {
				calm++;
			}
			if (sex == 1 && kind == 2 ) {
				womanNerv++;
			}
			if (sex == 2 && kind == 3) {
				menAgg++;
			}
			if (sex == 3 && kind == 1) {
				lgbtqiaPlusCalm++;
			}
			if (age > 40 && kind == 2) {
				middleAgeNerv++;
			}
			if (age < 18 && kind == 1) {
				underAgeCalm++;
			}
			count++;
		}
		
		
		System.out.println("\nNumero de pessoas calmas: "+calm);
		System.out.println("\nNumero de mulheres nervosas: "+womanNerv);
		System.out.println("\nNumero de homens agressivos: "+menAgg);
		System.out.println("\nNumero de LGBTQIA+ calmos(a/i): "+lgbtqiaPlusCalm);
		System.out.println("\nNumero de pessoas nervosas com mais de 40 anos: "+middleAgeNerv);
		System.out.println("\nNumero de pessoas calmas com menos de 18 anos: "+underAgeCalm);
		

	}

}

package pacotes;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		float[] media = new float[4];
		float n1,n2,n3,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segundaa nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nMedia: "+media[x]);
			somaMedia += media[x];
		}
		
		mg = somaMedia / 4;
		System.out.printf("\nMedia geral da turma foi de: %.2f",mg);
		
		for(x=0;x<4;x++) {
			System.out.println("\nMedia do alune "+(x+1)+"foi de: "+media[x]);
		}
	}

}

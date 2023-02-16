package pacotes;

import java.util.Scanner;
import java.util.Stack;

public class exerStack1 {

	public static void main(String[] args) {
		
		int cod;
		String livro;
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha	= new Stack<String>();
		
		System.out.println("*********************************************");		
		System.out.println("\n1 - Adicionar Livro na Pilha");
		System.out.println("\n2 - Listar todos os Livros");
		System.out.println("\n3 - Retirar livro da pilha");
		System.out.println("\n0 - Sair");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		
		
		do {
			
			System.out.println("\nEntre com a opção desejada: ");
			cod = leia.nextInt();
			
			
			switch(cod) {
			case 1:	
				leia.nextLine();
				System.out.println("\nDigite o nome: ");
				livro = leia.nextLine();
				
				pilha.push(livro);
				
				System.out.println("\nPilha: ");
				for (String novaPilha:pilha) {
					System.out.println(novaPilha);
				}
				
				
				System.out.println("\nLivro Adicionado!");
			break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: ");
				for (String novaPilha:pilha) {
					System.out.println(novaPilha);
				}
				
			break;
			case 3:
				
				if(pilha.isEmpty() == true) {
					System.out.println("\nA Pilha esta vazia!");
				}else {
					pilha.pop();
					System.out.println("\nPilha: ");
					for (String novaPilha:pilha) {
						System.out.println(novaPilha);
					}
					
					System.out.println();
					System.out.println("\num Livro foi retirado da Pilha!");
				}
								
			break;
			case 0:
				System.out.println("\nSistema Finalizado!");
				
			break;
			default:
				System.out.println("\nOpção invalida!");
			}

		}while (cod != 0);

	}

}

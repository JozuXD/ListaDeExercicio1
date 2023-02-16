package pacotes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerQueue1 {

	public static void main(String[] args) {
		
		int cod;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println("*********************************************");		
		System.out.println("\n1 - Adicionar Cliente na Fila");
		System.out.println("\n2 - Listar todos os Cliente");
		System.out.println("\n3 - Retirar Cliente da Fila");
		System.out.println("\n0 - Sair");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		
		do {
					
			System.out.println("\nEntre com a opção desejada: ");
			cod = leia.nextInt();
			
			switch(cod) {
			case 1:	
				System.out.println("\nDigite o nome: ");
				nome = leia.next();
				fila.add(nome);
				
				System.out.println("\nFila: ");
				for (String novaFila:fila) {
					System.out.println(novaFila);
				}
				
				
				System.out.println("\nCliente Adicionado!");
			break;
			case 2:
				System.out.println("\nLista de cliente na fila: ");
				for (String novaFila:fila) {
					System.out.println(novaFila);
				}
				
			break;
			case 3:
				
				if(fila.isEmpty() == true) {
					System.out.println("\nA fila esta vazia!");
				}else {
					fila.poll();
					System.out.println("\nFila: ");
					for (String novaFila:fila) {
						System.out.println(novaFila);
					}
					
					System.out.println();
					System.out.println("\nO cliente foi Chamado!");
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

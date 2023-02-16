package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		int op;
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
			do {
				
				System.out.println("----------------------------------------------------");
				System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
				System.out.println("\n(2) Deseja remover produtos ao estoque?");
				System.out.println("\n(3) Deseja atualizar produtos ao estoque?");
				System.out.println("\n(4) Deseja mostrar todos os produtos ao estoque?");
				System.out.println("\n(0) Deseja sair do sistema de estoque?");
				System.out.println("\n----------------------------------------------------");
				System.out.println("\nPor favor, digite sua opção: " );
				op = read.nextInt();
			
			
			switch(op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = read.nextLine();
				estoque.add(produto);
			break;
			case 2:
				read.nextLine();
				System.out.println("\nDigite o produto que deseja remover: ");
				String produtor = read.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}else {
					System.out.println("\nProduto não existe!!!");
				}			
			break;
			
			case 3:
				read.nextLine();
				System.out.println("\nDigite o produto que voce quer atualizar: ");
				String verifica = read.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica);
				String novo = read.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nProduto não existe!!!");
				}			
			break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
			break;
			case 0: 
				System.out.println("\nMuito obrigado em utilizar do nosso sistema");
				
			break;
			default:
				System.out.println("\nOpção invalida!!!"); 
			}
			
		} while(op !=0);
	}

}

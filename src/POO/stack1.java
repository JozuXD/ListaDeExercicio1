package POO;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		
		System.out.println("\nElementos da Pilha: "+ pilha);
		
		System.out.println("\nRetirar Elemento: "+ pilha.pop());
		
		System.out.println("\nElementos da Pilha: "+ pilha);
		
		System.out.println("\nRetirar da Pilha: "+ pilha.pop());
		
		System.out.println("\nElementos da Pilha: "+ pilha);
		
		System.out.println("\nElemento no topo da Pilha: "+ pilha.peek());
		
		System.out.println("\nAdicionar elemento Prato roxo: "+ pilha.push("Prato Roxo"));
		
		System.out.println("Exibir a pilha atualizada: "+ pilha);
		
		System.out.println("\nTamanho da pilha: "+ pilha.size());
		
		System.out.println("\no Elemento Prato Verde existe na pilha? "+ pilha.contains("Prato Verde"));
		
		System.out.println("\nExibir todos os Elementos da Pilha por Iteração");
		
		

	}

}

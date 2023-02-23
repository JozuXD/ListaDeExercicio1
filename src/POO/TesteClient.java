package POO;

public class TesteClient {

	public static void main(String[] args) {
	
		Cliente[] listaCliente = new Cliente[2];
		
		listaCliente[0] = new Cliente("Jozu","123.456.789.00","11 9 1234-5678", "Guarulhos", "São Paulo");
		listaCliente[1] = new Cliente("AG","123.456.789.11", "11 9 1234-5679", "Bertioga", "São Paulo");
		
		for(Cliente lista:listaCliente) {
			lista.imprimirInfo();
		}

	}

}

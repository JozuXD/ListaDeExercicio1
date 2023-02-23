package POO;

public class testeAutomovel {

	public static void main(String[] args) {
		
		//instanciando um objeto da classe automovel
		
		Automovel auto1 = new Automovel("Josué","Mercedez AMG","URIP1910",2023);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferencia de Proprierario");
		auto1.setNomeProprietario("Carlos");
		auto1.imprimirInfo();
		
		System.out.println("\nMudança de placa");
		auto1.setPlaca("JOZ0U34");
		auto1.imprimirInfo();

	}

}

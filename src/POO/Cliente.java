package POO;

public class Cliente {
	
	private String nome;
	private  String cpf;
	private String telefone;
	private String cidade;
	private String estado;
	
	
	public Cliente(String nome, String cpf, String telefone, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: "+nome);
		System.out.println("\ncpf: "+cpf);
		System.out.println("\nTelefone: "+telefone);
		System.out.println("\nEstado: "+estado);
		System.out.println("\nCidade: "+cidade);
	}
	
	
}

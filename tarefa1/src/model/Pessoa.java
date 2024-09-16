package model;

public abstract class Pessoa {

	private String nome;
	private String email;
	private long telefone;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String email) {
		this(nome);
		this.email = email;
	}

	public Pessoa(String nome, String email, long telefone) {
		this(nome, email);
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getCadastroRF() {
		return 0;
	}
	
	public String Teste() {
		return "Teste";
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n---Pessoa---\n");
		sb.append(String.format("Nome: %s\nEmail: %s\nTelefone: %s\n", this.nome, this.email, this.telefone));
		
		return sb.toString();
	}

}

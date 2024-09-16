package model;

public class PessoaFisica extends Pessoa {
	
	private final long cpf;

	public PessoaFisica(String nome, long cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String email, long cpf) {
		super(nome, email);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String email, long telefone, long cpf) {
		super(nome, email, telefone);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}
	
	@Override
	public long getCadastroRF() {
		return this.cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(String.format("CPF: %d", this.cpf));
		
		return sb.toString();
	}
	
}

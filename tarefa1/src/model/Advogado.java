package model;

public class Advogado extends PessoaFisica{
	
	private final long registro;
	
	public Advogado(String nome, long cpf, long registro) {
		super(nome, cpf);
		this.registro = registro;
	}
	
	public Advogado(String nome, String email, long cpf, long registro) {
		super(nome, email, cpf);
		this.registro = registro;
	}
	
	public Advogado(String nome, String email, long telefone, long cpf, long registro) {
		super(nome, email, telefone, cpf);
		this.registro = registro;
	}

	public long getRegistro() {
		return registro;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n--Advogado--");
		sb.append(super.toString());
		sb.append(String.format("Registro: %d\n", this.registro));
		return sb.toString();
	}
	
}

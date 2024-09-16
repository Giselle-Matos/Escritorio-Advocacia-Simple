package model;

public class Tribunal {
	
	private final String sigla;
	private final String descricao;
	private final String secao;

	public Tribunal(String sigla, String descricao, String secao) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.secao = secao;
	}
	
	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSecao() {
		return secao;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Sigla: %s\nDescricao: %s\nSecao: %s", this.sigla, this.descricao, this.secao));
	
		return sb.toString();
	}
	
}

package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Despesa {

	private final Date data;
	private final String descricao;
	private final double valor;
	
	public Despesa(Date data, String descricao, double valor) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = sdf.format(this.data);

		sb.append(String.format("Data: %s\nDescrição: %s\nValor: %f", data, this.descricao, this.valor));
	
		return sb.toString();
	}
}

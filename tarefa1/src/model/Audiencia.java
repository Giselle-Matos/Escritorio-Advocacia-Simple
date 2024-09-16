package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Audiencia {

	private final Date data;
	private final String recomendacao;
	private final Advogado advogado;

	public Audiencia(Date data, String recomendacao, Advogado advogado) {
		this.data = data;
		this.recomendacao = recomendacao;
		this.advogado = advogado;
	}

	public Date getData() {
		return data;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n--Audiencia--\n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = sdf.format(this.data);

		// Usar %s para strings
		sb.append(String.format("Data: %s\nRecomendacao: %s\nAdvogado: %s\n", dataFormatada, this.recomendacao,
				this.advogado));

		return sb.toString();
	}

}

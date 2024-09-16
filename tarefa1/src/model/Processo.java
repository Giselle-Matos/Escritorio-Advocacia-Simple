package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Processo {
	private final long numero;
	private final Date dataAbertura;
	private EFaseProcesso fase;
	
	private Tribunal tribunal;
	private Pessoa cliente;
	private Pessoa parteContraria;
	
	private ArrayList<Audiencia> audiencias = new ArrayList<>();
	private ArrayList<Despesa> custas = new ArrayList<>();
	
	
	public Processo(long numero, Date dataAbertura, EFaseProcesso fase, Tribunal tribunal, Pessoa cliente, Pessoa parteContrária) {
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.fase = fase;
		this.tribunal = tribunal;
		this.cliente = cliente;
		this.parteContraria = parteContrária;
	}
	
	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(Pessoa parteContraria) {
		this.parteContraria = parteContraria;
	}

	public EFaseProcesso getFase() {
		return fase;
	}
	
	public void setFase(EFaseProcesso fase) {
		this.fase = fase;
	}
	
	public String getAudiencias() {
		StringBuilder sb = new StringBuilder();
		for(Audiencia audiencia : audiencias) {
			sb.append(audiencia.toString());
		}
		return sb.toString();
	}
	
	public void setAudiencias(Audiencia audiencia) {
		this.audiencias.add(audiencia);
	}
	
	public String getCustas() {
		StringBuilder sb = new StringBuilder();
		for(Despesa custa : custas) {
			sb.append(custa.toString());
		}
		return sb.toString();
	}
	
	public void setCustas(Despesa despesa) {
		this.custas.add(despesa);
	}
	
	public long getNumero() {
		return numero;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public double getTotalCustas() {
		double totalCustas = 0;
		for(Despesa despesa : this.custas) {
			totalCustas = totalCustas + despesa.getValor();
		}
		return totalCustas;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n--Processo--\n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = sdf.format(this.dataAbertura);

		sb.append(String.format("Numero: %d\nData: %s\nFase: %s\nTribunal: %s\nCliente: %s\nParte Contrária: %s\nAudiencias: %s\nCustas: %s", this.numero, data, this.fase, this.tribunal.toString(),this.cliente.toString(), this.parteContraria.toString(), this.getAudiencias(), this.getCustas()));
		return sb.toString();
	}
	
}

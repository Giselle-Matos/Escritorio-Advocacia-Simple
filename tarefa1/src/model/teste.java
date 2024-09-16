package model;

import java.util.Date;

public class teste {

	public static void main(String[] args) {

		PessoaFisica pessoa1 = new PessoaFisica("Giselle", "giselle@gmail.com", 2198514093L, 12415649732L);
		Pessoa pessoa2 = new PessoaFisica("Linda", "linda@gmail.com", 12415649732L);

		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
	
		PessoaJuridica pessoaJ1 = new PessoaJuridica("Doce Tentação", "doce.tentacao@gmail.com", 21983135992L, 121321321412414L, pessoa1);
		
		Pessoa pessoaJ2 = new PessoaJuridica("Bulk", 2414124212414L, pessoa1);
				
		Advogado advogado1 = new Advogado("Beatriz", "beatriz@gmail.com", 2194321442L, 12314562425L, 1412412);
		
		Date date = new Date();
		Audiencia audiencia1 = new Audiencia(date, "sem recomendação", advogado1);
		
		Tribunal tribunal1 = new Tribunal("ABC", "Tribunal ABC", "10");
		
		Despesa despesa1 = new Despesa(date, "sem descricao", 1050.95);
		
		Processo processo1 = new Processo(001, date, EFaseProcesso.INICIAL, tribunal1, pessoa1, pessoaJ1);		
		
		processo1.setAudiencias(audiencia1);
		
		processo1.setCustas(despesa1);
		
		
		System.out.println(pessoaJ1.toString());
		
		System.out.println(pessoaJ2.Teste());
		
		System.out.println(advogado1.toString());
		
		System.out.println(audiencia1.toString());

		
		System.out.println(processo1.toString());
	}

}

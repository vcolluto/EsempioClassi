package org.generation.italy.model;

public class Prodotto {
	public int quantità;
	public String categoria;
	public int codice;
	public String nome;	
	
		
	public Prodotto(String nome, String categoria) {
	//	super();
		quantità=0;
		if (!categoria.isEmpty())
			this.categoria=categoria;
		else 
			this.categoria="non definita";
		codice=-1;
		if (!nome.isEmpty())
			this.nome=nome;
		else
			this.nome="non impostato";
	}

	public void carica(int valore) {
		quantità=quantità+valore;
	}
	
	public void vendi() {
		quantità=quantità-2;
	}
}

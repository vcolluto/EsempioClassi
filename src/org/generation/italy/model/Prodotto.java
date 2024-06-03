package org.generation.italy.model;

public class Prodotto {
//informazioni (dati) 	ATTRIBUTI: definiscono caratteristiche (nome, categoria) oppure ne cambiano lo stato (quantità, prezzo)
	public double prezzo;
	public int quantità;
	public String categoria;
	public int codice;
	public String nome;
	
	
// operazioni 			METODI
	public void carica(int valore) {
		quantità=quantità+valore;
	}
	
	public void vendi() {
		quantità=quantità-2;
	}
}

package org.generation.italy.model;

public class Concessionario {	//stesso package di Automobile
	
	Automobile a1=new Automobile("Opel", "Astra");
	
	public void vendiAutomobile() {
		
		a1.prezzo=6000;		//prezzo ha una visibilità default
		// a1.velocità=20;		//non si può fare perché la visibilità è privata
		
		
	}

}

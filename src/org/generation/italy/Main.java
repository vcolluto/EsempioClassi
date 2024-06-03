package org.generation.italy;

import org.generation.italy.model.*;

public class Main {

	public static void main(String[] args) {
		
		Automobile a1=new Automobile("Ford", "Fiesta", "sport");		//la modalità è "sport"
		
		Automobile a2=new Automobile("Fiat", "Panda", "temporanea");		//la modalità è "normale" ("temporanea" non è valida)
		
		Automobile a3=new Automobile("Renault", "Clio");		//la modalità è "normale"
		
		//tutti gli oggetti di "Automobile" hanno le stesse caratteristiche (hanno una marca, un modello, una velocità, ...)
		
		a1.setModalità("temporanea");		// la modalità è "normale"
		a1.accelera();	//ogni volta che accelero la velocità aumenta
		a1.accelera();
		a1.decelera();	
		
		//a2.setModalità("sport");
		
		for (int i=1; i<1000;i++) {
			a1.accelera();
			a2.accelera();
		}
			
	
		a1.decelera();	
		a1.decelera();	
		a1.decelera();	
		a1.decelera();	
		System.out.println("Auto1: "+a1.toString());
		System.out.println("Auto2: "+a2.toString());
		
		System.out.println("La velocità di a1 è: "+a1.getVelocità());
		System.out.println("La velocità di a2 è: "+a2.getVelocità());
		
		a1.setModalità("sport");
		for (int i=1; i<10;i++) {
			a1.accelera();
		}
		System.out.println("Ora la velocità di " +a1.getMarca() + " " + a1.getModello()+" è: "+a1.getVelocità());
	}

}

package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Automobile;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		//Prodotto p=new Prodotto();		//il costruttore che sto chiamando non è definito esplicitamente nella classe, ma viene utilizzato un costruttore "predefinito" che inizializza tutti gli attributi con valori standard (per i numeri:0, per le stringhe: null, ecc.)

		try {
			Automobile a1 = new Automobile("Ford", "Fiesta", "sport"); // la modalità è "sport"

			Automobile a2 = new Automobile("Fiat", "Panda", "temporanea"); // la modalità è "normale" ("temporanea" non
																			// è valida)

			Automobile a3 = new Automobile("Renault", "Clio"); // la modalità è "normale"

			// tutti gli oggetti di "Automobile" hanno le stesse caratteristiche (hanno una
			// marca, un modello, una velocità, ...)

			a1.setModalità("sport");
				
			a1.accelera(); // ogni volta che accelero la velocità aumenta
			a1.accelera();
			a1.decelera();

			double litri=a1.rifornisci(100);		//metto 100 euro di benzina. Il valore di ritorno mi dice quanti litri ho rifornito 
			System.out.println("Hai rifornito "+litri+ " l di benzina");
			
			litri=a1.rifornisci(50); //metto 50 euro di benzina. Il valore di ritorno mi dice quanti litri ho rifornito 
			System.out.println("Hai rifornito "+litri+ " l di benzina");
			
			// a2.setModalità("sport");

			for (int i = 1; i < 1000; i++) {
				a1.accelera();
				a2.accelera();
			}

			a1.decelera();
			a1.decelera();
			a1.decelera();
			a1.decelera();
			System.out.println("Auto1: " + a1.toString());
			System.out.println("Auto2: " + a2.toString());

			System.out.println("La velocità di a1 è: " + a1.getVelocità());
			System.out.println("La velocità di a2 è: " + a2.getVelocità());

			a1.setModalità("sport");
			for (int i = 1; i < 10; i++) {
				a1.accelera();
			}
			System.out
					.println("Ora la velocità di " + a1.getMarca() + " " + a1.getModello() + " è: " + a1.getVelocità());
		} catch (Exception e) {
			System.out.println("Impossibile creare l'oggetto: " + e.getMessage());
		}

		Automobile a4=null;
		do {
			System.out.print("Inserisci la marca: ");
			String marca = sc.nextLine();
			System.out.print("Inserisci il modello: ");
			String modello = sc.nextLine();
			System.out.print("Inserisci la modalità: ");
			String modalità = sc.nextLine();
			try {
				 a4= new Automobile(marca, modello, modalità);
				System.out.println("\n\nAutomobile a4: " + a4.toString());
			} catch (Exception e) {
				System.out.println("Impossibile creare l'oggetto: " + e.getMessage());
			}
	
		} while (a4==null);
		
		Automobile a5=new Automobile();
		
		sc.close();
		
			}

}

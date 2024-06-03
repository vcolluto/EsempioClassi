package org.generation.italy.model;

public class Automobile {
	private String marca;		//private: questo attributo è accessibile solo dall'interno della classe Automobile
	private String modello;		//private: questo attributo è accessibile solo dall'interno della classe Automobile
	private int velocità;		//private: questo attributo è accessibile solo dall'interno della classe Automobile
	private double benzina;		//private: questo attributo è accessibile solo dall'interno della classe Automobile
	double prezzo;				//visibilità default: è accessibile dalla stessa classe e da altre classi nello stesso package
	private String modalità;	//"sport", "normale", "eco"
	
	public void accelera() {
		int vmax;
		if (modalità.equals("normale"))
			vmax=200;
		else if (modalità.equals("eco"))
			vmax=150;
		else	//sport
			vmax=230;
		
		if (velocità<vmax)		//la velocità non può superare la vmax
			velocità++;			//cambio la velocità (sono all'interno della classe e quindi posso modificare gli attributi "private")
		else
			System.out.println("Impossibile accelerare");
			
	}
	
	public void decelera() {
		if (velocità>0)			//la velocità non può essere negativa
			velocità--;		//cambio la velocità
		else
			System.out.println("Impossibile decelerare");
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", velocità=" + velocità + ", benzina=" + benzina
				+ "]";
	}

	public Automobile(String marca, String modello, String modalità) {		//costruttore della classe (serve per "costruire" un oggetto della classe) 
		//costruisco una nuova automobile con la marca e il modello specificati dai parametri, impostando velocità=0 e benzina=0
		
		//lo stato iniziale deve essere valido (tutti gli attributi devono avere un valore valido!)
		if (!marca.isEmpty())
			this.marca = marca;			//this.marca: attributo di questa classe; marca: parametro
		this.modello = modello;
		this.velocità=0;		//sulla nuova automobile è sempre 0
		this.benzina=0;			//sulla nuova automobile è sempre 0
		setModalità(modalità);	//richiamo il setter (che a sua volta controlla la validità)
	}
	
	public Automobile(String marca, String modello) {		//costruttore della classe (serve per "costruire" un oggetto della classe) 
		this(marca,modello,"normale");		//richiamo il costruttore "principale" con modalità="normale"
	}

	public String getMarca() {		//metodo "getter" : consente l'accesso in lettura di un attributo incapsulato
		return marca;
	}

	public String getModello() {     //metodo "getter" : consente l'accesso in lettura di un attributo incapsulato
		return modello;
	}

	public int getVelocità() {
		return velocità;
	}

	public double getBenzina() {
		return benzina;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getModalità() {
		return modalità;
	}

	public void setModalità(String modalità) {
		if (modalità.equals("normale") || modalità.equals("eco") || modalità.equals("sport"))
			this.modalità = modalità;	//cambio il valore dell'attributo (this.modalità)
		else {
			System.out.println("modalità non riconosciuta");
			this.modalità="normale";
		}
	}
	
	
	

}
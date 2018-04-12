package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] Attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;
	
	public Borsa(int pesoMax) {
		this.pesoMax= pesoMax;
		this.Attrezzi = new Attrezzo[10];
		this.numeroAttrezzi= 0;
	}
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if(this.getPeso()+attrezzo.getPeso()>this.getPesoMax())
			return false;
		if(this.numeroAttrezzi==10)
			return false;
		this.Attrezzi[this.numeroAttrezzi]= attrezzo;
		this.numeroAttrezzi++;
		return true;
	
	}
	public int getPesoMax() {
		return pesoMax;
	
	}
	
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a=null;
		for(int i=0;i<this.numeroAttrezzi;i++)
			if(this.Attrezzi[i].getNome().equals(nomeAttrezzo))
				a=Attrezzi[i];
				return a;
				
	}
	
	public int getPeso() {
		int peso=0;
		for(int i=0; i<this.numeroAttrezzi;i++)
			peso += this.Attrezzi[i].getPeso();
		return peso;
	}
	
	public boolean isEmpty() {
		return this.numeroAttrezzi==0;
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	
	/**
	 * Preso il nome dell'attrezzo da rimuovere, il metodo elimina tale oggetto dalla
	 * borsa, spostando l'ultimo attrezzo dell'array nella posizione di quello
	 * desiderato, per poi eliminare l'ultima posizione dell'array diminuendone la lunghezza
	 * @param nomeAttrezzo
	 */
	public void removeAttrezzo(String nomeAttrezzo) {	
		for(int i=0;i<this.numeroAttrezzi;i++)
			if(this.Attrezzi[i].getNome().equals(nomeAttrezzo)) {
              this.Attrezzi[i] = this.Attrezzi[numeroAttrezzi-1];
              this.numeroAttrezzi--;
             }
	}
	
	/**
	 * Questo metodo serve per poter stampare facilmente la lista di oggetti nella borsa
	 * senza dover scrivere il codice ogni volta che serve
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		if(!this.isEmpty()) {
			s.append("Contenuto borsa("+this.getPeso()+"kg): ");
			for(int i=0;i<this.numeroAttrezzi;i++)
				s.append(Attrezzi[i].toString()+" ");
		}
		else
			  s.append("La borsa è vuota!");
		return s.toString();
	}
}


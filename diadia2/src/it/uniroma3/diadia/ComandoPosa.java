package it.uniroma3.diadia;

import java.util.Scanner;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
	
	private String oggetto;

	@Override
	public void esegui(Partita partita) {
		Scanner scan = new Scanner(System.in);
		String messaggio = partita.getGiocatore().getZaino().toString();
		System.out.println(messaggio);
		if (!(messaggio.equals("La borsa è vuota!"))){
		if(partita.getGiocatore().getZaino().hasAttrezzo(oggetto)) {
			
			Attrezzo add = partita.getGiocatore().getZaino().getAttrezzo(oggetto);
			if(partita.getStanzaCorrente().addAttrezzo(add)) {
			partita.getGiocatore().getZaino().removeAttrezzo(oggetto);		
			System.out.println("Oggetto Lasciato!");
			}
			else System.out.println("Non c'è spazio nella stanza.");
		}
	}
	}

	@Override
	public void setParametro(String parametro) {
		this.oggetto = parametro;

	}

}

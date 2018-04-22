package it.uniroma3.diadia;

public class ComandoGuarda implements Comando {

	@Override
	public void esegui(Partita partita) {
		System.out.println("Stanza corrente: "+partita.getStanzaCorrente());
		System.out.println(partita.getGiocatore().getZaino().toString());	
	}

	@Override
	public void setParametro(String parametro) {
		// Non serve a nulla, come provare a fare qualcosa, tanto non riesci

	}

}

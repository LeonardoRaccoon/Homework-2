package it.uniroma3.diadia;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComadoPosaTest {
	
	private static final String OSSO = "osso";
	private ComandoPosa comandoPosa;
	private Partita partita;

	@Before
	public void setUp() throws Exception {
		this.comandoPosa = new ComandoPosa();
		this.comandoPosa.setParametro(OSSO);
		this.partita = new Partita();
	}

	@Test
	public void testEseguiCasoBase() {
		Attrezzo attrezzoNellaBorsa = new Attrezzo(OSSO, 1);
		this.partita.getGiocatore().getZaino().addAttrezzo(attrezzoNellaBorsa);
		this.comandoPosa.esegui(partita);
		assertTrue(this.partita.getStanzaCorrente().hasAttrezzo(OSSO));
		assertFalse(this.partita.getGiocatore().getZaino().hasAttrezzo(OSSO));
	}

}

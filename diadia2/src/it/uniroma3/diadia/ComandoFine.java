package it.uniroma3.diadia;

public class ComandoFine implements Comando {

	@Override
	public void esegui(Partita partita) {
		System.out.println("Grazie di aver giocato!");  // si desidera smettere
		partita.setFinita();
	}

	@Override
	public void setParametro(String parametro) {
		// Inutile come respirare, tanto prima o poi muori lo stesso

	}

}

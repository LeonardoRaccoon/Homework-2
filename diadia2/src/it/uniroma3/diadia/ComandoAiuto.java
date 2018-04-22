package it.uniroma3.diadia;

public class ComandoAiuto implements Comando {
	
	private String[] elencoComandi;
	
	public ComandoAiuto (String[] elencoComandi) {
		this.elencoComandi = elencoComandi;
	}

	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			System.out.print(elencoComandi[i]+" ");
		System.out.println();

	}

	@Override
	public void setParametro(String parametro) {
		// Inutile come il mio cazzo durante un rapporto (non ho rapporti)

	}

}

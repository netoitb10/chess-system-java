package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Borda borda;
	
	public Peca(Borda borda) {
		super();
		this.borda = borda;
	}

	protected Borda getBorda() {
		return borda;
	}
	
		
	

}

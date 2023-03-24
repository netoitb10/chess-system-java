package tabuleiro;

public class Borda {
	
	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	
	public Borda(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas][colunas];
	}
	
	
	

}

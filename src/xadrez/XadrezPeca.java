package xadrez;

import tabuleiro.Borda;
import tabuleiro.Peca;

public class XadrezPeca extends Peca {
	
	private Cor cor;

	public XadrezPeca(Borda borda, Cor cor) {
		super(borda);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	

}

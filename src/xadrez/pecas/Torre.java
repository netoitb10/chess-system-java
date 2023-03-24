package xadrez.pecas;

import tabuleiro.Borda;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca {

	public Torre(Borda borda, Cor cor) {
		super(borda, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
	

}

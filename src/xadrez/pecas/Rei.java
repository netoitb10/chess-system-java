package xadrez.pecas;

import tabuleiro.Borda;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Rei extends XadrezPeca{

	public Rei(Borda borda, Cor cor) {
		super(borda, cor);
		
	}
	
	@Override
	public String toString() {
		return "R";
	}

}

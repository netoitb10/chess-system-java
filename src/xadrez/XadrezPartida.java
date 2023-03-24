package xadrez;

import tabuleiro.Borda;

public class XadrezPartida {
	
	private Borda borda;
	
	public XadrezPartida() {
		borda = new Borda(8,8);
	}
	
	public XadrezPeca [][] getPecas(){
		XadrezPeca[][] mat = new XadrezPeca[borda.getLinhas()][borda.getColunas()];
		for (int i = 0; i < borda.getLinhas(); i++) {
			for (int j = 0; j < borda.getColunas(); j++) {
				mat[i][j] = (XadrezPeca) borda.peca(i, j);
				
			}
			
		}
		return mat;
		
	}

}

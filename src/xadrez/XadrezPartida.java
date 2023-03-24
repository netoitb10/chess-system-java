package xadrez;

import tabuleiro.Borda;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class XadrezPartida {
	
	private Borda borda;
	
	public XadrezPartida() {
		borda = new Borda(8,8);
		configuracaoInicial();
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
	
	private void configuracaoInicial() {
		borda.lugarPeca(new Torre(borda, Cor.BRANCA), new Posicao(2, 1));
		borda.lugarPeca(new Rei(borda, Cor.PRETA), new Posicao(0, 4));
		borda.lugarPeca(new Rei(borda, Cor.BRANCA), new Posicao(7, 4));
	}

}

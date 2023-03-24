package aplicacao;

import xadrez.XadrezPartida;

public class Programa {

	public static void main(String[] args) {
		
		XadrezPartida xadrezPartida = new XadrezPartida();
		UI.printBorda(xadrezPartida.getPecas());
	}

}

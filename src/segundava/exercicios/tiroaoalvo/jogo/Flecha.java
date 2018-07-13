package segundava.exercicios.tiroaoalvo.jogo;

import javax.swing.ImageIcon;

public class Flecha {
	int x;
	int y;
	ImageIcon imagem;
	
	public Flecha(int x, int y) {
		this.x = x;
		this.y = y;
		this.imagem = new ImageIcon(getClass().getResource("../Imagens/flechaDir.png"));
	}
	
}

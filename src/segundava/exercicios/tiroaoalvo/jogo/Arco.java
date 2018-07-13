package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Arco {
	
	public int x;
	public int y;
	public ImageIcon imagem;
	
	public Arco(int x, int y) {
		
		this.x = x;
		this.y = y;
		this.imagem = new ImageIcon(getClass().getResource("../Imagens/arcoComFlecha.png"));
	}
	
	public void tirarFlecha() {
		this.imagem = new ImageIcon(getClass().getResource("../Imagens/arcoSemFlecha.png"));
	}
	
	public void colocarFlecha() {
		this.imagem = new ImageIcon(getClass().getResource("../Imagens/arcoComFlecha.png"));
	}
	
}

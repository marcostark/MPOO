package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Alvo {
	public int x;
	public int y;
	public Dimension tamanho;
	public boolean movimento;
	public boolean direita;
	public ImageIcon imagem, imagemMedia;
	
	public Alvo(int x, int y, Dimension tamanho) {
		
		this.x = x;
		this.y = y;
		this.tamanho = tamanho;
		this.movimento = true;
		this.direita = true;
		this.imagem = new ImageIcon(getClass().getResource("../Imagens/alvo.png"));
		
		//this.imagemMedia = imagemMedia;
	}
}

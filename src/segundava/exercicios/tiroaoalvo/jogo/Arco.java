package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Arco {
	
	public int x;
	public int y;
	public Dimension tamanho;
	public boolean movimento;
	public boolean direita;
	public ImageIcon imagem, imagemMedia;
	
	public Arco(int x, int y, Dimension tamanho) {
		
		this.x = x;
		this.y = y;
		this.tamanho = tamanho;
		this.movimento = true;
		this.direita = true;
		this.imagem = new ImageIcon(getClass().getResource("Imagem/alvo.png"));
		
		//this.imagemMedia = imagemMedia;
	}
}

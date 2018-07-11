package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Alvo 
{
	public int x;
	public int y;
	public Dimension tamanho;
	public boolean movimento;
	public boolean direita;
	public ImageIcon imagem,imagemMed;
	
	public Alvo(int x, int y, Dimension tamanho) 
	{
		this.x = x;
		this.y = y;
		this.movimento = true;
		this.direita = true;
		this.tamanho = tamanho;
		this.imagem = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/alvo.png");
		this.imagemMed = new ImageIcon();
		this.imagemMed = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/alvoMedio.png");
	}	
}

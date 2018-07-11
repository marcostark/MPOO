package segundava.exercicios.tiroaoalvo.jogo;

import javax.swing.ImageIcon;

public class Arco 
{
	public int x;
	public int y;
	public ImageIcon imagem;
	
	public Arco() 
	{
		x = 450;
		y = -70;
		imagem = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/arcoComFlecha.png");
	}
	
	public void tirarFlecha() 
	{
		imagem = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/arcoSemFlecha.png");
	}
	public void botarFlecha() 
	{
		imagem = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/arcoComFlecha.png");
	}
}

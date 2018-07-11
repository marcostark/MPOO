package segundava.exercicios.tiroaoalvo.jogo;

import javax.swing.ImageIcon;

public class Flecha {
	public int x;
	public int y;
	public ImageIcon imagem, imagemMed;
	
	public Flecha(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.imagem = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/flechaDir.png");
		this.imagemMed = new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/flechaDirMed.png");
	}
	
}

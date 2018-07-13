package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Alvo alvo, alvo2;
	public JLabel alvoLabel, alvoLabel2;

	private JLabel backgroundLabel;

	public Game() {
		super("Tiro ao Alvo");

		setLayout(null);
		ImageIcon icone = new ImageIcon(getClass().getResource("icone.png"));
		setIconImage(icone.getImage());

		alvo = new Alvo(20, 100, new Dimension(150, 150));
		alvo2 = new Alvo(920, 100, new Dimension(150, 150));

		backgroundLabel = new JLabel(new ImageIcon(getClass().getResource("../Imagens/background.jpg")));
		backgroundLabel.setBounds(0, 0, 1100, 450);
		backgroundLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		alvoLabel = new JLabel(alvo.imagem);
		alvoLabel.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
		alvoLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		alvoLabel2 = new JLabel(alvo2.imagem);
		alvoLabel2.setBounds(alvo2.x, alvo2.y, alvo2.tamanho.width, alvo2.tamanho.height);
		alvoLabel2.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		add(alvoLabel);
		add(alvoLabel2);
		add(backgroundLabel);

		setSize(1100, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		new Movimento(alvo, alvoLabel).start();
		new Movimento(alvo2, alvoLabel2).start();

	}

	@SuppressWarnings("unused")
	private class Movimento extends Thread {
		
		private Alvo alvo;
		private JLabel alvoLabel;
		
		public Movimento(Alvo alvo, JLabel alvoLabel) {
			this.alvo = alvo;
			this.alvoLabel = alvoLabel;
		}

		public void run() {

			synchronized (this) {

				while (true) {

					if (alvo.movimento && alvo.direita) {
						alvo.x += 1;
						if (alvo.x >= 920) {
							alvo.direita = false;
						}
					} else if (alvo.movimento && !alvo.direita) {
						alvo.x -= 1;

						if (alvo.x <= 20) {
							alvo.direita = true;
						}
					}
					try {
						sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					alvoLabel.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
					
				}

			}

		}

	}

}

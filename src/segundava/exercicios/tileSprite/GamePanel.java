package segundava.exercicios.tileSprite;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	TileMap camada1; 
	TileMap camada2; 
	TileMap camada3;
	static Sprite personagem;
	
	public BufferedImage tela;
	private Graphics2D g2d;	
	ImageIcon background;
	int up, down, left, right;

	// Game loop
	private Thread thread;
	private boolean emJogo;
	private final int FPS = 30;
	private final int TARGET_TIME = 1000 / FPS;

	public GamePanel() {
		setPreferredSize(new Dimension(320, 320));
		setFocusable(true);
		requestFocus();
	}

	public void inicio() {
		// Carregando todos os recursos que serão usados no jogo

		emJogo = true;
		tela = new BufferedImage(640, 640, BufferedImage.TYPE_4BYTE_ABGR);
		g2d = (Graphics2D) tela.getGraphics();

		// Camada: Ler a matriz e uma imagem que ser� associada a essa matriz
		camada1 = new TileMap(10, 10, 32, 32,
				"/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tileSprite/Camada1.png",
				"camada1.txt");
		camada2 = new TileMap(10, 10, 32, 32,
				"/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tileSprite/Camada2.png",
				"camada2.txt");
		camada3 = new TileMap(10, 10, 32, 32,
				"/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tileSprite/Camada2.png",
				"camada3.txt");

		try {
			personagem = new Sprite(new File(
					"/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tileSprite/personagem.png"),
					7, 6, 4, this.getWidth() / 2, this.getHeight() / 2);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível carregar a Sprite");
		}
		
//
//		camada1.montarMapa(320, 320);
//		camada2.montarMapa(320, 320);
//		camada3.montarMapa(320, 320);


	}

	public void update() {
		
		camada1.montarMapa(320, 320);
		camada2.montarMapa(320, 320);
		camada3.montarMapa(320, 320);
	}

	// copy buffer to screen
	private void desenhaNaTela() {
		Graphics g2 = getGraphics();
		g2.drawImage(tela, 0, 0, 640, 640, null);
		g2.dispose();
	}

	public void desenhar() {
		tela.getGraphics().drawImage(camada1.camada, 0, 0, this);// camada grama/blocos
		tela.getGraphics().drawImage(camada2.camada, 0, 0, this);// camada tronco da árvore

		// deveria tratar colisão
		tela.getGraphics().drawImage(personagem.sprites[personagem.aparencia], personagem.posX, personagem.posY, null);
		tela.getGraphics().drawImage(camada3.camada, 0, 0, this);// camada árvore

		Graphics2D g2d = (Graphics2D) this.getGraphics();
		g2d.drawImage(tela, 0, 0, null);
	}

	public void addNotify() {// SUBSTITUIR PELO CONCEITO DE tHREAD
		super.addNotify();
		if (thread == null) {
			addKeyListener(new TAdapter());
			thread = new Thread(this);
			thread.start();
		}

	}

	public void run() {

		inicio();

		long start;
		long elapsed;
		long wait;

		// game loop
		while (emJogo) {

			start = System.nanoTime();

			update();
			desenhar();
			//desenhaNaTela();

			elapsed = System.nanoTime() - start;

			wait = TARGET_TIME - elapsed / 1000000;
			if (wait < 0)
				wait = TARGET_TIME;

			try {
				Thread.sleep(wait);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Eventos de teclado
	public class TAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				personagem.posY--;
				switch (up) {
				case 0:
					personagem.aparencia = 0;
					break;
				case 1:
					personagem.aparencia = 4;
					break;
				case 2:
					personagem.aparencia = 8;
					break;
				case 3:
					personagem.aparencia = 12;
					break;
				}
				if (up == 3)
					up = 0;
				else
					up++;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				personagem.posY++;
				switch (down) {
				case 0:
					personagem.aparencia = 2;
					break;
				case 1:
					personagem.aparencia = 6;
					break;
				case 2:
					personagem.aparencia = 10;
					break;
				case 3:
					personagem.aparencia = 14;
					break;
				}
				if (down == 3)
					down = 0;
				else
					down++;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				personagem.posX--;
				switch (left) {
				case 0:
					personagem.aparencia = 3;
					break;
				case 1:
					personagem.aparencia = 7;
					break;
				case 2:
					personagem.aparencia = 11;
					break;
				case 3:
					personagem.aparencia = 15;
					break;
				}
				if (left == 3)
					left = 0;
				else
					left++;
				// outro if para verificar a osi��o i e j do personagem
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				personagem.posX++;
				switch (right) {
				case 0:
					personagem.aparencia = 1;
					break;
				case 1:
					personagem.aparencia = 5;
					break;
				case 2:
					personagem.aparencia = 9;
					break;
				case 3:
					personagem.aparencia = 13;
					break;
				}
				if (right == 3)
					right = 0;
				else
					right++;
			}
		}
	}
}
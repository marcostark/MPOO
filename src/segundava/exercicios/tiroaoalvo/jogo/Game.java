package segundava.exercicios.tiroaoalvo.jogo;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame implements MouseListener, MouseMotionListener, KeyListener	{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Alvo alvo, alvo2;
	public Arco arco;
	public JLabel alvoLabel, alvoLabel2;
	public JLabel arcoLabel, flechaLabel, flechaCaidaLabel;

	private JLabel backgroundLabel;

	private boolean pause;

	private Flecha flecha;

	private Flecha flechaCaida;

	private Flecha flecha2;

	private JLabel flechaLabel2;

	public Game() {
		super("Tiro ao Alvo");

		setLayout(null);
		setUndecorated(true);
		
		ImageIcon icone = new ImageIcon(getClass().getResource("icone.png"));
		setIconImage(icone.getImage());

		arco = new Arco(450, -70);
		alvo = new Alvo(20, 100, new Dimension(150, 150));
		alvo2 = new Alvo(920, 100, new Dimension(150, 150));

		backgroundLabel = new JLabel(new ImageIcon(getClass().getResource("../Imagens/background.jpg")));
		backgroundLabel.setBounds(0, 0, 1100, 450);
		backgroundLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		arcoLabel = new JLabel(arco.imagem);
		arcoLabel.setBounds(arco.x - 140, arco.y, 264, 500);
		arcoLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));
		
		alvoLabel = new JLabel(alvo.imagem);
		alvoLabel.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
		alvoLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		alvoLabel2 = new JLabel(alvo2.imagem);
		alvoLabel2.setBounds(alvo2.x, alvo2.y, alvo2.tamanho.width, alvo2.tamanho.height);
		alvoLabel2.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));
		
		flechaLabel2 = new JLabel();
		flechaLabel2.setVisible(false);
		flechaLabel2.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));
		
		flechaLabel = new JLabel();
		flechaLabel.setVisible(false);
		flechaLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));
		
		flechaCaidaLabel = new JLabel();
		flechaCaidaLabel.setVisible(false);
		flechaCaidaLabel.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
				new Point(0, 0), "null"));

		add(arcoLabel);
		add(flechaLabel);
		add(alvoLabel);
		add(flechaLabel2);
		add(alvoLabel2);		
		add(flechaCaidaLabel);
		add(backgroundLabel);
		
		pause = false;
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setSize(1100, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		new Movimento(alvo, alvoLabel,10).start();
		new Movimento(alvo2, alvoLabel2,10).start();

	}
	
	private class PequenaPausa extends Thread {
		
		public void run() {
			synchronized (this) {
				pause = true;
				
				try {
					sleep(1000);
				} catch (InterruptedException e) { e.printStackTrace();}
				
				pause = false;
				arco.colocarFlecha();
				arcoLabel.setIcon(arco.imagem);
				flechaCaidaLabel.setVisible(false);
			}
		}
		
	}

	@SuppressWarnings("unused")
	private class Movimento extends Thread {
		
		private Alvo alvo;
		private JLabel alvoLabel;
		private int velocidade;
		
		public Movimento(Alvo alvo, JLabel alvoLabel, int velocidade) {
			this.alvo = alvo;
			this.alvoLabel = alvoLabel;
			this.velocidade = velocidade;
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
						sleep(velocidade);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					alvoLabel.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
					
				}

			}

		}

	}

	// Eventos de teclado
	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent event) {}
	@Override
	public void keyTyped(KeyEvent event) {}

	// Eventos de mouse em movimento
	@Override
	public void mouseDragged(MouseEvent event) {
		if(!pause) {
			arco.x = event.getX();
			arcoLabel.setBounds(arco.x - 140, arco.y, 264, 500);
		}
	}	
	@Override
	public void mouseMoved(MouseEvent event) {
		if(!pause) {
			arco.x = event.getX();
			arcoLabel.setBounds(arco.x - 140, arco.y, 264, 500);
		}
	}
	
	
	// Eventos de clique
	public void mouseClicked(MouseEvent event) {}
	public void mouseEntered(MouseEvent event) {}
	public void mousePressed(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {
		
		if(event.getX() >= alvo.x && event.getX() <= alvo.x + alvo.tamanho.width) {
			alvo.movimento = false;
			
			flecha = new Flecha(event.getX() - 76, 105);
			flechaLabel.setIcon(flecha.imagem);
			flechaLabel.setBounds(flecha.x, flecha.y, 150, 149);
			flechaLabel.setVisible(true);
			
			System.out.println("Acertou! ");
		}
		
		// Segundo alvo
		else if(event.getX() >= alvo2.x && event.getX() <= alvo2.x + alvo2.tamanho.width) {
			alvo2.movimento = false;
			
			flecha2 = new Flecha(event.getX() - 76, 105);
			flechaLabel2.setIcon(flecha2.imagem);
			flechaLabel2.setBounds(flecha2.x, flecha2.y, 150, 149);
			flechaLabel2.setVisible(true);
			
			System.out.println("Acertou! ");
		}
		
		else {
			flechaCaida = new Flecha(event.getX() -76, 105);
			flechaCaidaLabel.setIcon(new ImageIcon(getClass().getResource("../Imagens/flechaCaida.png")));
			flechaCaidaLabel.setBounds(flechaCaida.x, flechaCaida.y + 50, 150, 149);
			flechaCaidaLabel.setVisible(true);
			
			new PequenaPausa().start();
		}
		new PequenaPausa().start();
		arco.tirarFlecha();
		arcoLabel.setIcon(arco.imagem);
	}
}

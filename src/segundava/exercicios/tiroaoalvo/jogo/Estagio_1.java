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

@SuppressWarnings("serial")
public class Estagio_1 extends JFrame implements MouseListener, MouseMotionListener, KeyListener 
{

	public Arco arco;
	public Alvo alvo;
	public Flecha flecha;
	public Flecha flechaCaida;
	public boolean pause;
	public boolean transicao=true;
	public int pontosTemp;
	public int aux;

	public JLabel labelArco;
	public JLabel labelAlvo;
	public JLabel labelFlecha;
	public JLabel labelFlechaCaida;
	public JLabel labelBackground;
	private JLabel labelAlvo2;
	private Alvo alvo2;

	public Estagio_1() 
	{
		super("Fase 1");
		setLayout(null);
		setUndecorated(true);


		ImageIcon icone = new ImageIcon(getClass().getResource("icone.png"));		
		setIconImage(icone.getImage());


		labelBackground = new JLabel(new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/background.jpg"));
		labelBackground.setBounds(0, 0, 1100, 450);
		labelBackground.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));
	
		arco = new Arco();
		alvo = new Alvo(20, 100, new Dimension(150, 150));
		alvo2 = new Alvo(900, 100, new Dimension(150, 150));
		flecha = new Flecha(0, 0);
		
		labelArco = new JLabel(arco.imagem);
		labelArco.setBounds(arco.x - 140, arco.y, 264, 500);
		labelArco.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));

		labelAlvo = new JLabel(alvo.imagem);
		labelAlvo.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
		labelAlvo.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));
		
		labelAlvo2 = new JLabel(alvo2.imagem);
		labelAlvo2.setBounds(alvo2.x, alvo2.y, alvo2.tamanho.width, alvo2.tamanho.height);
		labelAlvo2.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));

		labelFlecha = new JLabel();
		labelFlecha.setVisible(false);
		labelFlecha.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));

		labelFlechaCaida = new JLabel();
		labelFlechaCaida.setVisible(false);
		labelFlechaCaida.setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,BufferedImage.TYPE_INT_ARGB), new Point(0,0), "null"));

		pause = false;

		new Movimento().start();

		
		add(labelArco);
		add(labelFlecha);
		add(labelAlvo);
		add(labelAlvo2);
		add(labelFlechaCaida);
		add(labelBackground);
		
		addMouseMotionListener(this);
		addMouseListener(this);
		addKeyListener(this);
		setSize(1100, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	public void mouseDragged(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(!pause) 
		{
			arco.x = arg0.getX();
			labelArco.setBounds(arco.x - 140, arco.y, 264, 500);	
		}
	}


	public void mouseMoved(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(!pause) 
		{
			arco.x = arg0.getX();
			labelArco.setBounds(arco.x - 140, arco.y, 264, 500);	
		}
	}


	public void mouseClicked(MouseEvent arg0){}
	public void mouseEntered(MouseEvent arg0){}
	public void mouseExited(MouseEvent arg0){}
	public void mousePressed(MouseEvent arg0){}
	public void mouseReleased(MouseEvent arg0)
	{	
		// Alvo um
		if(arg0.getX() >= alvo.x && arg0.getX() <= alvo.x + alvo.tamanho.width)
		{	
			// Acertou o alvo
			alvo.movimento = false;

			flecha = new Flecha(arg0.getX() - 76, 105);
			labelFlecha.setIcon(flecha.imagem);
			labelFlecha.setBounds(flecha.x, flecha.y, 150, 149);
			labelFlecha.setVisible(true);			

			System.out.println("acertou");
			new PequenaPausa().start();
		}
		
		// Alvo dois
		if(arg0.getX() >= alvo2.x && arg0.getX() <= alvo2.x + alvo2.tamanho.width)
		{	
			// Acertou o alvo
			alvo2.movimento = false;

			flecha = new Flecha(arg0.getX() - 76, 105);
			labelFlecha.setIcon(flecha.imagem);
			labelFlecha.setBounds(flecha.x, flecha.y, 150, 149);
			labelFlecha.setVisible(true);			

			System.out.println("acertou");
			new PequenaPausa().start();
		}
		
		else 
		{
			flechaCaida = new Flecha(arg0.getX() - 76, 105);
			labelFlechaCaida.setIcon(new ImageIcon("/home/stark/PHD/Java/eclipse-workspace/MPOO/src/segundava/exercicios/tiroaoalvo/Imagens/flechaCaida.png"));
			labelFlechaCaida.setBounds(flechaCaida.x, flechaCaida.y + 50, 150, 149);
			labelFlechaCaida.setVisible(true);

			new PequenaPausa().start();
		}

		arco.tirarFlecha();
		labelArco.setIcon(arco.imagem);
	}

	private class PequenaPausa extends Thread 
	{
		public void run() 
		{
			synchronized (this) 
			{			
				pause = true;

				try 
				{
					sleep(1000);
				} catch (InterruptedException e) {e.printStackTrace();}

				pause = false;
				arco.botarFlecha();
				labelArco.setIcon(arco.imagem);
				
				//alvo.movimento = true;
				//labelFlecha.setVisible(true);
				
				labelFlechaCaida.setVisible(false);
			}
		}
	}

	// Responsavel pela movimentação dos alvos
	private class Movimento extends Thread 
	{
		public void run()
		{
			synchronized (this) 
			{
				while(true)
				{					
					// Alvo2
					if(alvo2.movimento && alvo2.direita) 
					{
						alvo2.x += 1;
						if(alvo2.x >= 870) 
						{
							alvo2.direita = false;	
						}
					} 
					else if(alvo2.movimento && !alvo2.direita) 
					{
						alvo2.x -= 1;

						if(alvo2.x <= 20) 
						{
							alvo2.direita = true;
						}
					}
					
					
					// Alvo 1
					if(alvo.movimento && alvo.direita) 
					{
						alvo.x += 1;
						if(alvo.x >= 870) 
						{
							alvo.direita = false;	
						}
					} 
					else if(alvo.movimento && !alvo.direita) 
					{
						alvo.x -= 1;

						if(alvo.x <= 20) 
						{
							alvo.direita = true;
						}
					}

					try
					{
						sleep(10);
					} catch(InterruptedException e) {e.printStackTrace();}

					labelAlvo.setBounds(alvo.x, alvo.y, alvo.tamanho.width, alvo.tamanho.height);
					labelAlvo2.setBounds(alvo2.x, alvo2.y, alvo2.tamanho.width, alvo2.tamanho.height);

				}//while
			}//synchronized
		}//rum()
	}//movimento()

	public static void main(String[] args) {
		new Estagio_1();
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
}

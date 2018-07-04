package segundava.aulas._020718.jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fase2 extends JFrame implements KeyListener{

	JLabel policia, ladrao;
	ImageIcon imagePolicia, imageLadrao;

	int cont =0;
	int posX=200, posY=200, incX, incY;

	Timer moveLadrao;

	Random rand = new Random();

	public Fase2(){
		super("Fase 2");
		imagePolicia = new ImageIcon(getClass().getResource("ball.gif"));
		imageLadrao = new ImageIcon(getClass().getResource("star.gif"));
		policia = new JLabel(imagePolicia);
		ladrao = new JLabel(imageLadrao);

		policia.setToolTipText("policia");
		ladrao.setToolTipText("ladr�o");

		policia.setBounds(posX, posY, 50, 50);

		ladrao.setBounds(aleatorio()+incX, aleatorio()+incY, 50,50);

		moveLadrao = new Timer(30, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int dirX, dirY;

				dirX = rand.nextInt(2);
				dirY = rand.nextInt(2);

				incX = rand.nextInt(5);
				incY = rand.nextInt(5);				

				if (dirX==1)
					if (dirY==1)				
						ladrao.setLocation(ladrao.getX()+incX, ladrao.getY()+incY);
					else
						ladrao.setLocation(ladrao.getX()+incX, ladrao.getY()-incY);
				else
					if (dirY==1)				
						ladrao.setLocation(ladrao.getX()-incX, ladrao.getY()+incY);
					else
						ladrao.setLocation(ladrao.getX()-incX, ladrao.getY()-incY);
				pegou();
			}
		});

		moveLadrao.start();

		add(policia);
		add(ladrao);

		addKeyListener(this);

		setLayout(null);
		setSize(300,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void pegou(){
		if((ladrao.getX()==policia.getX()) & (ladrao.getY()==policia.getY())){
			JOptionPane.showMessageDialog(null, "Pegou");
			System.exit(0);
		}
		
		if (cont==0){
		if(policia.getX()==policia.getX()){
//			JOptionPane.showMessageDialog(null, "Pegou");
//			new Fase1();
			cont++;
//				Thread.sleep(10);
		}
		}
	}

	public int aleatorio(){
		int i = ( 1 + ( int ) ( Math.random() * 10 ) );
		return  i ;
	}  

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_UP){posY--;}
		if (e.getKeyCode()==KeyEvent.VK_DOWN){posY++;}
		if (e.getKeyCode()==KeyEvent.VK_LEFT){posX--;}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT){posX++;}

		policia.setLocation(posX, posY);
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
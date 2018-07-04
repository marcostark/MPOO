package segundava.aulas._020718.jogo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fase1 extends JFrame implements KeyListener{

	JLabel img;
	ImageIcon image;
	
	private Som audio;	
	int posX=0, posY=0;

	public Fase1(){
		super("Fase 1");
		image = new ImageIcon(getClass().getResource("ball.gif"));
		
		img = new JLabel(image);
		img.setToolTipText("Bola");

		audio = new Som();
		audio.aberturaSom();
		
		img.setBounds(posX, posY, 50, 50);
		add(img);
		
		addKeyListener(this);

		setLayout(null);
		setSize(300,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void objetivo(){
		if((img.getX()==10) & (img.getY()==0)){
			JOptionPane.showMessageDialog(null, "alcan�ou o objetivo");
			dispose();//
			new Fase2();
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_UP){posY--;}
		if (e.getKeyCode()==KeyEvent.VK_DOWN){posY++;}
		if (e.getKeyCode()==KeyEvent.VK_LEFT){posX--;}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT){posX++;}
		
		objetivo();
		img.setLocation(posX, posY);
	}
	
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
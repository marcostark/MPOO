package segundava.exercicios.movimentopersonagem;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Cenario extends JFrame implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Cenario(){
		super("Cenario");
		
		addKeyListener(this);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
	}
	public void keyReleased(KeyEvent event) {}
	public void keyTyped(KeyEvent event) {}

}

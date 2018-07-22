package segundava.exercicios.tileSprite;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Tiled Map");
		jFrame.add(new GamePanel());
		jFrame.setResizable(false);
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
	}

}

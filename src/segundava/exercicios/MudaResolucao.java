package segundava.exercicios;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//  w w  w  .j av  a 2  s  .  co  m
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MudaResolucao {
	
	private static boolean programmatic = false;
	
	public static void main(String[] args) {
	
		
		    JFrame frame = new JFrame();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment()
		        .getDefaultScreenDevice();
		    
		    graphicsDevice.setFullScreenWindow(frame);
		    
		    // Setando a resolução e cores
		    graphicsDevice.setDisplayMode(new DisplayMode(800, 600, 32, 60));

		    frame.addWindowListener(new WindowAdapter() {
		      @Override
		      public void windowIconified(WindowEvent we) {
		        if (programmatic) {
		          programmatic = false;
		          frame.setState(JFrame.NORMAL);
		        }
		      }
		    });

		    JButton simpleBtn = new JButton();
		    simpleBtn.setText("Amostra");
		    
		    //final JPanel panel = new JPanel();

		    frame.add(simpleBtn);
		    //panel.add(simpleBtn);
		    //frame.add(panel);

		    simpleBtn.addActionListener(e -> {
		      programmatic = true;
		      JOptionPane.showMessageDialog(null, "Amostra");
		    });
		    frame.setVisible(true);
		  }	

}

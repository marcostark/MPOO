package primeirava.aulas._040618.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Tela extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField loginField;
	private JTextField senhaField;
	
	private JLabel loginLabel;
	private JLabel senhaLabel;
	
	private JButton jButton1;
	private JButton jButton2;
	//private JButton jButton3;

	
	public Tela(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2) {
		

		setTitle(tituloJanela);
		setSize(x, y);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER , 10,20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		loginField = new JTextField(15);
		senhaField = new JTextField(15);
		
		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("Senha");
		
		jButton1 = new JButton(nomeBotao1);
		jButton2 = new JButton(nomeBotao2);
		//jButton3 = new JButton(nomeBotao3);		
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);

		
		//add(jButton3);
		//loadButtons();
	}
	
	public void loadButtons() {
		add(jButton1);
		add(jButton2);
	}
	
	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}
	
	public JButton getConfirmarButton() {
		return jButton1;
	}

	public JButton getSairButton() {
		return jButton2;
	}
}

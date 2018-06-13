package primeirava.exercicios.extras._02.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel loginLabel;
	private JLabel senhaLabel;
	private JLabel cpfLabel;
	
	private JTextField loginField;
	private JPasswordField senhaPassField;
	private JTextField cpfField;
	
	private JButton adicionarButton;
	private JButton sairButton;
	
	public Tela() {
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		control();
		
	}

	private void control() {
		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("CPF");
		cpfLabel = new JLabel("Senha");
		
		loginField = new JTextField(10);
		senhaPassField = new JPasswordField(10);
		cpfField = new JTextField(10);
		
		adicionarButton = new JButton("Add");
		sairButton = new JButton("Sair");
	
	}
	

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaPassField() {
		return senhaPassField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	

}

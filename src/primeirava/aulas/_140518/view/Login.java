package primeirava.aulas._140518.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import primeirava.aulas._140518.controller.Controladora;


/*
 * MVC com tratamenteo de Eventos na propria classe
 * */
public class Login extends JFrame {
	
	private JLabel loginLabel, senhaLabel;
	private JButton confirmarButton;
	private JButton sairButton;
	private JTextField loginField ;
	private JPasswordField senhaField;
	
	public Login() {
		super("Login");
		
		setSize(120, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		loadComponents();
		
		setVisible(true);
	}
	
	
	public void loadComponents() {
		
		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("Senha");
		confirmarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		loginField = new JTextField(5);
		senhaField = new JPasswordField(5);
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(confirmarButton);
		add(sairButton);
		
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
}

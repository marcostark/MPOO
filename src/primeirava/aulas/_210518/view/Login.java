package primeirava.aulas._210518.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * MVC com tratamenteo de Eventos na propria classe
 * */
public class Login extends JFrame{
	
	private JButton confirmarButton;
	private JButton sairButton;
	
	private JTextField loginField;
	private JTextField senhaField;
	
	private JLabel loginLabel;
	private JLabel senhaLabel;
	
	private JButton addButton;
	private JButton removeButton;
	private JButton exibirButton;
	
	
	public Login(String tituloJanela, int x, int y, String nomeButao1, String nomeButao2) {
		super(tituloJanela);		
		
		setSize(x, y);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		confirmarButton = new JButton(nomeButao1);
		sairButton = new JButton(nomeButao2);
		
		loginField = new JTextField(5);
		senhaField = new JTextField(5);
		
		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("Senha");
		
		
		// Criar tela abstrata e suas especializações implementarão os add's
		// Adicionar nas especializações
		// No cadastro adicionar o sexo como atributo de usuario
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(confirmarButton);
		add(sairButton);		
		
		setVisible(true);		
		
		
	}



	public JButton getConfirmarButton() {
		return confirmarButton;
	}



	public JButton getSairButton() {
		return sairButton;
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
	
	
}


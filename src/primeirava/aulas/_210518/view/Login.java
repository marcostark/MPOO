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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton confirmarButton;
	private JButton sairButton;
	private JButton cadastrarButton;
	
	private JTextField loginField;
	private JTextField senhaField;
	
	private JLabel loginLabel;
	private JLabel senhaLabel;	
	
	public Login(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2, String nomeBotao3) {
		super(tituloJanela);		
		
		setSize(x, y);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER , 10,20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		confirmarButton = new JButton(nomeBotao1);
		sairButton = new JButton(nomeBotao2);
		cadastrarButton = new JButton(nomeBotao3);		
		
		loginField = new JTextField(15);
		senhaField = new JTextField(15);
		
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
		add(cadastrarButton);
		
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



	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	
	
}


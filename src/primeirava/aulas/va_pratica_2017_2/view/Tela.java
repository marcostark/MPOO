package primeirava.aulas.va_pratica_2017_2.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Tela extends JFrame{
	
	private JLabel loginLabel, cpfLabel, senhaLabel;
	private JTextField loginField, cpfField, senhaField;
	private JButton addButton, sairButton, cadastrarButton;
	
	
	public Tela() {
		
		setSize(400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER, 20,20));
		setLocationRelativeTo(null);
		control();
		setVisible(true);
		
		
	}

	private void control() {
		
		loginLabel = new JLabel("Login");
		cpfLabel = new JLabel("CPF");
		senhaLabel = new JLabel("Senha");
		
		loginField = new JTextField(10);
		cpfField = new JTextField(10);
		senhaField = new JTextField(10);
		
		addButton = new JButton("Add");
		sairButton = new JButton("Sair");
		cadastrarButton = new JButton("Cadastrar");		
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

}

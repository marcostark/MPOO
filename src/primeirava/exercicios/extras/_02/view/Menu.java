package primeirava.exercicios.extras._02.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton cadastrarJButton;
	private JButton logarJButton;
	private JButton sairJButton;
	
	
	public Menu() {
		super("Menu");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		this.control();
		pack();
		setVisible(true);
		
	}
	
	void control() {
		
		cadastrarJButton = new JButton("Cadastrar");
		logarJButton = new JButton("Logar");
		sairJButton = new JButton("Sair");
		
		add(cadastrarJButton);
		add(logarJButton);
		add(sairJButton);
	}
	
	public JButton getCadastrarJButton() {
		return cadastrarJButton;
	}
	public JButton getLogarJButton() {
		return logarJButton;
	}
	public JButton getSairJButton() {
		return sairJButton;
	}
}

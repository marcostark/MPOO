package primeirava.exercicios.extras._02.view;

import javax.swing.JButton;

public class Login extends Tela{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton entrarButton;
	
	public Login() {
		setTitle("Login");
		setSize(180,130);
		control();
		//pack();
		setVisible(true);
	}
	
	void control() {
		entrarButton = new JButton("Entrar");
		
		add(getLoginLabel());
		add(getLoginField());
		add(getSenhaLabel());
		add(getSenhaPassField());
		add(entrarButton);
		add(getSairButton());
	}
}

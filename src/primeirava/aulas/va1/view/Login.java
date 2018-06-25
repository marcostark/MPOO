package primeirava.aulas.va1.view;

public class Login extends Tela{

	
	public Login() {

		setTitle("Login");
		setSize(240,200);
		control();
		setVisible(true);	
		
	}
	
	public void control() {
		
		getLoginLabel().setText("Login/CPF");
		getAddButton().setText("Entrar");
		
		add(getLoginLabel());
		add(getLoginField());
		add(getSenhaLabel());
		add(getSenhaField());
		
		add(getAddButton());
		add(getSairButton());
		
	}
}

package primeirava.aulas.va_pratica_2017_2.view;

public class Login extends Tela{

	
	public Login() {

		setTitle("Login");
		setSize(240,200);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
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

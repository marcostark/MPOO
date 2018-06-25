package primeirava.aulas.va1.app;

import primeirava.aulas.va1.controller.LoginController;
import primeirava.aulas.va1.view.Cadastro;
import primeirava.aulas.va1.view.Login;
import primeirava.aulas.va1.view.Menu;

public class App {
	
	public static void main(String[] args) {
		
		//new Menu();
		//new Cadastro();
		Login login = new Login();
		
		new LoginController(login).control();
		
	}
}

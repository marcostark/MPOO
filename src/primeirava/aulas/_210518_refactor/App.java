package primeirava.aulas._210518_refactor;

import primeirava.aulas._210518_refactor.model.BaseDados;
import primeirava.aulas._210518_refactor.controller.ControllerLogin;
import primeirava.aulas._210518_refactor.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 280,200, "Confirmar", "Sair", "Cadastrar");
		
		BaseDados bd = new BaseDados();
		ControllerLogin controller = new ControllerLogin(login, bd);
		controller.control();
	}
}

package primeirava.aulas._040618;

import primeirava.aulas._040618.model.BaseDados;
import primeirava.aulas._040618.model.Caixa;
import primeirava.aulas._040618.model.Gerente;
import primeirava.aulas._040618.controller.ControllerLogin;
import primeirava.aulas._040618.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 280,220, "Confirmar", "Sair");
		
		BaseDados bd = new BaseDados();
		ControllerLogin controller = new ControllerLogin(login, bd);
		controller.control();

		// Usuarios pré cadastrados na base
		Caixa caixa = new Caixa("marcos", "marcos");
		Gerente gerente = new Gerente("paty", "paty");
		bd.addUsuario(caixa);
		bd.addUsuario(gerente);
	}
}

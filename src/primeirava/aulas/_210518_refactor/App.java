package primeirava.aulas._210518_refactor;

import primeirava.aulas._210518_refactor.model.BaseDados;
import primeirava.aulas._210518_refactor.model.Caixa;
import primeirava.aulas._210518_refactor.model.Gerente;
import primeirava.aulas._210518_refactor.controller.ControllerLogin;
import primeirava.aulas._210518_refactor.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 280,200, "Confirmar", "Sair");
		
		BaseDados bd = new BaseDados();
		ControllerLogin controller = new ControllerLogin(login, bd);
		controller.control();
		System.out.println("Testando");
		
		Caixa caixa = new Caixa("marcos", "marcos");
		Gerente gerente = new Gerente("paty", "paty");
		
		bd.addUsuario(caixa);
		bd.addUsuario(gerente);
	}
}

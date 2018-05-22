package primeirava.aulas._210518;

import primeirava.aulas._210518.model.BaseDados;
import primeirava.aulas._210518.controller.Controller;
import primeirava.aulas._210518.view.Cadastro;
import primeirava.aulas._210518.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 150,200, "Confirmar", "Sair");
		Cadastro cadastro = new Cadastro("Cadastrp", 150,200, "Add", "Remover");
		
		BaseDados bd = new BaseDados();
		
		Controller controller = new Controller(login,cadastro, bd);
		controller.control();
	}
}

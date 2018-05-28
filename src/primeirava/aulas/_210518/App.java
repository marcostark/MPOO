package primeirava.aulas._210518;

import primeirava.aulas._210518.model.BaseDados;
import primeirava.aulas._210518.controller.Controller;
import primeirava.aulas._210518.view.Cadastro;
import primeirava.aulas._210518.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 280,200, "Confirmar", "Sair", "Cadastrar");
		Cadastro cadastro = new Cadastro("Cadastro", 280,240, "Add", "Remover","Exibir");
		
		BaseDados bd = new BaseDados();
		
		Controller controller = new Controller(login,cadastro, bd);
		controller.control();
	}
}

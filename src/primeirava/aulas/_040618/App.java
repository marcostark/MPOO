package primeirava.aulas._040618;

import primeirava.aulas._040618.model.BaseDados;
import primeirava.aulas._040618.controller.Controller;
import primeirava.aulas._040618.view.Cadastro;
import primeirava.aulas._040618.view.Login;

public class App {
	
	public static void main(String[] args) {	
		Login login = new Login("Login", 280,200, "Confirmar", "Sair", "Cadastrar");
		Cadastro cadastro = new Cadastro("Cadastro", 280,240, "Add", "Remover","Exibir");
		
		BaseDados bd = new BaseDados();
		
		Controller controller = new Controller(login,cadastro, bd);
		controller.control();
		//System.out.println("Teste");
	}
}

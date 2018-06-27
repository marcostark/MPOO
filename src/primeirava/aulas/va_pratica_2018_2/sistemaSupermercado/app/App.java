package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.app;

import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.controller.CadastroController;
import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.controller.MenuController;
import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view.TelaCadastro;
import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view.TelaMenu;

public class App {
	public static void main(String[] args) {
		
		TelaMenu telaMenu = new TelaMenu(300,75,"Menu");
		TelaCadastro telaCadastro = new TelaCadastro(190,210,"Cadastro");
		
		new MenuController(telaMenu, telaCadastro).control();
		new CadastroController(telaCadastro).control();
		
	}

}

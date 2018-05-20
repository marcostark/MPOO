package primeirava.aulas._210518;

import primeirava.aulas._210518.controller.Controladora;
import primeirava.aulas._210518.controller.Controladora4;
import primeirava.aulas._210518.view.Login;

public class App {
	
	public static void main(String[] args) {
		
		Login login = new Login(); 
		new Controladora(login); // Implementando interface de eventos na propria classe
		//new Controladora2(login); // Usando classe interna anonima
		//new Controladora3(login); // Usando classe interna
		//new Controladora4(login); // Usando classe externa para tratar os eventos dos botões
		
	}
}

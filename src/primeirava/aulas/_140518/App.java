package primeirava.aulas._140518;

import primeirava.aulas._140518.controller.Controladora;
import primeirava.aulas._140518.controller.Controladora2;
import primeirava.aulas._140518.view.Login;

public class App {
	
	public static void main(String[] args) {
		
		Login login = new Login();
		new Controladora(login);
		//new Controladora2(login);
		
	}
}

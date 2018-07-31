package segundava._300718.app;

import segundava._300718.controller.LoginController;
import segundava._300718.view.TelaLogin;

public class App {
	
	public static void main(String[] args) {
		TelaLogin telaLogin = new TelaLogin();
		LoginController loginController = new LoginController(telaLogin);
		loginController.control();
	}

}

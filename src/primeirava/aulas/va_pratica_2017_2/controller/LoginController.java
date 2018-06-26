package primeirava.aulas.va_pratica_2017_2.controller;

import primeirava.aulas.va_pratica_2017_2.view.Login;

public class LoginController {
	
	private Login login;

	public LoginController(Login login) {
		super();
		this.login = login;
	}
	
	public void control() {
		
		login.getAddButton().addActionListener(new ButtonHundler(login));
		login.getSairButton().addActionListener(new ButtonHundler(login));
		
	}

}

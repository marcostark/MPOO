package primeirava.aulas.va1.controller;

import primeirava.aulas.va1.view.Login;

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

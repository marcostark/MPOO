package primeirava.aulas.va1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va1.view.Login;

public class ButtonHundler implements ActionListener {

	private Login login;
	
	public ButtonHundler(Login login) {
		this.login = login;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login.getAddButton()) {
			System.out.println("Cadastrar Usuario");
		}
		
		if(e.getSource() == login.getSairButton()) {
			System.out.println("Fechar janela de login");
		}
		
	}

}

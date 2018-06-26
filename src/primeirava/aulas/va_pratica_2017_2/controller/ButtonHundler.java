package primeirava.aulas.va_pratica_2017_2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va_pratica_2017_2.view.Login;

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
			this.login.setVisible(false);
		}
		
	}

}

package primeirava.aulas._140518.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import primeirava.aulas._140518.model.BaseDados;
import primeirava.aulas._140518.model.Usuario;
import primeirava.aulas._140518.view.Login;
import primeirava.aulas._140518.view.Mensagem;

public class ButtonHundler implements ActionListener{

	/*
	 * Classe para tratar eventos de botões
	 * */
	private JButton btn1;
	private JButton btn2;
	private Login login;

	public ButtonHundler(Login login, JButton btn1, JButton btn2) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1) {

				// View
				if(BaseDados.buscarUsuario(new Usuario(
						login.getLoginField().getText(),
						login.getSenhaField().getText()
					))) {
					
					// View
					Mensagem.exibirMensagem("Usuário Cadastrado");
				}else {
					Mensagem.exibirMensagem("Usuario não cadastrado");
				}
			} 
			else if (e.getSource() == btn2) {
				System.exit(0);
			}
	}

}

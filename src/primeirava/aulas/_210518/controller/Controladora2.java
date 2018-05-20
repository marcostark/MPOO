package primeirava.aulas._210518.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._210518.model.BaseDados;
import primeirava.aulas._210518.model.Usuario;
import primeirava.aulas._210518.view.Login;
import primeirava.aulas._210518.view.Mensagem;

// MVC tratamento de evento em classe interna anonima
public class Controladora2 {

	/* 
	 * Os models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * */
	
	private Login login;
	
	public Controladora2(Login login) {
		this.login = login;
		this.control();
	}
	
	/*
	 *Apenas o proprio botão conhece o seu evento, não precisa de comparação 
	 **/
	public void control() {
		login.getConfirmarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean status = true;
				
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
		});
		
		login.getSairButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}

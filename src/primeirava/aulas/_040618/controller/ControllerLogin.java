package primeirava.aulas._040618.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._040618.model.BaseDados;
import primeirava.aulas._040618.model.Caixa;
import primeirava.aulas._040618.view.Login;
import primeirava.aulas._040618.view.Mensagem;
import primeirava.aulas._040618.view.Cadastro;

// MVC 
public class ControllerLogin {

	private Login login;
	private BaseDados baseDados;

	/* 
	 * Models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * */
	
	public ControllerLogin(Login login) {
		this.login = login;
	}
	
	public ControllerLogin(Login login, BaseDados bd) {
		this.login = login;
		this.baseDados = bd;
	}
	
	// Usando classe interna anônima para tratar os eventos
	public void control() {
		
		login.getConfirmarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (baseDados.validarUsuario(new Caixa(login.getLoginField().getText(), login.getSenhaField().getText()))) {
					Mensagem.exibirMensagem("Login!");
				} else {
					Mensagem.exibirMensagem("Dados invalidos!");
				}
				
			}
		});
		
		login.getCadastrarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro("Login", 240,300, "Remover Usuários", "Sair");
				ControllerCadastro controller = new ControllerCadastro(cadastro, baseDados);
				controller.control();
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

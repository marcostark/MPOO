package primeirava.aulas._040618.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._040618.model.BaseDados;
import primeirava.aulas._040618.model.Caixa;
import primeirava.aulas._040618.model.Gerente;
import primeirava.aulas._040618.model.Usuario;
import primeirava.aulas._040618.view.Login;
import primeirava.aulas._040618.view.Mensagem;
import primeirava.aulas._040618.view.Cadastro;

// MVC 
public class Controller {

	private Login login;
	private Cadastro cadastro;
	private BaseDados baseDados;

	/* 
	 * Models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * */
	
	public Controller(Login login) {
		this.login = login;
	}
	
	public Controller(Login login, Cadastro cadastro, BaseDados bd) {
		this.login = login;
		this.cadastro = cadastro;
		this.baseDados = bd;
	}
	
	
	// Usando classe interna anônima para tratar os eventos
	public void control() {
		
//		cadastro.setVisible(false);
		
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
		
		login.getSairButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		login.getCadastrarButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.dispose();
				cadastro.setVisible(true);
				//cadastro.requestFocus();
				//Mensagem.exibirMensagem("Cadastrar Usuarios!");
			}
		});
		
				
		cadastro.getConfirmarButton().addActionListener(new ActionListener() {					
			@Override
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Gerente(cadastro.getLoginField().getText(), cadastro.getSenhaField().getText());
				if (baseDados.addUsuario(user)) {
					Mensagem.exibirMensagem("Usuario adicionado com sucesso!");
					cadastro.dispose();
					login.setVisible(true);
				} else {
					Mensagem.exibirMensagem("Erro!");
				}
						
			}
			
		});
		cadastro.getSairButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Gerente(cadastro.getLoginField().getText(), cadastro.getSenhaField().getText());
				if(baseDados.removeUsuario(user)){
					Mensagem.exibirMensagem("Usuario removido com sucesso!");
				} else {
					Mensagem.exibirMensagem("Erro!");
				}
			}
		});
		cadastro.getCadastrarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				baseDados.exibirUsuario();
//				Mensagem.exibirMensagem("Mostrar Usuarios");
			}
		});
		
		cadastro.getFemRadioButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		cadastro.getMascRadioButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
}

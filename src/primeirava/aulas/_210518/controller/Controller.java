package primeirava.aulas._210518.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._210518.model.BaseDados;
import primeirava.aulas._210518.view.Login;
import primeirava.aulas._210518.view.Mensagem;
import primeirava.aulas._210518.view.Cadastro;

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
		login.getConfirmarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mensagem.exibirMensagem("Login!");
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
				Mensagem.exibirMensagem("Cadastrar Usuarios!");
			}
		});
		
				
		cadastro.getConfirmarButton().addActionListener(new ActionListener() {					
			@Override
			public void actionPerformed(ActionEvent e) {
				Mensagem.exibirMensagem("Adicionar Usuario!");		
			}
			
		});
		cadastro.getSairButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mensagem.exibirMensagem("Remover Usuario!");
			}
		});
		cadastro.getCadastrarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mensagem.exibirMensagem("Mostrar Usuarios");
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

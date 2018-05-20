package primeirava.aulas._140518.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import primeirava.aulas._140518.model.BaseDados;
import primeirava.aulas._140518.model.Usuario;
import primeirava.aulas._140518.view.Login;
import primeirava.aulas._140518.view.Mensagem;

// MVC tratamento de evento em classe interna
public class Controladora3 {

	/* 
	 * Os models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * */
	
	private Login login;
	
	public Controladora3(Login login) {
		this.login = login;
		this.control();
	}
	
	public void control() {
		
		login.getConfirmarButton().addActionListener(new ButtonHundler());	
		login.getSairButton().addActionListener(new ButtonHundler());
		
	}
	
	
	/*
	 * Classe interna para tratamento de eventos.
	 * DICA: Usar esse metodo em tratemento simples de pequenos eventos
	 * uma vezq que cada ação deve ser implementada novamente, deixando o codigo
	 * muito grande e dificil de manter.
	 */
	public class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == login.getConfirmarButton()) {
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
			if (e.getSource() == login.getSairButton()) {
				System.exit(0);
			}

			
		}
		
	}
}

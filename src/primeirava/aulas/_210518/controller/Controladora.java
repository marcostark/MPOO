package primeirava.aulas._210518.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._210518.model.BaseDados;
import primeirava.aulas._210518.model.Usuario;
import primeirava.aulas._210518.view.Login;
import primeirava.aulas._210518.view.Mensagem;

// MVC tratado na propria classe
public class Controladora implements ActionListener{

	/* 
	 * Os models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * */
	
	private Login login;
	
	public Controladora(Login login) {
		this.login = login;
		this.control();
	}
	
	public void control() {
		login.getConfirmarButton().addActionListener(this);
		login.getSairButton().addActionListener(this);
	}
	
	// Aqui a classe tem que verificar quem é o autor do evento
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == login.getConfirmarButton()) {
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
		if(event.getSource() == login.getSairButton()){
			System.exit(0);
		}
		
		
		
	}

}

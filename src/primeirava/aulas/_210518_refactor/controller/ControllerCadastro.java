package primeirava.aulas._210518_refactor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._210518_refactor.view.Cadastro;
import primeirava.aulas._210518_refactor.model.BaseDados;
import primeirava.aulas._210518_refactor.model.Caixa;
import primeirava.aulas._210518_refactor.model.Gerente;
import primeirava.aulas._210518_refactor.model.Usuario;
import primeirava.aulas._210518_refactor.view.Mensagem;

public class ControllerCadastro {
	
	private Cadastro cadastro;
	private BaseDados baseDados;

	public ControllerCadastro(Cadastro cadastro, BaseDados bd) {
		this.cadastro = cadastro;
		this.baseDados = bd;
		this.control();
	}	
	
	public void control() {
		
		ButtonHundler buttonHundler = new ButtonHundler();
		
		this.cadastro.getCadastrarButton().addActionListener(buttonHundler);
		this.cadastro.getExibirButton().addActionListener(buttonHundler);
		this.cadastro.getConfirmarButton().addActionListener(buttonHundler);
		this.cadastro.getSairButton().addActionListener(buttonHundler);
	}
	
	public class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastro.getCadastrarButton().addActionListener(new ActionListener() {					
				@Override
				public void actionPerformed(ActionEvent e) {
					// Ternário
					if (
							baseDados.addUsuario(
							(cadastro.getGerenteRadioButton().isSelected() ? // Usar isSelected de preferencia
							new Gerente(
									cadastro.getLoginField().getText(),
									cadastro.getSenhaField().getText())
							: 
							new Caixa(
									cadastro.getLoginField().getText(),
									cadastro.getSenhaField().getText())
							))
						) 
					{ // fim if
						Mensagem.exibirMensagem("Usuario adicionado com sucesso!");
						cadastro.dispose();
					} else {
							Mensagem.exibirMensagem("Erro!");
					}
				}
			});
			
			cadastro.getSairButton().addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			cadastro.getConfirmarButton().addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					Mensagem.exibirMensagem("Remover usuários");
				}
			});
			
			cadastro.getExibirButton().addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String conteudo = "";
					// ArrayList de String
					for(String login:baseDados.consultarUsuarios()) {
						conteudo += login + "\n";
					}
					Mensagem.exibirMensagem(conteudo);					
				}
			});
		}
	}
}

package primeirava.aulas._210518_refactor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._210518_refactor.view.Cadastro;
import primeirava.aulas._210518_refactor.model.BaseDados;
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
		
		this.cadastro.getCadastrarButton().addActionListener(new ButtonHundler());		
	}
	
	public class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastro.getConfirmarButton().addActionListener(new ActionListener() {					
				@Override
				public void actionPerformed(ActionEvent e) {
					Usuario user = new Gerente(cadastro.getLoginField().getText(), cadastro.getSenhaField().getText());
					if (baseDados.addUsuario(user)) {
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
}

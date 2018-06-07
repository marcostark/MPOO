package primeirava.aulas._040618.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas._040618.view.Cadastro;
import primeirava.aulas._040618.model.BaseDados;
import primeirava.aulas._040618.model.Caixa;
import primeirava.aulas._040618.model.Gerente;
import primeirava.aulas._040618.model.Usuario;
import primeirava.aulas._040618.view.Mensagem;

public class ControllerCadastro {

	private Cadastro cadastro;
	private BaseDados baseDados;

	public ControllerCadastro(Cadastro cadastro, BaseDados bd) {
		this.cadastro = cadastro;
		this.baseDados = bd;
	}

	public void control() {

		ButtonHundler buttonHundler = new ButtonHundler();

		cadastro.getCadastrarButton().addActionListener(buttonHundler);
		cadastro.getExibirButton().addActionListener(buttonHundler);
		cadastro.getConfirmarButton().addActionListener(buttonHundler);
		cadastro.getSairButton().addActionListener(buttonHundler);
	}

	// Usando classe interna para tratar os eventos dos botões
	private class ButtonHundler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cadastro.getCadastrarButton()) {

				// Ternário
				if (baseDados.addUsuario((cadastro.getGerenteRadioButton().isSelected() ? // Usar isSelected de
																							// preferencia
						new Gerente(cadastro.getLoginField().getText(), cadastro.getSenhaField().getText())
						: new Caixa(cadastro.getLoginField().getText(), cadastro.getSenhaField().getText())))) { // fim
																													// if
					Mensagem.exibirMensagem("Usuario adicionado com sucesso!");
					cadastro.dispose();
				} else {
					Mensagem.exibirMensagem("Erro!");
				}
			} 

			
			if (e.getSource() == cadastro.getExibirButton()) {
				String conteudo = "";
				// ArrayList de String
				for (String login : baseDados.consultarUsuarios()) {
					conteudo += login + "\n";
				}
				Mensagem.exibirMensagem(conteudo);
			} 

			
			if (e.getSource() == cadastro.getSairButton()) {
				System.exit(0);
			} 

		
			if (e.getSource() == cadastro.getConfirmarButton()) {
				Mensagem.exibirMensagem("Remover usuários");
			} 

		}// Fim actionPerformed
	}
}

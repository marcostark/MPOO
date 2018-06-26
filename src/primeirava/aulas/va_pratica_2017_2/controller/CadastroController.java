package primeirava.aulas.va_pratica_2017_2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va_pratica_2017_2.view.Cadastro;

public class CadastroController {
	
	private Cadastro cadastro;

	public CadastroController(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	public void control() {
		
		cadastro.getAddButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cadastrar");
			}
		});
		
		cadastro.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastro.setVisible(false);
			}
		});

	}
}

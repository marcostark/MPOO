package primeirava.aulas.va1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va1.view.Cadastro;

public class CadastroController {
	
	private Cadastro cadastro;

	public CadastroController(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	public void control() {
		
		cadastro.getAddButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		cadastro.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}
}

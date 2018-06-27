package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view.TelaCadastro;

public class CadastroController {

	private TelaCadastro telaCadastro;

	public CadastroController(TelaCadastro telaCadastro) {
		this.telaCadastro = telaCadastro;
	}
	
	public void control() {
		
		this.telaCadastro.getAddButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		this.telaCadastro.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastro.setVisible(false);
			}	
		});
		
	}
}

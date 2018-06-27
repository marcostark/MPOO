package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view.TelaCadastro;
import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view.TelaMenu;

public class MenuController implements ActionListener{
	
	private TelaMenu telaMenu;
	private TelaCadastro telaCadastro;

	public MenuController(TelaMenu telaMenu, TelaCadastro telaCadastro) {
		this.telaMenu = telaMenu;
		this.telaCadastro = telaCadastro;
	}
	
	public void control() {
		
		this.telaMenu.getCadastrarButton().addActionListener(this);
		this.telaMenu.getValidarButton().addActionListener(this);
		this.telaMenu.getSairButton().addActionListener(this);
		
	}

	public TelaMenu getTelaMenu() {
		return telaMenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaMenu.getCadastrarButton()) {
			telaCadastro.setVisible(true);
		}
		if(e.getSource() == telaMenu.getValidarButton()) {
			System.out.println("Validar!");
		}
		if(e.getSource() == telaMenu.getSairButton()) {
			System.exit(0);
		}
		
	}
}

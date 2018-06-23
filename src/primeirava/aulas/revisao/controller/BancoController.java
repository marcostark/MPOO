package primeirava.aulas.revisao.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import primeirava.aulas.revisao.view.Banco;

public class BancoController {
	
	private Banco banco;

	public BancoController(Banco banco) {
		this.banco = banco;
	}
	
	public void control() {
		
		banco.getConfirmarButton().addActionListener(new ButtonHundler());
		
	}
	
	private class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == banco.getConfirmarButton()) {
				JOptionPane.showMessageDialog(null, "Confirmar");
			}
		}
	}
}

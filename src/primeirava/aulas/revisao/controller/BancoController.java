package primeirava.aulas.revisao.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import primeirava.aulas.revisao.model.BaseDeDados;
import primeirava.aulas.revisao.model.Conta;
import primeirava.aulas.revisao.view.Banco;

public class BancoController {
	
	
	private Banco banco;
	private BaseDeDados bd;

	public BancoController(Banco banco) {
		this.banco = banco;
		this.bd = new BaseDeDados();		
		
	}
	
	public void control() {
		
		banco.getConfirmarButton().addActionListener(new ButtonHundler());
		
	}
	
	private class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == banco.getConfirmarButton()) {
				
				// VER ISSO
				//Conta conta = bd.buscar(banco.getNumeroDestinoField().getText()); 				
				
				JOptionPane.showMessageDialog(null, "Tranferir Dinheiro");
			}
			
		}
		
	}

}

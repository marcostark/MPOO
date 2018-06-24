package primeirava.aulas.revisao.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import primeirava.aulas.revisao.model.BaseDeDados;
import primeirava.aulas.revisao.model.ContaCorrente;
import primeirava.aulas.revisao.view.Banco;
import primeirava.aulas.revisao.view.Mensagem;

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
				if (bd.buscar(banco.getNumeroDestinoField().getText()) instanceof ContaCorrente) { 				
					Mensagem.mostrarMensagem("Conta Corrente");
				} else {
					Mensagem.mostrarMensagem("Conta Poupança ");
				}
				
				//Mensagem.mostrarMensagem("Tranferencia Dinheiro");
			}
			
		}
		
	}

}

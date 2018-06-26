package primeirava.aulas.revisao.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import primeirava.aulas.revisao.model.BaseDeDados;
import primeirava.aulas.revisao.model.Conta;
import primeirava.aulas.revisao.model.ContaCorrente;
import primeirava.aulas.revisao.model.ContaPoupanca;
import primeirava.aulas.revisao.view.Banco;
import primeirava.aulas.revisao.view.Mensagem;

public class BancoController {
	
	
	private Banco banco;
	private BaseDeDados bd;

	public BancoController(Banco banco, BaseDeDados bd) {
		this.banco = banco;
		this.bd = bd;		
	}
	
	public void control() {
		
		banco.getConfirmarButton().addActionListener(new ButtonHundler());
		banco.getConfirmarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	private class ButtonHundler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == banco.getConfirmarButton()) {
				
				// VER ISSO
				
				String origem = banco.getNumeroOrigemField().getText();
				String saldo = banco.getSaldoOrigemLabel().getText();
				
				String destino = banco.getNumeroDestinoField().getText();;
						
				Conta contaOrigem = bd.buscar(Integer.parseInt(origem));
				Conta contaDestino = bd.buscar(Integer.parseInt(destino));

				if (origem != null) {
					if (contaOrigem instanceof ContaCorrente) { 				
						Mensagem.mostrarMensagem("Conta Corrente");
					} 
					if (contaOrigem instanceof ContaPoupanca) {
						Mensagem.mostrarMensagem("Conta Poupança ");
					}
				}else {
					Mensagem.mostrarMensagem("Conta não encontrada!");
				}
			}
		}
	}
}

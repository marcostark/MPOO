package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		
		conta = new Conta();
		conta.setNumero(123456);
		conta.setAgencia("1234");
		conta.setTitular("Stark");
	}
	
	public void saca(Evento evento) {
		double valor = evento.getDouble("valor");
		this.conta.sacar(valor);
	}
	
	public void deposita(Evento evento) {
		double valor = evento.getDouble("valor");
		this.conta.depositar(valor);
	}
}

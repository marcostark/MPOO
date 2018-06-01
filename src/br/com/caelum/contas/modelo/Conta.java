package br.com.caelum.contas.modelo;

import variados.caelumfj11.banco.Cliente;
import variados.caelumfj11.banco.Data;

public class Conta {
	
	private String agencia;
	private int numero;
	private String titular;
	private double saldo;
	
	/**
	 * Classe responsável por moldar as contas do Banco
	 * @author Marcos Stark
	 */
	
	public Conta() {}
	public Conta(int numero, String agencia, String titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}
	
	public String getTipo() {
		return "Conta";
	}
	
	/**
	 * Métodos (Sacar e Depositar) responsáveis por manipular o atributo saldo, 
	 * @param valor
	 * @return boolean
	 */
	
	public boolean sacar(double valor) {
		if(this.saldo > 0 && this.saldo >= valor) {
			this.saldo = saldo - valor;
			return true;
		} 
		return false;
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean transferePara(Conta conta, double valor) {
		if(this.sacar(valor) && conta.depositar(valor)) {
			return true;
		}
		return false;
	}
	
	public double calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}	
	
	@Override
	public String toString() {
		return "-----------------------" + 
				"\nTitular: " + this.titular +
				"\nSaldo: " + this.saldo +
				"\nNumero: " + this.numero +
				"\nSaldo: " + this.agencia +
				"\n-----------------------";
	}

}


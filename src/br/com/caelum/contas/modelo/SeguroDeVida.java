package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{

	private double valor;
	private String titular;
	private int numeroApolice;
	
	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return valor;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}

	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}

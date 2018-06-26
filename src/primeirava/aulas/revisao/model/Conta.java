package primeirava.aulas.revisao.model;

public abstract class Conta {
	
	private double saldo;
	private int numero;
	private Cliente cliente;

	public Conta(double saldo, int numero) {
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = new Cliente(this); // Não Restringi o uso de acesso ao objeto 
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar(double valor) {
		// Verificação na hora que passar o valor na tela (Usar metodo consume())
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta [saldo = " + saldo + ", numero = " + numero + ", cliente = " + cliente.getNome() + "]";
	}
}

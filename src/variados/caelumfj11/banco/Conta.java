package variados.caelumfj11.banco;

public class Conta {
	
	private static int totalContasCriadas;
	private String agencia;
	private int numero;
	private Cliente cliente;
	private Data data;
	private double saldo;
	
	/**
	 * Classe responsável por moldar as contas do Banco
	 * @author Marcos Stark
	 */
	
	public Conta() {}
	public Conta(int numero, String agencia, Cliente cliente, double saldo, Data data) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
		this.data = data;
		
		this.totalContasCriadas += 1;
	}
	
	public static int getTotalContasCriadas() {
		return totalContasCriadas;
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
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}	
	
	public Data getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return "-----------------------" + 
				"\nTitular: " + this.cliente.getNome() +
				"\nSaldo: " + this.saldo +
				"\nNumero: " + this.numero +
				"\nSaldo: " + this.agencia +
				"\nData de abertura: " + this.data +
				"\n-----------------------";
	}
	
	

}

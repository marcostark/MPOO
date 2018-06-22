package primeirava.aulas.revisao.model;

public class ContaPoupanca extends Conta{
	
	private int dv = 1;
	//Questionamento: Se dv pode ser 1 ou 51, como fica a manipulação do saldo
	// O dv identifica a poupanca, cada dv possui seu proprio saldo.
	// sacar e depositar no dv 1 é diferente de mexer no saldo de dv 51.
	
	public ContaPoupanca(double saldo, int numero) {
		super(saldo, numero);
		//this.dv = dv; // Já está default
	}

	public boolean renderJuros() {
		return this.depositar(getSaldo() + getSaldo() * 0.0067);
	}

	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor);
	}

	@Override
	public boolean depositar(double valor) {
		return super.depositar(valor);
	}
	
	// Sobreescrever o metodo sacar e depositar para tratar o dv 
	// A conta terá dois saldos
	
	
	
	
}

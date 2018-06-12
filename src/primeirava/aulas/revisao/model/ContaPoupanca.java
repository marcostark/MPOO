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
	
	// Sobreescrever o metodo sacar e depositar
	
	
}

package primeirava.aulas.revisao.model;

public class ContaCorrente extends Conta{

	public ContaCorrente(double saldo, int numero) {
		super(saldo, numero);
	}
	
	public boolean correrJuros(double taxa) {
		return sacar(getSaldo() - getSaldo() * taxa);
	}
}

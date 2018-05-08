package primeiraVA.aulas._070518;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public Gerente(String nome) {
		super(nome);
	}

	public void darDesconto() {
		System.out.println("Dar desconto");
	}

}

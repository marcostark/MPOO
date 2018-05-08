package primeiraVA.aulas._070518;

public class Caixa extends Funcionario {

	public Caixa(String nome) {
		super(nome);		
	}
	
	public Caixa(String nome, double salario) {
		super(nome, salario);		
	}
	
	public void vender() {
		System.out.println("Vendeu");
	}
	
}

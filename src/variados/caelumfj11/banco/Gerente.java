package variados.caelumfj11.banco;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private int numDeFuncionariosGerenciados;
	
	
	public Gerente() {}
	public Gerente(String nome, String cpf, double salario, int senha, int numDeFuncionariosGerenciados) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numDeFuncionariosGerenciados = numDeFuncionariosGerenciados;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
//		return super.getBonificacao() + 1000;
		// Chama o metodo da classe mãe adicionado 1000 ao valor retornado por ela
		
		return this.getSalario() * 1.4 + 1000;
	}	
	
	// Sobrescrevendo o metodo da classe mãe
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nFuncionarios Gerenciados: " + this.numDeFuncionariosGerenciados;
	}
	// Getters and Setters
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getNumDeFuncionariosGerenciados() {
		return numDeFuncionariosGerenciados;
	}
	public void setNumDeFuncionariosGerenciados(int numDeFuncionariosGerenciados) {
		this.numDeFuncionariosGerenciados = numDeFuncionariosGerenciados;
	}
	
}

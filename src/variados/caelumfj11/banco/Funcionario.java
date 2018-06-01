package variados.caelumfj11.banco;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario() {}
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome 
				+ "\nCPF: " + this.cpf
				+ "\nBonificação: " + this.getBonificacao();
	}
	
	

}


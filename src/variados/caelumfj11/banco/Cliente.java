package variados.caelumfj11.banco;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String cpf;	
	
	public Cliente() {}
	public Cliente(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public void alteraCPF(String cpf) {
		this.validaCPF(cpf);
	}
	
	private void validaCPF(String cpf) {
		// Validar CPF...
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

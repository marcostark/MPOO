package primeirava.exercicios.extras._02.model;

public abstract class Pessoa implements Validador{
	
	private String cpf;

	public Pessoa(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

}

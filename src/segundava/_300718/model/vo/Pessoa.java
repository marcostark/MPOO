package segundava._300718.model.vo;

public abstract class Pessoa {
	
	String nome;
	String cpf;
	String estado; // Vindo do combobox
	String sexo;

	/**
	 * @param nome
	 * @param cpf
	 * @param estado
	 * @param sexo
	 */
	public Pessoa(String nome, String cpf, String estado, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.estado = estado;
		this.sexo = sexo;
	}
	
	public Pessoa(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}

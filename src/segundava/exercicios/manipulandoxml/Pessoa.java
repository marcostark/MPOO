package segundava.exercicios.manipulandoxml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Pessoa")
public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
	
	
	
	

}

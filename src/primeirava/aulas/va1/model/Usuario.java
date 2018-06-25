package primeirava.aulas.va1.model;

public class Usuario extends Pessoa{

	private String login;
	private String senha;
	
	public Usuario(String cpf, String login, String senha) {
		super(cpf);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

}

package primeirava.aulas._210518_refactor.model;

public abstract class Usuario {

	private String login;
	private String senha;
	
	public Usuario() {}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario: "+ this.getLogin() + " Senha: " + this.getSenha();
	}	
}

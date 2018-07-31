package segundava._300718.model.vo;

public class UsuarioVO extends Pessoa{
	
	String login;
	String senha;

	public UsuarioVO(String sexo, String login, String senha) {
		super(sexo);
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
	
}

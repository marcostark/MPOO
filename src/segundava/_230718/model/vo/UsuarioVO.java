package segundava._230718.model.vo;

public class UsuarioVO {
	
	private String login;
	private String senha;
	private String nome;
	private String cpf;
	private boolean isPCD;
	
	public UsuarioVO(String login, String senha, String nome) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		//this.isPCD = pcd;
	}
	
	public UsuarioVO(String login, String senha, String nome, boolean pcd) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.isPCD = pcd;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean isPCD() {
		return isPCD;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}

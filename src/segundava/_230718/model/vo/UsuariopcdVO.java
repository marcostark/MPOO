package segundava._230718.model.vo;

public class UsuariopcdVO extends UsuarioVO{

	private String inss;
	
	
	public UsuariopcdVO(String login, String senha, String nome, boolean pcd, String inss) {
		super(login, senha, nome, pcd);
		
		this.inss = inss;
		
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}
}

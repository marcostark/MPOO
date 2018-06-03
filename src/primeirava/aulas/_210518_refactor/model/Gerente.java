package primeirava.aulas._210518_refactor.model;

public class Gerente extends Usuario{
	
	public Gerente(String login, String senha) {
		super(login, senha);
	}
	
	public void darDesconto() {}

	// Implementar metodo toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

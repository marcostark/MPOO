package primeirava.aulas._300418;

public class Usuario {

	private String nome;
	private String senha;
	
	
	//POLIMORFISMO: Permitir que um metodo tenha comportamentos diferentes (Implementar a sobrecarga de metodos)
	// SOBRECARGA: Permitir mais de um metodo com o mesmo nome
	public Usuario() {}
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}		
	
	// Liberar memoria com o garbage coletor
	public static void destroyer(Usuario usuario) {
		usuario = null;
		System.gc();
	}
}

package primeiraVA.aulas.mercadinho;

public class App {
		
	public static void main(String[] args) {
	
		Usuario usuario = new Usuario();
		usuario.setNome("admin");
		usuario.setSenha("admin");
		
		System.out.println(Login.validaUsuario(usuario));
		
	}
}

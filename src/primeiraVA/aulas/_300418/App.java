package primeiraVA.aulas._300418;

public class App {
		
	public static void main(String[] args) {
	
		Usuario user1 = new Usuario("admin", "adm");
		Usuario user2 = new Usuario("login", "senha");

		System.out.println(Login.validaUsuario(user1));
				
	}
}

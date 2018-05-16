package primeirava.aulas._140518.model;

public class BaseDados {
	
	private static Usuario userCadastrado = new Usuario("Marcos", "123");
	
	// CRUD -> Create, Read, Update, Delete
	
	public static boolean buscarUsuario(Usuario user) {
		
		if(user.getLogin().equalsIgnoreCase(userCadastrado.getLogin()) 
				&& user.getSenha().equals(userCadastrado.getSenha())) {
			return true;
		}
		
		return false;
	}
	
	public static boolean buscarUsuario(String login, String senha) {
		if(login.equalsIgnoreCase(userCadastrado.getLogin()) 
				&& senha.equals(userCadastrado.getSenha())) {
			return true;
		}
		return false;
	}

}

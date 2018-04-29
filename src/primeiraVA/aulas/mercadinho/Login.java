package primeiraVA.aulas.mercadinho;

public class Login {
	
	public static boolean validaUsuario(Usuario usuario) {
		
		if(usuario.getNome().equals("admin") 
				&& usuario.getSenha().equals("admin")) {
			return true;
		}
		
		return false;
	}

}

package primeiraVA.aulas._300418;

public class Login {
	
	public static boolean validaUsuario(Usuario usuario) {
		
		if(usuario.getNome().equals(BaseDados.user1.getNome()) 
				&& usuario.getSenha().equals(BaseDados.user1.getSenha())) {
			return true;
		} else if (usuario.getNome().equals(BaseDados.user2.getNome()) 
				&& usuario.getSenha().equals(BaseDados.user2.getSenha())) {
			return true;
		} else {
			return false;
		}
		
	}

}

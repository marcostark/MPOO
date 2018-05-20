package primeirava.aulas._210518.model;

import java.util.Arrays;
import java.util.List;

public class BaseDados {
	
//	private static Usuario userCadastrado = new Usuario("Marcos", "123");
	private static Usuario user1 = new Usuario("Marcos", "0123");
	private static Usuario user2 = new Usuario("Patricia", "1234");
	
	private static List<Usuario> usuarios = Arrays.asList(user1,user2);
	
	
	// CRUD -> Create, Read, Update, Delete
	
//	public static boolean buscarUsuario(Usuario user) {
//		
//		if(user.getLogin().equalsIgnoreCase(userCadastrado.getLogin()) 
//				&& user.getSenha().equals(userCadastrado.getSenha())) {
//			return true;
//		}
//		
//		return false;
//	}
	
	public static boolean buscarUsuario(Usuario user) {
	
		for(Usuario usuario: usuarios) {
			//System.out.println("Login:  " + usuario.getLogin() + " Senha: " + usuario.getSenha());
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin()) 
					&& user.getSenha().equals(usuario.getSenha())) {
				return true;
			}
		}
		return false;
	}	
}

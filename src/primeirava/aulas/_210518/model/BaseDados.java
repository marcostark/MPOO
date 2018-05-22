package primeirava.aulas._210518.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDados {
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public boolean addUsuario(Usuario usuario) {
		
		for (Usuario user: usuarios) {
			if(user.getLogin().equalsIgnoreCase(user.getLogin())) {
				return false;
			}
		}
			return usuarios.add(usuario);
	}
	
	public boolean removeUsuario(Usuario usuario) {
		for(Usuario user: usuarios) {
			if(user.getLogin().contains(usuario.getLogin())) {
				return usuarios.remove(usuario);
			}
		}
		return false;
	}
	
	public static void exibirUsuario() {
		usuarios.forEach(l -> System.out.println(l.getLogin()));		
	}
		
	// É possivel implementar de outra forma
	public static boolean validarUsuario(Usuario usuario) {
		/*
		for(Usuario user: usuarios) {
			if(user.getLogin().contains(usuario.getLogin())
					&& user.getLogin().equals(usuario.getSenha())) {
				return true;
			}
		}*/
		
		return  usuarios.contains(usuario);
		
	}
	
	public static void main(String[] args) {
		
		Usuario user1 = new Caixa("Marcos", "0123");
		BaseDados.validarUsuario(user1);
		
	}
	
}

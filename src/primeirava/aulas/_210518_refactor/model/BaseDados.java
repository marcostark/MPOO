package primeirava.aulas._210518_refactor.model;

import java.util.ArrayList;

public class BaseDados {
	
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
	
	public boolean addUsuario(Usuario usuario) {
			if(usuarios.contains(buscarUsuario(usuario))) {
				return false;
			}
		return usuarios.add(usuario);
	}
	
	
	public boolean removeUsuario(Usuario usuario) {		
			return usuarios.remove(buscarUsuario(usuario));	
	}
	
	public void exibirUsuario() {
		usuarios.forEach(l -> System.out.println(l));		
	}
			
	// É possivel implementar de outra forma
	public boolean validarUsuario(Usuario usuario) {
		
		for(Usuario user: usuarios) {
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin())
					&& user.getSenha().equals(usuario.getSenha())) {
				return true;
			}
		}
		return false;		
	}
	
	private Usuario buscarUsuario(Usuario usuario) {
		for(Usuario user : usuarios) {
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin())) {
				return user;
			}
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		
//		BaseDados bd = new BaseDados();
//		
//		Usuario user1 = new Gerente("Souza", "0123");
//		Usuario user2 = new Caixa("Patricia", "0123");
//		Usuario user3 = new Gerente("Patricia", "0123");
//		bd.addUsuario(user1);
//		bd.addUsuario(user2);
//		bd.addUsuario(user3);
//		
//		bd.exibirUsuario();		
//	}
//	
}

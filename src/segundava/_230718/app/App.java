package segundava._230718.app;

import java.awt.List;
import java.util.ArrayList;

import segundava._230718.model.dao.UsuarioDAO;
import segundava._230718.model.vo.BaseDados;
import segundava._230718.model.vo.UsuarioVO;
import segundava._230718.model.vo.UsuariopcdVO;
import segundava._230718.view.TelaLogin;

public class App {

	public static void main(String[] args) {
		//TelaLogin telaLogin = new TelaLogin();
		
		UsuarioVO usuarioVO = new UsuarioVO("marcos", "123", "Marcos");
		UsuarioVO usuarioVO2 = new UsuarioVO("patricia", "123", "Patricia");
		UsuariopcdVO usuarioPcdVO = new UsuariopcdVO("marcos123", "123", "Marcos123", true, "123456");
		
		UsuarioDAO.adicionarUsuario(usuarioVO);
		UsuarioDAO.adicionarUsuario(usuarioVO2);
		UsuarioDAO.adicionarUsuario(usuarioPcdVO);
		
		//ArrayList<UsuarioVO> listaUsuario = BaseDados.getUsuariosVOs();
		
		for(UsuarioVO user: BaseDados.getUsuariosVOs()) {
			System.out.println("Nome: " + user.getNome());
		}
		
	}
}

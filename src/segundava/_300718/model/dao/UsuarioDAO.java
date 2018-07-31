package segundava._300718.model.dao;

import segundava._300718.model.bo.UsuarioBO;
import segundava._300718.model.vo.BaseDados;
import segundava._300718.model.vo.UsuarioVO;

public class UsuarioDAO {
	
	public static boolean adicionarUsuario(UsuarioVO usuarioVO) {
		if(UsuarioBO.verificarUsuario(usuarioVO.getLogin())) {
			BaseDados.getUsuariosVO().add(usuarioVO);
			return true;
		}
		return false;		
	}
	
	public static boolean removerUsuario(UsuarioVO usuarioVO) {
		return false;
	}
	
	public static UsuarioVO buscarUsuario(String login) {
		return null;
	}
	
//	public static ArrayList<UsuarioVO> buscarUsuario(UsuarioVO usuarioVO) {
//		return null;
//	}
	
	public static boolean atualizarUsuario(UsuarioVO usuarioVO) {
		return false;
	}

}

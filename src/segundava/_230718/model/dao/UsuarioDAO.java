package segundava._230718.model.dao;

import java.util.ArrayList;

import segundava._230718.model.vo.BaseDados;
import segundava._230718.model.vo.UsuarioVO;
import segundava._230718.model.vo.UsuariopcdVO;

public class UsuarioDAO {
	
	public static boolean adicionarUsuario(UsuarioVO usuarioVO) {
		// sem preocupação de usuario já existir... Verificar se usuario já existir
		// Precisa verificar em cada um dos tipos de metodos, cada um tem uma busca diferente
		
		return adicionarUsuarioRAM(usuarioVO);
//		adicionarUsuarioTXT;
//		adicionarUsuarioXML;
//		adicionarUsuarioMySQL;
	}

	private static boolean adicionarUsuarioRAM(UsuarioVO usuarioVO) {
		return BaseDados.getUsuariosVOs().add(usuarioVO);		
	}
		
	private static boolean adicionarUsuarioXML(UsuarioVO usuarioVO) {
		return false;
	}
	
	private static boolean adicionarUsuarioSQL(UsuarioVO usuarioVO) {
		return false;
	}

	public static boolean removerUsuario(UsuarioVO userVO) {return false;}
	
	public static boolean editarUsuario(UsuarioVO userVO) {
		//Tem que tá na base
		for(UsuarioVO usuVO: BaseDados.getUsuariosVOs()) {
			if(usuVO.getLogin().equals(userVO.getLogin())) {
				
				if(usuVO instanceof UsuariopcdVO) {
					usuVO.setSenha(userVO.getSenha());
					((UsuariopcdVO)usuVO).setInss(((UsuariopcdVO)userVO).getInss());
					return true;
				}
				UsuarioVO userTemp = userVO;
				removerUsuario(userVO);
				adicionarUsuario(userTemp);
				
				
			}
		}
		
		return false;		
	}
	
	public static boolean buscarUsuario(UsuarioVO usuarioVo) {
		
//		for(UsuarioVO usuVO : BaseDados.getUsuariosVOs()) {
//			if(usuVO instanceof UsuariopcdVO) {
//				if(
//						((UsuariopcdVO)usuVO).getInss().equals(((UsuariopcdVO)usuarioVo).getInss())) {
//					return true;
//				}
//			}
//		}
//		return false;
		for(UsuarioVO usuVO : BaseDados.getUsuariosVOs()) {
				if(usuVO.getLogin().equals(usuarioVo.getLogin())){
					return true;
				}
		}
		return false;	
	}
	
	public static boolean buscarUsuario(UsuariopcdVO usuariopcdVO) {		
		return false;
	}
	
	public ArrayList<UsuarioVO> listarUsuario(){
		
		return BaseDados.getUsuariosVOs();
		
	}

}

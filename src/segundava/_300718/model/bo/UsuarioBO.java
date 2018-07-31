package segundava._300718.model.bo;

import segundava._300718.model.vo.BaseDados;
import segundava._300718.model.vo.UsuarioVO;

public class UsuarioBO {
	
	public static boolean verificarUsuario(String login) {
		
//		if(BaseDados.getUsuariosVO().contains(login)){
//			return true;
//		}
		
		for (UsuarioVO userVO: BaseDados.getUsuariosVO()) {
			if(userVO.equals(login)) {
				return false;
				
			}
		}		
		return true;
	}

}

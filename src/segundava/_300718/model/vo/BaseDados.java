package segundava._300718.model.vo;

import java.util.ArrayList;

//Trocar por base de dados 

public class BaseDados {
	
	static ArrayList<UsuarioVO> usuariosVO = new ArrayList<>();

	public static ArrayList<UsuarioVO> getUsuariosVO() {
		return usuariosVO;
	}

	public static void setUsuariosVO(ArrayList<UsuarioVO> usuariosVO) {
		BaseDados.usuariosVO = usuariosVO;
	}

}

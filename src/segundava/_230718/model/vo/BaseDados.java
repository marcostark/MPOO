package segundava._230718.model.vo;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<UsuarioVO> usuariosVOs = new ArrayList<>();

	public static ArrayList<UsuarioVO> getUsuariosVOs() {
		return usuariosVOs;
	}

	public static void setUsuariosVOs(ArrayList<UsuarioVO> usuariosVOs) {
		BaseDados.usuariosVOs = usuariosVOs;
	}

	

}

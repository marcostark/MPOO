package segundava._230718.model.bo;

import segundava._230718.model.dao.UsuarioDAO;
import segundava._230718.model.vo.BaseDados;
import segundava._230718.model.vo.UsuarioInvalidoVO;
import segundava._230718.model.vo.UsuarioVO;
import segundava._230718.model.vo.UsuariopcdVO;

public class UsuariopcdBO {
	
	public double calcularDescontoVeiculo(UsuariopcdVO usuariopcdVO, double valor) throws UsuarioInvalidoVO{
		if (UsuarioDAO.buscarUsuario(usuariopcdVO))
			return (valor * 0.9);
		else
			throw new UsuarioInvalidoVO();
	}
	
	public double calcularDescontoVeiculo(UsuarioVO usuarioVO, double valor){
		if (usuarioVO instanceof UsuariopcdVO)		
			return (valor * 0.9);
		else
			return(valor);
	}
}

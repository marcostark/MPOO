package segundava._300718.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import segundava._300718.model.dao.UsuarioDAO;
import segundava._300718.model.vo.BaseDados;
import segundava._300718.model.vo.CampoInvalidoException;
import segundava._300718.model.vo.UsuarioVO;
import segundava._300718.view.TelaLogin;

public class LoginController {

	TelaLogin telaLogin;

	public LoginController(TelaLogin telaLogin) {
		this.telaLogin = telaLogin;
	}

	public void control() {

		this.telaLogin.getAdicionarButton().addActionListener(new ButtonHundler());
		this.telaLogin.getRemoverButton().addActionListener(new ButtonHundler());
		this.telaLogin.getEditarButton().addActionListener(new ButtonHundler());
		this.telaLogin.getValidarButton().addActionListener(new ButtonHundler());
	}

	public class ButtonHundler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			UsuarioVO userVO = new UsuarioVO(telaLogin.getMascRadio().isSelected() ? "M" : "F",
					telaLogin.getLoginField().getText(), telaLogin.getSenhaField().getText());

			if (e.getSource() == telaLogin.getAdicionarButton()) {

				userVO.setLogin(telaLogin.getLoginField().getText());
				userVO.setSenha(telaLogin.getSenhaField().getText());

				try {
					if (userVO.getLogin().equals("") || userVO.getSenha().equals("")) {
						throw new CampoInvalidoException();
					}else {
					
					userVO.setSexo(telaLogin.getMascRadio().isSelected() ? "M" : "F");
					UsuarioDAO.adicionarUsuario(userVO);
					}

				} catch (Exception e2) {
				} // Botao Adicionar

				if (e.getSource() == telaLogin.getAdicionarButton()) {
					BaseDados.getUsuariosVO().remove(telaLogin.getLoginField().getText());
				}
			}
			// System.out.println(userVO.getLogin());

		}

	}

}

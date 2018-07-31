package segundava._300718.model.vo;

import segundava._300718.view.Mensagem;

public class CampoInvalidoException extends Exception{
	
	public CampoInvalidoException() {
		Mensagem.exibirMensagem("Campos Inválidos!");
	}
	
}
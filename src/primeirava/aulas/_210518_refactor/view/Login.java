package primeirava.aulas._210518_refactor.view;

/*
 * MVC com tratamenteo de Eventos na propria classe
 * */
public class Login extends Tela{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Login(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2, String nomeBotao3) {
		super(tituloJanela, x, y,nomeBotao1,nomeBotao2, nomeBotao3);
		
		setVisible(true);
		
	}

		
}


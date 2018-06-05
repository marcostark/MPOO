package primeirava.aulas._210518_refactor.view;

import javax.swing.JButton;

/*
 * MVC com tratamenteo de Eventos na propria classe
 * */
public class Login extends Tela{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton cadastrarButton;
	
	public Login(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2) {
		super(tituloJanela, x, y,nomeBotao1,nomeBotao2);
		
		control();
		setVisible(true);
		
	}
	
	public void control(){
		loadButtons();
		cadastrarButton = new JButton("Cadastrar");
		add(cadastrarButton);
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
}


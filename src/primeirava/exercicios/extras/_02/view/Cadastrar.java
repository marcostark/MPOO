package primeirava.exercicios.extras._02.view;

public class Cadastrar extends Tela{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cadastrar() {

		setTitle("Cadastrar");
		setSize(150,200);
		control();
		setVisible(true);
		
	}

	private void control() {
				
		add(getLoginLabel());
		add(getLoginField());
		
		add(getCpfLabel());
		add(getCpfField());
		
		add(getSenhaLabel());
		add(getSenhaPassField());
		
		add(getAdicionarButton());
		add(getSairButton());
	}

}

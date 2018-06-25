package primeirava.aulas.va1.view;

public class Cadastro extends Tela{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cadastro() {
		
		setTitle("Cadastrar");
		setSize(220,240);		
		control();
		setVisible(true);	
		
	}
	
	public void control() {
		
		add(getLoginLabel());
		add(getLoginField());
		add(getCpfLabel());
		add(getCpfField());
		add(getSenhaLabel());
		add(getSenhaField());
		
		add(getAddButton());
		add(getSairButton());
		
	}

}

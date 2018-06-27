package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view;

import javax.swing.JButton;

public class TelaMenu extends TelaBasica{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton cadastrarButton;
	private JButton validarButton;
	private JButton sairButton;
	
	public TelaMenu(int x, int y, String titulo) {
		super(x, y, titulo);
		
		control();
		setVisible(true);
		
	}
	
	private void control() {
		
		cadastrarButton = new JButton("Cadastrar");
		validarButton = new JButton("Validade");
		sairButton = new JButton("Sair");
		
		add(cadastrarButton);
		add(validarButton);
		add(sairButton);		
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getValidarButton() {
		return validarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}

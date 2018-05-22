package primeirava.aulas._210518.view;

import javax.swing.JButton;

public class Cadastro extends Login{

	private JButton exibirButton;
	private static final long serialVersionUID = 1L;
	
	public Cadastro(String tituloJanela, int x, int y, String nomeButao1, String nomeButao2) {
		super(tituloJanela, x, y, nomeButao1, nomeButao2);
		
		exibirButton = new JButton("Exibir");
		add(exibirButton);
		
		setVisible(true); // Erro de logica, implementar nas especializações
	}

	public JButton getExibirButton() {
		return exibirButton;
	}
}

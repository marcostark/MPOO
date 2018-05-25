package primeirava.aulas._210518.view;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Cadastro extends Login{
	
	private JRadioButton mascRadioButton;
	private JRadioButton femRadioButton;
	private ButtonGroup buttonGroup;

	private static final long serialVersionUID = 1L;
	
	public Cadastro(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2, String nomeBotao3) {
		super(tituloJanela, x, y, nomeBotao1, nomeBotao2, nomeBotao3);
			
		mascRadioButton = new JRadioButton("Masculino", false);
		femRadioButton = new JRadioButton("Feminino", false);
		
		add(mascRadioButton);
		add(femRadioButton);
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(mascRadioButton);
		buttonGroup.add(femRadioButton);
		
		//add(buttonGroup);		
		setVisible(true); // Erro de logica, implementar nas especializações
	}

	public JRadioButton getMascRadioButton() {
		return mascRadioButton;
	}

	public JRadioButton getFemRadioButton() {
		return femRadioButton;
	}
	
	
}

package primeirava.aulas._210518_refactor.view;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Cadastro extends Login{
	
	private JRadioButton mascRadioButton, femRadioButton;
	private JRadioButton gerenteRadioButton, caixaRadioButton;
	private ButtonGroup buttonGroupSexo;
	private ButtonGroup buttonGroupFuncao;

	private static final long serialVersionUID = 1L;
	
	public Cadastro(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2, String nomeBotao3) {
		super(tituloJanela, x, y, nomeBotao1, nomeBotao2, nomeBotao3);
			
		mascRadioButton = new JRadioButton("Masculino", false);
		femRadioButton = new JRadioButton("Feminino", false);
		
		gerenteRadioButton = new JRadioButton("Gerente", false);
		caixaRadioButton = new JRadioButton("Caixa", false);
		
		add(mascRadioButton);
		add(femRadioButton);
		add(gerenteRadioButton);
		add(caixaRadioButton);
		
		buttonGroupSexo = new ButtonGroup();
		buttonGroupSexo.add(mascRadioButton);
		buttonGroupSexo.add(femRadioButton);
		
		buttonGroupFuncao = new ButtonGroup();
		buttonGroupFuncao.add(gerenteRadioButton);
		buttonGroupFuncao.add(caixaRadioButton);
		
		//add(buttonGroup);		
		setVisible(false); // Erro de logica, implementar nas especializações
	}

	public JRadioButton getMascRadioButton() {
		return mascRadioButton;
	}

	public JRadioButton getFemRadioButton() {
		return femRadioButton;
	}
	
	
}

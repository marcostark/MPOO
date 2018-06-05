package primeirava.aulas._210518_refactor.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import primeirava.aulas._210518_refactor.controller.ControllerCadastro;

public class Cadastro extends Tela{
	
	private JRadioButton mascRadioButton, femRadioButton;
	private JRadioButton gerenteRadioButton, caixaRadioButton;
	private ButtonGroup buttonGroupSexo;
	private ButtonGroup buttonGroupFuncao;
	private JButton cadastrarButton;
	private JButton exibirButton;

	private static final long serialVersionUID = 1L;
	
	public Cadastro(String tituloJanela, int x, int y, String nomeBotao1, String nomeBotao2) {
		super(tituloJanela, x, y, nomeBotao1, nomeBotao2);
		
		setTitle("Cadastro");
		mascRadioButton = new JRadioButton("Masculino", true);
		femRadioButton = new JRadioButton("Feminino", false);
		
		gerenteRadioButton = new JRadioButton("Gerente", true);
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
		
		cadastrarButton = new JButton("Cadastrar");
		exibirButton = new JButton("Exibir");
		add(cadastrarButton);
		add(exibirButton);
		loadButtons();
		setVisible(true);
	}

	public JRadioButton getMascRadioButton() {
		return mascRadioButton;
	}

	public JRadioButton getFemRadioButton() {
		return femRadioButton;
	}
	
	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JRadioButton getGerenteRadioButton() {
		return gerenteRadioButton;
	}

	public JRadioButton getCaixaRadioButton() {
		return caixaRadioButton;
	}
		
	public JButton getExibirButton() {
		return exibirButton;
	}

	public static void main(String[] args) {
		
		new Cadastro("Login", 280,300, "Remover", "Sair");
		
		//BaseDados bd = new BaseDados();
		//ControllerCadastro controller = new ControllerCadastro(cad, bd);
		//controller.control();
		
	}
}

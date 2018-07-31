package segundava._300718.view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// Adicionar JComboBox para informar o estado

public class TelaLogin extends JFrame {

	private JLabel loginLabel;
	private JLabel senhaLabel;

	private JTextField loginField;
	private JPasswordField senhaField;
	private JTextField editarField; // Mostrar apenas se for pcd

	private JButton adicionarButton;
	private JButton validarButton;
	private JButton editarButton;
	private JButton removerButton;

	private ButtonGroup sexoGroup;

	private JRadioButton mascRadio;
	private JRadioButton femRadio;

	public TelaLogin() {
		super("Login");

		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);

		carregarComponentes();

		setVisible(true);
	}

	public void carregarComponentes() {

		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("Senha");

		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);

		mascRadio = new JRadioButton("Masc", true);
		femRadio = new JRadioButton("Fem");

		adicionarButton = new JButton("Add");
		validarButton = new JButton("Validar");
		editarButton = new JButton("Buscar/Editar");
		removerButton = new JButton("Remover");
		// Ao buscar abrir tela com os dados para atualização

		sexoGroup = new ButtonGroup();
		sexoGroup.add(mascRadio);
		sexoGroup.add(femRadio);

		add(loginLabel);
		add(loginField);

		add(senhaLabel);
		add(senhaField);

		add(mascRadio);
		add(femRadio);

		add(adicionarButton);
		add(validarButton);
		add(editarButton);
		add(removerButton);
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JTextField getEditarField() {
		return editarField;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JButton getValidarButton() {
		return validarButton;
	}

	public JButton getEditarButton() {
		return editarButton;
	}

	public JButton getRemoverButton() {
		return removerButton;
	}

	public ButtonGroup getSexoGroup() {
		return sexoGroup;
	}

	public JRadioButton getMascRadio() {
		return mascRadio;
	}

	public JRadioButton getFemRadio() {
		return femRadio;
	}
	
	

}

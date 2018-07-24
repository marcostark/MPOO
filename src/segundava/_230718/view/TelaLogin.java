package segundava._230718.view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
	
	private JLabel loginLabel;
	private JLabel senhaLabel;
	
	private JTextField loginField;
	private JTextField senhaField;
	private JTextField editarField; // Mostrar apenas se for pcd
	
	private JButton adicionarButton;
	private JButton validarButton;
	private JButton editarButton;
	
	private ButtonGroup pcdGroup;
	
	private JRadioButton pcdRadio;
	private JRadioButton semPcdRadio;
	
	public TelaLogin() {
		super("Login");
		
		setSize(200,200);
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
		senhaField = new JTextField(10);
		
		pcdRadio = new JRadioButton("PCD");
		semPcdRadio = new JRadioButton("Sem PCD");
		
		adicionarButton = new JButton("Add");
		validarButton = new JButton("Validar");
		editarButton = new JButton("Buscar/Editar");
		// Ao buscar abrir tela com os dados para atualização
		
		pcdGroup = new ButtonGroup();
		pcdGroup.add(pcdRadio);
		pcdGroup.add(semPcdRadio);
		
		add(loginLabel);
		add(loginField);
		
		add(senhaLabel);
		add(senhaField);
		
		add(pcdRadio);
		add(semPcdRadio);
		
		add(adicionarButton);
		add(validarButton);
		add(editarButton);
		
	}

}


package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends TelaBasica{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel nomeLabel;
	private JLabel precoLabel;
	private JLabel validadeLabel;
	
	private JTextField nomeField;
	private JTextField precoField;
	private JFormattedTextField validadeField;
	
	private ButtonGroup tipoGroup;
	private JRadioButton perecivelRadio;
	private JRadioButton naoPerecivelRadio;
	
	private JButton addButton;
	private JButton sairButton;

	public TelaCadastro(int x, int y, String titulo) {
		super(x, y, titulo);
		
		control();
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(false);
	}
	
	private void control() {
		
		nomeLabel = new JLabel("Nome");
		precoLabel = new JLabel("Preço");
		validadeLabel = new JLabel("Validade");
		
		nomeField = new JTextField(10);
		precoField = new JTextField(10);
		validadeField = new JFormattedTextField(new 
				SimpleDateFormat("yyyy.MM.dd"));
		
		validadeField.setValue(new java.util.Date());
		
		perecivelRadio = new JRadioButton("Perecível");
		naoPerecivelRadio = new JRadioButton("Não Perecível");
		tipoGroup = new ButtonGroup();
		tipoGroup.add(perecivelRadio);
		tipoGroup.add(naoPerecivelRadio);
		
		addButton = new JButton("Add");
		sairButton = new JButton("Sair");

		add(nomeLabel);
		add(nomeField);
		
		add(precoLabel);
		add(precoField);
		
		add(validadeLabel);
		add(validadeField);
		
		add(perecivelRadio);
		add(naoPerecivelRadio);
		
		add(addButton);
		add(sairButton);
		
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public void setPrecoField(JTextField precoField) {
		this.precoField = precoField;
	}

	public JTextField getValidadeField() {
		return validadeField;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}
}


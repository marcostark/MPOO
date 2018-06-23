package primeirava.aulas.revisao.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Banco extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel contaOrigemLabel;
	private JLabel numeroOrigemLabel;
	private JLabel saldoOrigemLabel;	
	private JTextField numeroOrigemField;
	private JTextField saldoOrigemField;
	
	private JLabel contaDestinoLabel;
	private JLabel saldoDestinoLabel;
	private JLabel numeroDestinoLabel;
	private JTextField numeroDestinoField;
	private JTextField saldoDestinoField;
	
	private JButton confirmarButton;
	
	public Banco() {
		super("Sistema Bancario");
		
		setSize(150,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		control();
		setVisible(true);
	}
	
	private void control() {
		
		contaOrigemLabel = new JLabel("Conta (Origem)");
		numeroOrigemLabel = new JLabel("Numero");
		saldoOrigemLabel = new JLabel("Saldo");
		numeroOrigemField = new JTextField(10);
		saldoOrigemField = new JTextField(10);
		
		contaDestinoLabel = new JLabel("Conta (Destino)");
		numeroDestinoLabel = new JLabel("Numero");
		saldoDestinoLabel = new JLabel("Saldo");
		numeroDestinoField = new JTextField(10);
		saldoDestinoField = new JTextField(10);
		saldoDestinoField.setEditable(false);
		
		confirmarButton = new JButton("Confirmar");
		
		add(contaOrigemLabel);
		add(numeroOrigemLabel);
		add(numeroOrigemField);
		add(saldoOrigemLabel);
		add(saldoOrigemField);
		
		add(contaDestinoLabel);
		add(numeroDestinoLabel);
		add(numeroDestinoField);
		add(saldoDestinoLabel);
		add(saldoDestinoField);
		
		add(confirmarButton);		
	}

	public JTextField getNumeroOrigemField() {
		return numeroOrigemField;
	}

	public void setNumeroOrigemField(JTextField numeroOrigemField) {
		this.numeroOrigemField = numeroOrigemField;
	}

	public JTextField getNumeroDestinoField() {
		return numeroDestinoField;
	}

	public void setNumeroDestinoField(JTextField numeroDestinoField) {
		this.numeroDestinoField = numeroDestinoField;
	}

	public JTextField getSaldoDestinoField() {
		return saldoDestinoField;
	}

	public void setSaldoDestinoField(JTextField saldoDestinoField) {
		this.saldoDestinoField = saldoDestinoField;
	}

	public JTextField getSaldoOrigemField() {
		return saldoOrigemField;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}
}


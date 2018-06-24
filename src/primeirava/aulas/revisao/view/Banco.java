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
	private JLabel numeroDestinoLabel;
	private JLabel saldoDestinoLabel;	
	private JTextField numeroDestinoField;
	private JTextField saldoDestinoField;
	
	private JButton confirmarButton;
	
	
	public Banco() {
		super("Banco");
		
		setSize(150,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		control();
		setVisible(true);
		
	}
	
	private void control() {
		
		// Conta origem
		contaOrigemLabel = new JLabel("Conta (Origem)");
		numeroOrigemLabel = new JLabel("Numero: ");
		saldoOrigemLabel = new JLabel("Saldo: ");
		
		numeroOrigemField = new JTextField(10);
		saldoOrigemField = new JTextField(10);		
		
		//Conta destino		
		contaDestinoLabel = new JLabel("Conta (Destino)");
		numeroDestinoLabel = new JLabel("Numero: ");
		saldoDestinoLabel = new JLabel("Saldo: ");
		
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

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public JLabel getContaOrigemLabel() {
		return contaOrigemLabel;
	}

	public JLabel getNumeroOrigemLabel() {
		return numeroOrigemLabel;
	}

	public JLabel getSaldoOrigemLabel() {
		return saldoOrigemLabel;
	}

	public JTextField getNumeroOrigemField() {
		return numeroOrigemField;
	}

	public JTextField getSaldoOrigemField() {
		return saldoOrigemField;
	}

	public JLabel getContaDestinoLabel() {
		return contaDestinoLabel;
	}

	public JLabel getNumeroDestinoLabel() {
		return numeroDestinoLabel;
	}

	public JLabel getSaldoDestinoLabel() {
		return saldoDestinoLabel;
	}

	public JTextField getNumeroDestinoField() {
		return numeroDestinoField;
	}

	public JTextField getSaldoDestinoField() {
		return saldoDestinoField;
	}	
}


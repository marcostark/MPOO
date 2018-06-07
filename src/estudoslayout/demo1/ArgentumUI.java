package estudoslayout.demo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ArgentumUI extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel painelBotoes;
	private JPanel painelPrincipal;
	private JFrame janela;
	private JTable table;
	private JTabbedPane abas;

	public void montaTela() {
		preparaJanela();
		preparaPainelPrincipal();
		
		preparaAbas(); //Separar em abas
		
		preparaTitulo();
		preparaTabela();
		preparaPainelBotoes();
		preparaBotaoCarregar();
		preparaBotaoSair();
		mostraJanela();
	}
	
	private void preparaAbas() {
		abas = new  JTabbedPane();
		abas.addTab("Tabela", null);
		abas.addTab("Gráfico", null);
		
		painelPrincipal.add(abas);
	}
	private void preparaTitulo() {
		JLabel titulo = new JLabel("Lista de Négocios",
				SwingConstants.CENTER);
		titulo.setFont(new Font("Verdana", Font.BOLD, 25));
		
		painelPrincipal.add(titulo, BorderLayout.NORTH); // Norte da tela
	}
	private void preparaBotaoSair() {
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		painelBotoes.add(botaoSair);		
	}

	private void preparaBotaoCarregar() {
		JButton botaoCarregar = new JButton("Carregar XML");
		botaoCarregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				NegociosTableModel ntm = new NegociosTableModel();
				table.setModel(ntm);
			}
		});
		painelBotoes.add(botaoCarregar);
	}

	private void preparaPainelBotoes() {
		painelBotoes = new JPanel(new GridLayout());
		painelPrincipal.add(painelBotoes, BorderLayout.SOUTH); //Adicionando na região sul da tela
	}

	private void preparaTabela() {
		table = new JTable();
//		
//		// por padrão virá sem bordas, por isso é necessario coloca-las
		table.setBorder(new LineBorder(Color.black));
		table.setGridColor(Color.black);
		table.setShowGrid(true);

		// um Jtable não tem comportamento de rolagem para tableas muitos grandes
		// Adicionando atravéz de um JScrollPane
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().setBorder(null);
		scroll.getViewport().add(table);
		scroll.setSize(450,450);
		
		//painelPrincipal.add(scroll, BorderLayout.CENTER); // Adicionando ao centro da tela
		//Adicionando tabela na primeira aba
		abas.setComponentAt(0, scroll);
	}

	private void preparaPainelPrincipal() {
		try {
			javax.swing.UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		janela.add(painelPrincipal);
	}

	private void preparaJanela() {
		janela = new JFrame("Argentum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(540,540);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ArgentumUI().montaTela();
	}

}

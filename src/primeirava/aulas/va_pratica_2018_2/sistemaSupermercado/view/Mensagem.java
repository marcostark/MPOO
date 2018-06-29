package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.model.Produto;

public class Mensagem {
	
	public static void exibirMensagem(ArrayList<Produto> produtos) {
		JOptionPane.showMessageDialog(null, "O(s)"
				+ "produto(s) " + produtos + " está(ão)"
						+ "vencido(s)");
	}

}

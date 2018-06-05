package primeirava.aulas._040618.view;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static void exibirMensagem(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	
	public static void exibirMensagemConsole(String s) {
		System.out.println(s);
	}
}

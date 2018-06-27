package primeirava.aulas.va_pratica_2018_2.sistemaSupermercado.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaBasica extends JFrame{
	
	public TelaBasica(int x, int y, String titulo) {
		super(titulo);
		
		setSize(x,y);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
}

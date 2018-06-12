package primeirava.aulas._110618.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaAtendimento extends JFrame implements Observer{
    
    private JLabel label;

    public TelaAtendimento(String titulo, String text){
        super (titulo);                                    
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        setSize(250,100);        
        
        label = new JLabel(text);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        add(label, BorderLayout.CENTER);
        
        
        setVisible(true);
    }

    // Atualiza a tela
    public void setText(String text){
        label.setText(text);
    }

    // Atualiza a tela de acordo com a modificação do observador
	public void update(Observable o, Object obj) {
		setText(""+obj);
	}
}
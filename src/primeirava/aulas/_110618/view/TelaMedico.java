package primeirava.aulas._110618.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMedico extends JFrame implements Observer{
    
    private JLabel label;
    
    private JButton button;

    public TelaMedico(String titulo, String text){
        super (titulo);                                    
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        setSize(250,100);        
        
        label = new JLabel(text);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(Color.RED);
        add(label, BorderLayout.CENTER);

        button = new JButton("incrementar");        
        add(button, BorderLayout.SOUTH);
        
        setVisible(true);
    }
        
    public JButton getButton(){
        return button;
    }
    
    // Não utilizar os componentes graficos no controle,
    // criar um metodo que recebe um parametro para modificar os componentes
    public void setText(String text){
        label.setText(text); // Poderia ser outro tipo de componente
    }

	public void update(Observable o, Object obj) {
		setText(""+obj);
	}
}
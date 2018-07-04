package segundava.aulas._020718.jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jogo extends JFrame implements ActionListener{

	private JLabel back;//atributo para background
	private JButton start,exit;
	private Som audio;

	public Jogo(){
		super("Minicurso Jogos com Swing");

		Icon background = new ImageIcon(getClass().getResource("background.gif"));

		back=new JLabel(background);
		start = new JButton("Jogar");
		exit = new JButton("Sair");

		//�udio da aplica��o
		audio = new Som();
		audio.aberturaSom();

		start.setBounds(60,200,80,40);
		exit.setBounds(150,200,80,40);
		back.setBounds(1,1,300,300);

		back.add(start);
		back.add(exit);
		
		add(back);
		
		 
		start.addActionListener(this);
		exit.addActionListener(this);

		setSize(300,300);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main (String [] args){
		new Jogo();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start){
			setVisible(false);
			audio.aberturaSomParar();
			new Fase1();
		}

		if(e.getSource()==exit)
			System.exit(0);
	}
}
package primeirava.aulas.va1.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Tela implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Menu() {
		
		setTitle("Menu");
		setSize(400,100);
		control();
		setVisible(true);
		
	}
	
	public void control() {
		
		this.getAddButton().setText("Logar");
		
		this.getCadastrarButton().addActionListener(this);
		this.getAddButton().addActionListener(this);
		
		
		this.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sair do Sistema");
			}
		});
		
		add(getCadastrarButton());
		add(getAddButton());
		add(getSairButton());
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.getCadastrarButton()) {
			System.out.println("Cadastrar");
		}
		if(e.getSource() == this.getAddButton()) {
			System.out.println("Logar");
		}
	}
	
	

}

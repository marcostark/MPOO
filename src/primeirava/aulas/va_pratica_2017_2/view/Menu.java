package primeirava.aulas.va_pratica_2017_2.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import primeirava.aulas.va_pratica_2017_2.controller.CadastroController;
import primeirava.aulas.va_pratica_2017_2.controller.LoginController;
import primeirava.exercicios.extras._02.view.Cadastrar;

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
				System.exit(0);
			}
		});
		
		add(getCadastrarButton());
		add(getAddButton());
		add(getSairButton());
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.getCadastrarButton()) {
			Cadastro cadastro = new Cadastro();
			new CadastroController(cadastro).control();
		}
		if(e.getSource() == this.getAddButton()) {
			new LoginController(new Login()).control();
		}
	}
	
	

}

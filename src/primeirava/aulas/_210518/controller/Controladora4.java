package primeirava.aulas._210518.controller;

import primeirava.aulas._210518.view.Login;

// MVC tratamento de evento em classe interna
public class Controladora4 {

	/* 
	 * Os models e views são atributos do controlador,
	 * depende da aplicação, se serão criados aqui ou não
	 *  
	 * Usando a classe ButtonHundler para tratar os eventos dos botões
	 * Metodo pouco usado e um pouco trabalhoso, uma vez que temos que 
	 * ficar enviando e recebendo objetos entre classes (Composição), 
	 * além de ter que criar outra classe. 
	 * */
	
	private Login login;
	private ButtonHundler hundler;
	
	public Controladora4(Login login) {
		this.login = login;
		// Poderia ser passado apenas a classe login
		hundler = new ButtonHundler(login, login.getConfirmarButton(), login.getSairButton());
		this.control();
	}
	
	public void control() {		
		
		login.getConfirmarButton().addActionListener(hundler);
		login.getSairButton().addActionListener(hundler);
		
	}	
	
}

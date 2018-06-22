package primeirava.exercicios.extras._01;

public class Teste4 {
	
	public Teste4() {
	}
	
	public class Usuario {
		String login;
		String senha;
	}
	
	public static void main(String[] args) {
		// Não é aceito o uso do modificador Static dentro de um main
		//static Teste4 teste = new Teste4();
		
		//Usuario teste = new Usuario();// O acesso ao Usuario é apenas dentro da classe principal
		
		// Só terá acesso ao Usuario pela classe principal
		Usuario usr = new Teste4().new Usuario();
		System.out.println(usr.login);

		//Teste4 teste = new Teste4();
		
		
	}
}


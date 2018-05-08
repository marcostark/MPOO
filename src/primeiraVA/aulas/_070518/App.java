package primeiraVA.aulas._070518;

public class App {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Marcos", 1000);
		Caixa caixa = new Caixa("Patricia", 1000);
		
		/*
		* Fazendo com o que o objeto retroceda e tenha 
		*apenas os comportamentos da classe pai 
		*
		*Funcionario ger = new Gerente("Adriano");
		*
		**/
		
		gerente.darDesconto();
		caixa.vender();
				
	}
}

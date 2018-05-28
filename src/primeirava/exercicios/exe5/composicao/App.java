package primeirava.exercicios.exe5.composicao;

public class App {
	
	// Veja que é possivél instanciar as partes sem o todo.
	Porta porta = new Porta("Preto");
	Motor motor = new Motor(1.6);
	
	
	public static void main(String[] args) {
		
		/*
		 * Quando o todo desaparece, todas as
		 * partes também desaparecem”
		 * Não é possivél ter acesso as partes se não for
		 * atravez do todo.
		 * 
		 * */
		
		Carro carro = new Carro("Camaro","Amarelo",1.6);
		System.out.println(carro);
		
		
		// Acessando as partes sem o todo atravez do objeto app sem ser atravez do objeto carro
		/*Uma solução para que isso não ocorra pode ser usando classe interna anônima, onde porta e motor
		* estãrão na classe carro, ou forçar o uso do todo no construtor da parte */
		App app = new App();
		
		System.out.println("\nPorta: " + app.porta);
		System.out.println("Motor: " + app.motor);
		
		
		// Usando classe interna anônima
		CarroComposicao2 carroComp2 = new CarroComposicao2("Camaro","Amarelo",1.6);
		System.out.println("\nUsando classe interna anônima");
		System.out.println(carroComp2);
		// Só o todo tem acesso as partes
		System.out.println(carroComp2.getMotor());
		
		
		// Forçando o uso do todo no construtor das partes - VER APPCOMPOSICAO3
		
		
		
	}
}

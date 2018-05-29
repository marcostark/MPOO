package primeirava.exercicios.exe5.agregacao;

public class App {
	
	public static void main(String[] args) {
		
		/*
		 * As partes existem sem o todo, ou seja, as partes são instanciadas
		 * de forma independentes
		 * */
		
		Porta portaEsq = new Porta("Preto");
		Porta portaDir = new Porta("Preto");
		
		Motor motor = new Motor(2.0);
		
		Carro carro = new Carro("Camaro", "Preto", portaEsq, portaDir, motor);
		
		System.out.println(carro);
		
	}
}

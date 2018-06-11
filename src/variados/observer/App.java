package variados.observer;

public class App {
	
	public static void main(String[] args) {
		
		// Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		
		// Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		
		// Adicionando o observador ao observado
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.direita();
		carroRoubado.para();
	}
}

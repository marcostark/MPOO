package variados.observer;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro{

	// Objeto observado
	private String acao = "";
	
	@Override
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado segue em frente");
		this.mudaEstado();
	}

	@Override
	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado segue para a direita");
		this.mudaEstado();		
	}

	@Override
	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado segue para a esquerda");
		this.mudaEstado();		
	}

	@Override
	public void para() {
		acao = "para";
		System.out.println("Carro roubado parou");
		this.mudaEstado();		
	}
	
	/*
	 * Notificando que executou uma ação
	 * ao objeto observador
	 * */
	private void mudaEstado() {
		setChanged(); // Mudança de estado
		notifyObservers(acao); // Notifica aos observadores
	}
}

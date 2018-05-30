package variados.caelumfj11;

public class Carro {
	
	private boolean ligado;
	private String cor;
	private String modelo;
	private Motor motor;
	
	// Serão manipulado através do método acelerar
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	
	public Carro() {}
	public Carro(String cor, String modelo, int velocidadeMaxima, Motor motor) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;
	}
	
	public void liga() {
		System.out.println("Carro ligado!");
	}
	
	public void acelera(int quantidade) {
		this.velocidadeAtual += quantidade;				
	}
	
	public int passaMarcha() {
		if(this.velocidadeAtual < 0) {		
			return -1;
		}
		if(this.velocidadeAtual > 0 && this.velocidadeAtual <=40) {
			return 1;
		}
		if(this.velocidadeAtual > 40 && this.velocidadeAtual <=80) {
			return 1;
		}
		return 3;	
		
	}
	
	// Getters and Setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public Motor getMotor() {
		return motor;
	}
	
	
	

}

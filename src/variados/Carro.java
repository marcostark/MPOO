package variados;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	
	public Carro(String marca, String modelo, String cor, double velocidadeMaxima, double velocidadeAtual) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void acelerar(int vel) {
		this.velocidadeAtual += vel;
	}
	
	public void ligaDesliga() {
		
	}
	
	
	
}

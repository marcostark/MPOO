package primeirava.exercicios.exe5.composicao;

import primeirava.exercicios.exe5.agregacao.Motor;
import primeirava.exercicios.exe5.agregacao.Porta;

public class CarroComposicao2 {
	
	/*
	 * Usando classe interna anônima para garantir a composição, fazendo com que 
	 * nenhuma outra classe faça isso das partes sem ser atravéz do todo
	 * */
	
	private String nome;
	private String cor;
	private Motor motor;
	private Porta porta;
	
	
	public CarroComposicao2(String nome, String cor, double potencia) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.porta = new Porta(cor);
		this.motor = new Motor(potencia);
	}
	
	private class Motor {
		
		private double potencia;

		public Motor(double potencia) {
			super();
			this.potencia = potencia;
		}

		public double getPotencia() {
			return potencia;
		}

		public void setPotencia(double potencia) {
			this.potencia = potencia;
		}

		@Override
		public String toString() {
			
			return "Potencia: " + this.potencia;
		}
	}
	
	private class Porta {
		
		private String cor;

		public Porta(String cor) {
			super();
			this.cor = cor;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}
		
		@Override
		public String toString() {
			return "Porta (Cor): " + this.getCor();
		}
	}
	
	// Metodos de acesso para acessar as partes
	
	
	@Override
	public String toString() {
		return "Modelo: " + this.nome + "\nCor: " + this.cor + "\nMotor (Potencia): " + this.motor.toString();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Porta getPorta() {
		return porta;
	}

	public void setPorta(Porta porta) {
		this.porta = porta;
	}

}

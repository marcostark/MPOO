package primeirava.exercicios.exe5.composicao;

import primeirava.exercicios.exe5.agregacao.Motor;
import primeirava.exercicios.exe5.agregacao.Porta;

public class Carro {
	
	private String nome;
	private String cor;
	private Motor motor;
	private Porta portaEsq;
	private Porta portaDir;
	
	
	public Carro(String nome, String cor, double potencia) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.portaEsq = new Porta(cor);
		this.portaDir = new Porta(cor);
		this.motor = new Motor(potencia);
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.nome + "\nCor: " + this.cor + "\nMotor (Potencia): " + this.motor.toString();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public Porta getPortaEsq() {
		return portaEsq;
	}


	public void setPortaEsq(Porta portaEsq) {
		this.portaEsq = portaEsq;
	}


	public Porta getPortaDir() {
		return portaDir;
	}


	public void setPortaDir(Porta portaDir) {
		this.portaDir = portaDir;
	}
	
	
	

}

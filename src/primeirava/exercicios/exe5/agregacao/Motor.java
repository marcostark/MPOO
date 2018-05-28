package primeirava.exercicios.exe5.agregacao;

public class Motor {
	
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

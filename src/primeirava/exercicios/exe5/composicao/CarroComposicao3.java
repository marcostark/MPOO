package primeirava.exercicios.exe5.composicao;

public class CarroComposicao3 {
	
	String nome;
	MotorComposicao3 motor;
	PortaComposicao3 porta [] = new PortaComposicao3[5];
	
	public CarroComposicao3(String nome) {
		super();
		this.nome = nome;
		this.motor = new MotorComposicao3(this);
		for(int i = 0; i < porta.length; i++)
		this.porta[i] = new PortaComposicao3(this);
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.nome + "\n" + this.motor.toString();
	}
}

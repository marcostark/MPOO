package primeirava.exercicios.exe5.composicao;

public class MotorComposicao3 {
	
	double potencia;

	public MotorComposicao3(CarroComposicao3 carro) {}
	
	public MotorComposicao3(double pot, CarroComposicao3 carro) {
		carro.motor.potencia = pot;		
	}
	
	@Override
	public String toString() {
		
		return "Potencia: " + this.potencia;
	}

}

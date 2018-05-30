package variados.caelumfj11;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Motor motor = new Motor(2.0);
		
		Carro carro = new Carro("Preto","EcoSport",200, motor);
		carro.liga();
		carro.acelera(80);
		System.out.println(carro.getVelocidadeAtual());
		System.out.println("Potencia: " + carro.getMotor().getPotencia());
		
	}

}

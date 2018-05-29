package primeirava.exercicios.exe5.composicao;

public class PortaComposicao3 {
	
	String cor;

	public PortaComposicao3(CarroComposicao3 carro) {}
	
	public PortaComposicao3(String cor, int indicePorta, CarroComposicao3 carro) {
		carro.porta[indicePorta].cor = cor;
	}

	@Override
	public String toString() {
		return "Porta (Cor): " + this.cor;
	}


}

package primeirava.exercicios.exe5.composicaocorpohumano;

public class Mao {

	double peso;
	Dedo dedo;
	
	public Mao(Braco braco) {}
	public Mao(Corpo corpo) {}
	
	public Mao(double peso, Braco braco) {
		dedo = new Dedo(this);
		braco.mao.peso = peso;
	}
	
	public Mao(double peso, Corpo corpo) {
		dedo = new Dedo(this);
		corpo.braco.mao.peso = peso;
	}

}

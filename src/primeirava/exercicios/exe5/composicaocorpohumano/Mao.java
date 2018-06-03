package primeirava.exercicios.exe5.composicaocorpohumano;

public class Mao {

	double peso;
	Dedo dedo;
	
	public Mao(Braco braco) {}
	
	public Mao(double peso, Braco braco) {
		braco.mao.peso = peso;
		dedo = new Dedo(this);
	}
}

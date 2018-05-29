package primeirava.exercicios.exe5.composicaocorpohumano;

public class Braco {

	double peso;
	Mao mao;
	Dedo dedo;
//	Mao maoEsquerda;
		
	public Braco(Corpo corpo) {}
	public Braco(double peso, Corpo corpo) {
		corpo.braco.peso = peso;		
//		dedo = new Dedo(this);
		mao = new Mao(this);
	}

}

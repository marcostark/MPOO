package primeirava.exercicios.exe5.composicaocorpohumano;

public class Braco {

	double peso;
	Mao mao;	

	public Braco(Corpo corpo) {}
	
	public Braco(Braco braco, Mao mao) {
		braco.mao = mao;
	}
}

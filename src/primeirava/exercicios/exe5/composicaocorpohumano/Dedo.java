package primeirava.exercicios.exe5.composicaocorpohumano;

public class Dedo {
	
	double peso;
	
	public Dedo(Mao mao) {}
	public Dedo(Braco braco) {}
	
	public Dedo(double peso,Mao mao) {
		mao.dedo.peso = peso;
	}	
}

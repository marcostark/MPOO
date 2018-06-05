package primeirava.exercicios.exe5.composicaocorpohumano;

public class Dedo {
	
	double peso;
	
	public Dedo(Mao mao) {}
	
	public Dedo(Mao mao,double peso) {
		mao.dedo.peso = peso;
	}
}

package primeirava.exercicios.exe5.composicaocorpohumano;

public class Braco {

	double peso;
	Mao mao;	
//	Mao maoEsquerda;
		
	//public Braco(Corpo corpo) {}
	public Braco(double peso) {
		this.mao = new Mao(this);
		this.peso = peso;
		
		
	}

}

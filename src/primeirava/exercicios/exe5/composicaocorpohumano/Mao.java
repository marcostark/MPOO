package primeirava.exercicios.exe5.composicaocorpohumano;

public class Mao {

	double peso;
	Dedo dedo;
	
	public Mao() {
		this.dedo = new Dedo(this);
	}
	
	public Mao(Braco braco) {
		this.dedo = new Dedo(this);
	}
	
	//public Mao(double peso, Braco braco) {
		//braco.mao.peso = peso;
		//this.dedo = new Dedo(this);
	//}
}

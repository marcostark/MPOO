package primeirava.exercicios.exe5.composicaocorpohumano;

public class Corpo {

	Braco braco;
	double peso;
		
//	public Corpo(Braco braco) {}
	public Corpo(double peso) {
		this.peso = peso;
		braco = new Braco(this);
		
	}	

}

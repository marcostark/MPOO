package primeirava.exercicios.exe5.composicaocorpohumano;

public class Perna {

	double peso;
	Pe peEsquerdo;
	Pe peDireito;
	
	public Perna(Corpo corpo) {}
	public Perna(double peso) {
		this.peso = peso;
		peEsquerdo = new Pe(this);
		peDireito = new Pe(this);
	}

}

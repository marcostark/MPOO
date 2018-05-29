package primeirava.exercicios.exe5.composicaocorpohumano;

public class Pe {

	double peso;
	Dedo dedo;
	
	public Pe(Perna perna) {}
	public Pe(double peso, Perna perna) {
//		dedo = new Dedo(this);
		perna.peDireito.peso = peso;
		perna.peEsquerdo.peso = peso;
				
	}

}

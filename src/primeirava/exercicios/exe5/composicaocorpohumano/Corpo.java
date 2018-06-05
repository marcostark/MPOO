package primeirava.exercicios.exe5.composicaocorpohumano;

public class Corpo {

	Braco braco;
			
	public Corpo() {
		this.braco = new Braco(this);
	}
	
	public Corpo(Corpo corpo, Braco braco) {
		corpo.braco = braco;
	}

}

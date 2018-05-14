package primeirava.exercicios.exe3;

public class Cachorro extends Animal implements Irracional {

	public Cachorro(String nome) {
		super(nome);		
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo");
		
	}

	@Override
	public void andar() {
		System.out.println("Quadrupede");		
	}

}
